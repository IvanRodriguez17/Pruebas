/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JFrame;

/**
 *
 * @author ivanr
 */
public class Ventana_Principal extends JFrame{
    
    private Lienzo canvas;
    
    public Ventana_Principal(String tipoPj){
        canvas = new Lienzo(tipoPj);
        
        setLayout(null);
        getContentPane().add(canvas);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        addKeyListener(canvas);
        setBounds(0, 0, 1300, 800);
        setVisible(true);

    }
}
