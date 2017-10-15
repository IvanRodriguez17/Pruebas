/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas;

/**
 *
 * @author ivanr
 */
public class Controlador {
    
    private static Fabrica_Abstracta FabricaPersonaje;
    
    public static Fabrica_Abstracta getSingletonInstance(String tipo) {
        if(FabricaPersonaje == null){
            switch(tipo){
                case "elfo":
                    FabricaPersonaje = new Fabrica_Elfo();
                    break;
                case "orco":
                    FabricaPersonaje = new Fabrica_Orco();
                    break;
            }
            return FabricaPersonaje;
        }else{
            return FabricaPersonaje;
        }
    }
}
