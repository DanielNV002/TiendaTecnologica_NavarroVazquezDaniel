/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendatecnologica;

/**
 *
 * @author alumno
 */
public class HistorialCompra {
    private int usuarioId;
    private int productoId;
    private int cantidad;
    private String fecha;

    // Constructor
    public HistorialCompra(int usuarioId, int productoId, int cantidad, String fecha) {
        this.usuarioId = usuarioId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    // Getters and setters

    public int getUsuarioId() { return usuarioId; }
    public void setUsuarioId(int usuarioId) { this.usuarioId = usuarioId; }

    public int getProductoId() { return productoId; }
    public void setProductoId(int productoId) { this.productoId = productoId; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    @Override
    public String toString() {
        return  "   Usuario ID: |" + usuarioId + "| \t" +
                "Producto ID: |" + productoId + "| \t" +
                "Cantidad: |" + cantidad + "| \t    " +
                "   Fecha: '|" + fecha + "|'";
    }
}

