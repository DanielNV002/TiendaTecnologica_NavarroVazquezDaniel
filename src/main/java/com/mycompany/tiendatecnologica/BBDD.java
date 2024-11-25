package com.mycompany.tiendatecnologica;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class BBDD {
    
    String url = "jdbc:sqlite:tienda.db";
    
    public static Connection obtenerConexion() throws SQLException {
        String url = "jdbc:sqlite:tienda.db";  // URL de SQLite, que ya está definida correctamente.
        return DriverManager.getConnection(url);
    }
    
    public void lanzarBBDD() {
        
        File dbFile = new File("tienda.db");
        if (dbFile.exists()) {
            dbFile.delete(); // Eliminar el archivo de la base de datos existente
            System.out.println("Base de datos eliminada.");
        } else {
            System.out.println("No existe ninguna base de datos previamente.");
        }
            
            
        try (Connection conn = DriverManager.getConnection(url)) {
            
            // Crear la tabla de categorias si no existe
            String createTableSQLCat = "CREATE TABLE IF NOT EXISTS categorias (" +
                    "id INTEGER NOT NULL," +
                    "nombre TEXT NOT NULL)";
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(createTableSQLCat);
                System.out.println("Tabla 'categorias' creada o ya existe.");
            }
            
            //Crear tabla de productos si no existe
            String createTableSQLPro = "CREATE TABLE IF NOT EXISTS productos (" +
                    "    id INTEGER NOT NULL," +
                    "    nombre TEXT NOT NULL," +
                    "    precio REAL NOT NULL," +
                    "    descripcion TEXT," + 
                    "    inventario INTEGER NOT NULL)";
            try (Statement stmt = conn.createStatement()){
                stmt.execute(createTableSQLPro);
                System.out.println("Tabla 'productos' creada o ya existe.");
            }
            
            // Crear la tabla de caracteristicas si no existe
            String createTableSQLCaracc = "CREATE TABLE IF NOT EXISTS caracteristicas (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "producto_id INTEGER NOT NULL," +
                    "clave TEXT NOT NULL," +
                    "valor TEXT NOT NULL," +
                    "FOREIGN KEY (producto_id) REFERENCES productos(id))";
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(createTableSQLCaracc);
                System.out.println("Tabla 'caracteristicas' creada o ya existe.");
            }
            
            // Crear la tabla de imagenes si no existe
            String createTableSQLImg = "CREATE TABLE IF NOT EXISTS imagenes (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "producto_id INTEGER NOT NULL," +
                    "imagen_url TEXT NOT NULL," +
                    "FOREIGN KEY (producto_id) REFERENCES productos(id))";
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(createTableSQLImg);
                System.out.println("Tabla 'caracteristicas' creada o ya existe.");
            }
            
            //Crear tabla de usuarios si no existe
            String createTableSQLUsu = "CREATE TABLE IF NOT EXISTS usuarios (" +
                    "    id INTEGER NOT NULL," +
                    "    nombre TEXT NOT NULL," +
                    "    email TEXT NOT NULL," +
                    "    calle TEXT NOT NULL," +
                    "    numero INTEGER NOT NULL," +
                    "    ciudad TEXT NOT NULL," +
                    "    pais TEXT NOT NULL)";
            try (Statement stmt = conn.createStatement()){
                stmt.execute(createTableSQLUsu);
                System.out.println("Tabla 'usuarios' creada o ya existe.");
            }

            //Crear tabla de historial si no existe
            String createTableSQLHComp = "CREATE TABLE IF NOT EXISTS historialCompras (" +
                    "    usuario_id INTEGER," +
                    "    producto_id INTEGER," +
                    "    cantidad INTEGER," +
                    "    fecha TEXT," +
                    "    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)," +
                    "    FOREIGN KEY (producto_id) REFERENCES productos(id))";
            try (Statement stmt = conn.createStatement()){
                stmt.execute(createTableSQLHComp);
                System.out.println("Tabla 'historialCompras' creada o ya existe.");
            }

            // Crear la tabla de relación si no existe
            String createRelTableSQL = "CREATE TABLE IF NOT EXISTS categoria_productos (" +
                    "categoria_id INTEGER," +
                    "producto_id INTEGER," +
                    "PRIMARY KEY (categoria_id, producto_id)," +
                    "FOREIGN KEY (categoria_id) REFERENCES categorias(id)," +
                    "FOREIGN KEY (producto_id) REFERENCES productos(id))";
            try (Statement stmt = conn.createStatement()) {
                stmt.execute(createRelTableSQL);
                System.out.println("Tabla 'categoria_productos' creada o ya existe.");
            }

             // Leer datos del JSON
            JSONParser jsonParser = new JSONParser();
            try (FileReader reader = new FileReader("src\\main\\resources\\Tienda.json")) {

                 Object obj = jsonParser.parse(reader);

                 JSONObject tienda = (JSONObject) obj;

                 JSONArray categorias = (JSONArray) ((JSONObject) tienda.get("tienda")).get("categorias");
                 JSONArray usuarios = (JSONArray) ((JSONObject) tienda.get("tienda")).get("usuarios");


                // INSERTAR CATEGORIA
                String insertSQLCatg = "INSERT INTO categorias (id, nombre) VALUES (?,?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQLCatg)) {
                    for (Object categoriaObj : categorias) {
                        JSONObject categoria = (JSONObject) categoriaObj;
                        int id = ((Long) categoria.get("id")).intValue();
                        String nombre = (String) categoria.get("nombre");

                        // Establecer los parámetros en el PreparedStatement
                        pstmt.setInt(1, id);
                        pstmt.setString(2, nombre);

                        // Ejecutar la inserción
                        pstmt.executeUpdate();
                        System.out.println("Categoría '" + nombre + "' insertada con éxito.");
                    }
                }
                //INSERTAR PRODUCTOS
                String insertSQLPro = "INSERT INTO productos (id, nombre, precio, descripcion, inventario) VALUES (?,?,?,?,?)";
                String insertSQLCar = "INSERT INTO caracteristicas (producto_id, clave, valor) VALUES (?,?,?)";
                String insertSQLImg = "INSERT INTO imagenes (producto_id, imagen_url) VALUES (?,?)";

                try (PreparedStatement pstmtPro = conn.prepareStatement(insertSQLPro);
                     PreparedStatement pstmtCar = conn.prepareStatement(insertSQLCar);
                     PreparedStatement pstmtImg = conn.prepareStatement(insertSQLImg)) {

                    for (Object categoriaObj : categorias) {
                        JSONObject categoria = (JSONObject) categoriaObj;

                        // Obtener el arreglo de productos
                        JSONArray productos = (JSONArray) categoria.get("productos");

                        // Verificar si existen productos
                        if (productos != null && !productos.isEmpty()) {
                            for (Object productoObj : productos) {
                                JSONObject producto = (JSONObject) productoObj;

                                // Extraer los valores básicos de cada producto
                                int id = ((Long) producto.get("id")).intValue();
                                String nombre = (String) producto.get("nombre");
                                double precio = (Double) producto.get("precio");
                                String descripcion = (String) producto.get("descripcion");
                                int inventario = ((Long) producto.get("inventario")).intValue();

                                // Insertar el producto
                                pstmtPro.setInt(1, id);
                                pstmtPro.setString(2, nombre);
                                pstmtPro.setDouble(3, precio);
                                pstmtPro.setString(4, descripcion);
                                pstmtPro.setInt(5, inventario);
                                pstmtPro.executeUpdate();
                                System.out.println("Producto '" + nombre + "' insertado con éxito.");

                                // Insertar las características del producto
                                JSONObject caracteristicas = (JSONObject) producto.get("caracteristicas");
                                if (caracteristicas != null) {
                                    for (Object key : caracteristicas.keySet()) {
                                        String clave = (String) key;
                                        String valor = (String) caracteristicas.get(clave);

                                        pstmtCar.setInt(1, id);  // ID del producto
                                        pstmtCar.setString(2, clave);
                                        pstmtCar.setString(3, valor);
                                        pstmtCar.executeUpdate();
                                    }
                                }

                                // Insertar las imágenes del producto
                                JSONArray imagenes = (JSONArray) producto.get("imagenes");
                                if (imagenes != null) {
                                    for (Object imagenObj : imagenes) {
                                        String imagenUrl = (String) imagenObj;

                                        pstmtImg.setInt(1, id);  // ID del producto
                                        pstmtImg.setString(2, imagenUrl);
                                        pstmtImg.executeUpdate();
                                    }
                                }
                            }
                        }
                    }
                }
                // INSERTAR RELACIONES
                String insertSQLCatgPro = "INSERT INTO categoria_productos (categoria_id, producto_id) VALUES (?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQLCatgPro)) {
                    for (Object categoriaObj : categorias) {
                        JSONObject categoria = (JSONObject) categoriaObj;
                        int categoriaId = ((Long) categoria.get("id")).intValue();
                        String nombreCategoria = (String) categoria.get("nombre");

                        // Obtener productos
                        JSONArray productos = (JSONArray) categoria.get("productos");

                        if (productos != null && !productos.isEmpty()) {
                            for (Object productoObj : productos) {
                                JSONObject producto = (JSONObject) productoObj;
                                int productoId = ((Long) producto.get("id")).intValue();

                                // Insertar la relación entre la categoría y el producto
                                pstmt.setInt(1, categoriaId);  // id de la categoría
                                pstmt.setInt(2, productoId);   // id del producto

                                pstmt.executeUpdate();
                                System.out.println("Relación categoría '" + nombreCategoria + "' con producto ID " + productoId + " insertada con éxito.");
                            }
                        }
                    }
                }
                //INSERTAR USUARIOS
                String insertSQLUsu = "INSERT INTO usuarios (id, nombre, email, calle, numero, ciudad, pais) VALUES (?,?,?,?,?,?,?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQLUsu)) {
                    for (Object usuarioObj : usuarios) {
                        JSONObject usuario = (JSONObject) usuarioObj;
                        JSONObject direccion = (JSONObject) usuario.get("direccion");
                        
                        int id = ((Long) usuario.get("id")).intValue();
                        String nombre = (String) usuario.get("nombre");
                        String email = (String) usuario.get("email");
                        String calle = (String) direccion.get("calle");
                        int numero = ((Long) direccion.get("numero")).intValue();
                        String ciudad = (String) direccion.get("ciudad");
                        String pais = (String) direccion.get("pais");

                        pstmt.setInt(1, id);
                        pstmt.setString(2, nombre);
                        pstmt.setString(3, email);
                        pstmt.setString(4, calle);
                        pstmt.setInt(5, numero);
                        pstmt.setString(6, ciudad);
                        pstmt.setString(7, pais);
                        pstmt.executeUpdate();
                        System.out.println("Usuario '" + nombre + "' insertada con éxito.");
                    }
                }
                //INSERTAR HISTORIAL
                String insertSQLHist = "INSERT INTO historialCompras (usuario_id, producto_id, cantidad, fecha) VALUES (?,?,?,?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQLHist)) {
                    for (Object usuarioObj : usuarios) {
                        JSONObject usuario = (JSONObject) usuarioObj;

                        // Asegurarte de que 'historialCompras' es un JSONArray
                        JSONArray historial = (JSONArray) usuario.get("historialCompras");

                        // Verificar si hay un historial de compras para este usuario
                        if (historial != null) {
                            for (Object historialObj : historial) {
                                JSONObject compra = (JSONObject) historialObj;

                                int id = ((Long) usuario.get("id")).intValue();
                                int productoId = ((Long) compra.get("productoId")).intValue();
                                int cantidad = ((Long) compra.get("cantidad")).intValue();
                                String fecha = (String) compra.get("fecha");

                                // Asegúrate de que no haya valores nulos
                                if (fecha != null) {
                                    pstmt.setInt(1, id);  // id del usuario
                                    pstmt.setInt(2, productoId);
                                    pstmt.setInt(3, cantidad);
                                    pstmt.setString(4, fecha);
                                    pstmt.executeUpdate();
                                    System.out.println("Historial de compra del usuario " + id + " insertado con éxito.");
                                }
                            }
                        }
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


    public static List<Categoria> getCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        String consultaGET = "SELECT id, nombre FROM categorias";

        try (Connection conn = BBDD.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(consultaGET)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");

                // Crear el objeto categoría
                Categoria categoria = new Categoria(id, nombre);

                // Obtener los productos asociados a esta categoría
                String consultaProductos = "SELECT producto_id FROM categoria_productos WHERE categoria_id = ?";
                try (PreparedStatement pstmtProd = conn.prepareStatement(consultaProductos)) {
                    pstmtProd.setInt(1, id);
                    try (ResultSet rsProd = pstmtProd.executeQuery()) {
                        while (rsProd.next()) {
                            int productoId = rsProd.getInt("producto_id");
                            categoria.addProducto(productoId);  // Añadir el producto a la categoría
                        }
                    }
                }

                // Añadir la categoría a la lista
                categorias.add(categoria);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categorias;
    }
    
    // Método para obtener los usuarios de la base de datos
    public static List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        String url = "jdbc:sqlite:tienda.db";  // URL de la base de datos SQLite
        String query = "SELECT * FROM usuarios";  // Consulta SQL para obtener todos los usuarios

        try (Connection conn = DriverManager.getConnection(url);  // Establecer la conexión
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Recorrer los resultados de la consulta y agregar a la lista
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                String calle = rs.getString("calle");
                int numero = rs.getInt("numero");
                String ciudad = rs.getString("ciudad");
                String pais = rs.getString("pais");

                // Crear un objeto Usuario y agregarlo a la lista
                Usuario usuario = new Usuario(id, nombre, email, calle, numero, ciudad, pais);
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener los usuarios.");
        }

        return usuarios;  // Devolver la lista de usuarios
    }
    
    // Método para obtener el historial de compras de la base de datos
    public static List<HistorialCompra> getHistorial() {
        List<HistorialCompra> historialCompras = new ArrayList<>();
        String url = "jdbc:sqlite:tienda.db";  // URL de la base de datos SQLite
        String query = "SELECT * FROM historialCompras";  // Consulta SQL para obtener el historial completo

        try (Connection conn = DriverManager.getConnection(url);  // Establecer la conexión
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            // Recorrer los resultados de la consulta y agregar a la lista
            while (rs.next()) {
                int usuarioId = rs.getInt("usuario_id");
                int productoId = rs.getInt("producto_id");
                int cantidad = rs.getInt("cantidad");
                String fecha = rs.getString("fecha");

                // Crear un objeto HistorialCompra y agregarlo a la lista
                HistorialCompra historialCompra = new HistorialCompra(usuarioId, productoId, cantidad, fecha);
                historialCompras.add(historialCompra);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al obtener el historial de compras.");
        }

        return historialCompras;  // Devolver la lista de historial de compras
    }

}