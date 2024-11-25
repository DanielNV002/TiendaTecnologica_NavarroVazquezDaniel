
package com.mycompany.tiendatecnologica;

public class Producto {
    
    private int id;
    private String nombre;
    private String email;
    private String calle;
    private int numero;
    private String ciudad;
    private String pais;
    
    public Producto(int productoId, String nombreProducto, double precio, String descripcion, int inventario){
        
    }

    public Producto(int id, String nombre, String email, String calle, int numero, String ciudad, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }
    
    
    
}
