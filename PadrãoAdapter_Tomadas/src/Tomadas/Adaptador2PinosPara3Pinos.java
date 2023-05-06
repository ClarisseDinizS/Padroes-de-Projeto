/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tomadas;

/**
 *
 * @author 2019122760249
 */
public class Adaptador2PinosPara3Pinos extends Tomada2Pinos{
    private Tomada3Pinos tomada;
    
    public Adaptador2PinosPara3Pinos (Tomada3Pinos tomada){
        this.tomada = tomada;
    }

    @Override
    public void plugar2Pinos() {
        tomada.plugar3Pinos();     
    }
    
    
   
}
