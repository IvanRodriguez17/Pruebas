/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructoras;

import Personajes.Personaje;

/**
 *
 * @author ivanr
 */
public class PersonajesCreador {
    
    public Personaje clonadoPersonaje(Personaje personajeO){
        return personajeO.clone();
    }
}
