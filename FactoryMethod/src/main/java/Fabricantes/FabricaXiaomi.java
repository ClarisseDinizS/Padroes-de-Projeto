/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricantes;

import Celular.Celular;
import Celular.Note11;

/**
 *
 * @author diniz
 */
public class FabricaXiaomi implements FabricaDeCelular{

    @Override
    public Celular criarCelular() {
        return new Note11();
    
    }
    
}
