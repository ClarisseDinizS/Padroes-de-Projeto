package Adapter;

import Tomadas.Adaptador2PinosPara3Pinos;
import Tomadas.Plug;
import Tomadas.Tomada3Pinos;


public class PadrãoAdapter_Tomadas {

    public static void main(String[] args) {
        Plug plugin = new Plug();
        
        Tomada3Pinos tomada = new Tomada3Pinos();
        Adaptador2PinosPara3Pinos adaptador =  new Adaptador2PinosPara3Pinos(tomada);
        
        plugin.setTomadaBrasileira(adaptador);
        plugin.plugar();
    }
    
}
