/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import Personajes.Arma;
import Personajes.ArmaOrco;
import Personajes.Armadura;
import Personajes.ArmaduraOrco;
import Personajes.Orco;
import Personajes.Personaje;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ivanr
 */
public class Fabrica_Orco extends Fabrica_Abstracta{

    @Override
    public Arma crearArma() {
        arma = new ArmaOrco();
        arma.setNombre("Mazo de piedra");
        arma.setDañoBase(14);
//        arma.setImagenArma(new ImageIcon(getClass()
//                .getResource("/imagenes/mazo_orco.png")).getImage());
        return arma;
    }

    @Override
    public Armadura crearArmadura() {
        armadura = new ArmaduraOrco();
        armadura.setNombre("malla de cuero");
        armadura.setDefensaBase(16);
//        armadura.setImagenArmadura(new ImageIcon(getClass()
//                .getResource("/imagenes/espada_corta.png")).getImage());
        return armadura;
    }
    
    @Override
    public Personaje crearPersonaje() {
        pj = new Orco();
        return pj;
    }

    @Override
    public Image crearImagen() {
        img = new ImageIcon(getClass().getResource("/imagenes/orco.png")).getImage();
        return img;
        
    }
}
