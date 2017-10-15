/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Constructoras.Constructora_Abstracta;
import Constructoras.Constructora_Concreta;
import Personajes.Mapa;
import Personajes.Personaje;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

/**
 *
 * @author ivanr
 */
public class Lienzo extends Canvas implements KeyListener{
//    private Mapa mapa;
    private Personaje pj;
    private Constructora_Abstracta constructora;
    private Image imgBuffer;
    private Graphics grafica;
    
    public Lienzo(String tipoPj){
//        mapa = new Mapa();
        constructora = new Constructora_Concreta(tipoPj);
        constructora.builderArma();
        constructora.builderArmadura();
        constructora.builderImagen();
        constructora.buildPersonaje();
        pj = constructora.getPersonaje();
        
        
        setBounds(0, 0, 1300, 800);
        imgBuffer = new BufferedImage(1300, 800, BufferedImage.OPAQUE);
    }

    @Override
    public void update(Graphics g){
        paint(g);
    }
    
    public void paint(Graphics g){
        grafica = imgBuffer.getGraphics();
//        mapa.draw(grafica);
        pj.draw(grafica);
        g.drawImage(imgBuffer, 0, 0, this);
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        pj.update(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
