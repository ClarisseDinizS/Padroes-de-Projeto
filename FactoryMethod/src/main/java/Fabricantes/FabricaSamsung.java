/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricantes;

import Celular.Celular;
import Celular.S22;

/**
 *
 * @author diniz
 */
public class FabricaSamsung implements FabricaDeCelular{

    @Override
    public Celular criarCelular() {
        return new S22();
    
    }
    
}
