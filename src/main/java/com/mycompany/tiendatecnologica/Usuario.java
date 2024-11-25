
package com.mycompany.tiendatecnologica;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private String calle;
    private int numero;
    private String ciudad;
    private String pais;

    // Constructor
    public Usuario(int id, String nombre, String email, String calle, int numero, String ciudad, String pais) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", nombre='" + nombre + "', email='" + email + "', calle='" + calle +
                "', numero=" + numero + ", ciudad='" + ciudad + "', pais='" + pais + "'}";
    }
}
