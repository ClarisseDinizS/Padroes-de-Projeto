// GRUPO: CLARISSE, EDSON E MATHEUS MILBRATZ
package Controles;

import Aparelhos.Aparelho;

/**
 *
 * @author diniz
 */
public class ControleAvancado extends ControleBasico {
   
    public ControleAvancado(Aparelho device) {
        super.device = device;
    }

    public void mutar() {
        System.out.println("Controle remoto: mudo");
        device.setarVolume(0);
    }
    
}
