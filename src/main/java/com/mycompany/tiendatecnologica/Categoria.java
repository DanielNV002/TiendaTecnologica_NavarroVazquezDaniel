
package com.mycompany.tiendatecnologica;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private int id;
    private String nombre;
    private List<Integer> idProductos;

    public Categoria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.idProductos = new ArrayList<>();
    }

    public void addProducto(int idProducto) {
        this.idProductos.add(idProducto);
    }

    @Override
    public String toString() {
        return ("ID = " + id + " Nombre = " + nombre + " Productos = " + idProductos);
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getIdProductos() {
        return idProductos;
    }
}
