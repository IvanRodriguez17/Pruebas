/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import Personajes.Arma;
import Personajes.ArmaElfo;
import Personajes.Armadura;
import Personajes.ArmaduraElfo;
import Personajes.Elfo;
import Personajes.Personaje;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ivanr
 */
public class Fabrica_Elfo extends Fabrica_Abstracta{

    @Override
    public Arma crearArma() {
        arma = new ArmaElfo();
        arma.setNombre("espada corta");
        arma.setDañoBase(15);
//        arma.setImagenArma(new ImageIcon(getClass()
//                .getResource("/imagenes/espada_corta.png")).getImage());
        return arma;
    }

    @Override
    public Armadura crearArmadura() {
        armadura = new ArmaduraElfo();
        armadura.setNombre("Cota de malla");
        armadura.setDefensaBase(10);
//       armadura.setImagenArmadura(new ImageIcon(getClass()
//                .getResource("/imagenes/mazo_orco.png")).getImage());
        return armadura;
    }

    @Override
    public Personaje crearPersonaje() {
        pj = new Elfo();
        return pj;
    }

    @Override
    public Image crearImagen() {
        img = new ImageIcon(getClass().getResource("/imagenes/elfo.png")).getImage();
        System.out.println("se creo la imagen");
        return img;
    }
    
}
