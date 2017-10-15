/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personajes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ivanr
 */
public class Mapa{
    private Image imagenFondo;
    
    public Mapa(){
        imagenFondo = new ImageIcon(getClass().getResource("/imagenes/mapa.png")).getImage();
    }
    
    public void draw(Graphics g){
        g.drawImage(imagenFondo, 0, 0, null);
    }
    
    public void update(){
        
    }
}
