/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendatecnologica;

/**
 *
 * @author alumno
 */
public class TiendaTecnologica {

    public static void main(String[] args) {
        TiendaView tV = new TiendaView();
        tV.setVisible(true);
        BBDD bd = new BBDD();
        bd.lanzarBBDD();
    }
}
