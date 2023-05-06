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
public class Plug {
    private Tomada2Pinos tomada;
    
    public Tomada2Pinos getTomadaBrasileira(){
        return tomada;
    }
    
    public void setTomadaBrasileira(Tomada2Pinos tomada){
        this.tomada = tomada;
    }
    
    public void plugar(){
        this.tomada.plugar2Pinos();
    }
    
}
