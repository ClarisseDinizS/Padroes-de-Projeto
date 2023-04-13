/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricantes;

import Celular.Celular;
import Celular.Iphone14;

/**
 *
 * @author diniz
 */
public class FabricaApple implements FabricaDeCelular{

    @Override
    public Celular criarCelular() {
        return new Iphone14();
    
    }
    
    
}
