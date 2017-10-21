/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import java.awt.Image;

/**
 *
 * @author ivanr
 */
public class Armadura {
    
    protected String nombre;
//    protected Image imagenArmadura;
    protected int defensaBase;

//    public Image getImagenArmadura() {
//        return imagenArmadura;
//    }
//
//    public void setImagenArmadura(Image imagenArmadura) {
//        this.imagenArmadura = imagenArmadura;
//    }
    
    public String getNombre() {
        return nombre;
    }

    public int getDefensaBase() {
        return defensaBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDefensaBase(int defensaBase) {
        this.defensaBase = defensaBase;
    }
}
