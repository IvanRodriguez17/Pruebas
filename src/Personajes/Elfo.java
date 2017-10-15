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

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, xPos, yPos, null);
    }

    @Override
    public void update(int c) {
        switch(c){
            case 37:
                xPos +=10;
                break;
            case 39:
                yPos += 10;
                break;
            case 38:
                xPos -= 10;
                break;
        }
    }

    public void update() {
        xPos = (600 + xPos) % 600;
        yPos = (400 + yPos) % 400;
    }
    
}
