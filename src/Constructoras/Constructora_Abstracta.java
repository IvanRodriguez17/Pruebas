/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructoras;

import Personajes.Arma;
import Personajes.Armadura;
import Personajes.Personaje;
import fabricas.Controlador;
import fabricas.Fabrica_Abstracta;
import java.awt.Image;

/**
 *
 * @author ivanr
 */
public abstract class Constructora_Abstracta {
    
    protected Fabrica_Abstracta fabrica;
    protected Controlador control;
    protected Arma arma;
    protected Armadura armadura;
    protected Personaje personaje;
    protected Image img;
    
    public abstract void buildPersonaje();
    public abstract void builderArma();
    public abstract void builderArmadura();
    public abstract void builderImagen();
    

    public Personaje getPersonaje() {
        return personaje;
    }
}
