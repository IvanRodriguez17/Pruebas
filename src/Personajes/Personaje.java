/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author ivanr
 */
public abstract class Personaje implements Cloneable{
    
    protected Arma arma;
    protected Armadura armadura;
    protected Image imagen;
    protected int xPos;
    protected int yPos;

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
    
    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }
    
    public void ToString(){
        System.out.println(this.arma.nombre + "daño base de :" + this.arma.dañoBase);
        System.out.println(this.armadura.nombre + "defensa base de :" + this.armadura.defensaBase);
    }
    
    
    @Override
    public Personaje clone() {
        Personaje clonePersonaje = null;
        try {
            clonePersonaje = (Personaje) super.clone();
            clonePersonaje.setArma(arma);
            clonePersonaje.setArmadura(armadura);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonePersonaje;
    } // method clone
    
    public abstract void draw(Graphics g);
    public abstract void update(int c);
}
