/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import java.awt.Graphics;

/**
 *
 * @author ivanr
 */
public class Elfo extends Personaje{

    public Elfo() {
        this.tipo = "Elfo";
    }
    
    

    @Override
    public void draw(Graphics g) {
        System.out.println("siiiii");
        g.drawImage(imagen, xPos, yPos, null);
    }

    @Override
    public void update(int c) {
        System.out.println("se mueve");
        switch(c){
            case 37:
                xPos -=10;
                break;
            case 39:
                xPos += 10;
                break;
            case 38:
                yPos -= 10;
                break;
        }
        xPos = (1300 + xPos) % 1300;
        yPos = (800 + yPos) % 800;
    }

    
}
