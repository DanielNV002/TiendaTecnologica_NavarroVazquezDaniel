package com.mycompany.tiendatecnologica;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BBDD {
    
    String url = "jdbc:sqlite:tienda.db";
    
    public static Connection obtenerConexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/miBaseDeDatos"; // URL de la base de datos

        // Establecer la conexión con la base de datos
        return DriverManager.getConnection(url);
    }
    
    public void lanzarBBDD() {
        try (Connection conn = DriverManager.getConnection(url)) {
            // Crear tabla si no existe
            String createTableSQL = "CREATE TABLE IF NOT EXISTS categorias (" +
                    "id INTEGER PRIMARY KEY," +
                    "nombre TEXT NOT NULL," +
                    "id_productos INTEGER NOT NULL)";
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(createTableSQL);
                System.out.println("Tabla 'categorias' creada o ya existe.");
            }

            // Leer datos del JSON
            JSONParser jsonParser = new JSONParser();
            try (FileReader reader = new FileReader("src/main/resources/Tienda.json")) {
                // Parsear el archivo JSON
                Object obj = jsonParser.parse(reader);

                // Convertir el objeto principal a JSONObject
                JSONObject tienda = (JSONObject) obj;

                // Obtener las categorías desde el objeto "tienda"
                JSONArray categorias = (JSONArray) ((JSONObject) tienda.get("tienda")).get("categorias");

                // Comprobar si las categorías son nulas
                if (categorias == null) {
                    System.out.println("No se encontraron categorías en el archivo JSON.");
                    return;
                }

                // Insertar datos de cada categoría
                String insertSQL = "INSERT INTO categorias (id, nombre, id_productos) VALUES (?,?,?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                    for (Object categoriaObj : categorias) {
                        JSONObject categoria = (JSONObject) categoriaObj;
                        int id = ((Long) categoria.get("id")).intValue();
                        String nombre = (String) categoria.get("nombre");

                        // Aquí, asumimos que la categoría tiene un campo de productos. 
                        // Si quieres insertar IDs de productos en 'id_productos', puedes hacerlo así:
                        JSONArray productos = (JSONArray) categoria.get("productos");

                        // Aquí agregamos el ID de los productos, por ejemplo, el primero.
                        // Si es necesario agregar más de uno, podrías almacenar los IDs como un solo string separado por comas
                        int idProducto = 0;  // Si necesitas referenciar un producto en particular

                        if (productos != null && !productos.isEmpty()) {
                            JSONObject producto = (JSONObject) productos.get(0);  // Tomamos el primer producto como ejemplo
                            idProducto = ((Long) producto.get("id")).intValue();
                        }

                        // Insertar la categoría con el ID del primer producto
                        pstmt.setInt(1, id);
                        pstmt.setString(2, nombre);
                        pstmt.setInt(3, idProducto);
                        pstmt.executeUpdate();
                        System.out.println("Categoría '" + nombre + "' insertada con éxito.");
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error al leer el archivo JSON o insertar los datos.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos.");
        }
    }
    
    static void getCategorias(){
        // Consulta SQL para obtener las categorías
        String consultaGET = "SELECT id, nombre, id_productos FROM categorias";
        
        try (Connection conn = BBDD.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(consultaGET)) {
             
            // Procesar el resultado de la consulta
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                int id_productos = rs.getInt("id_productos");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + id_productos);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}