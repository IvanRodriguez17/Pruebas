/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

import Personajes.Arma;
import Personajes.Armadura;
import Personajes.Personaje;
import java.awt.Image;

/**
 *
 * @author ivanr
 */
public abstract class Fabrica_Abstracta {
    
    protected Personaje pj;
    protected Arma arma;
    protected Armadura armadura;
    protected Image img;
    
    public abstract Image crearImagen();
    public abstract Personaje crearPersonaje();
    public abstract Arma crearArma();
    public abstract Armadura crearArmadura();
}
