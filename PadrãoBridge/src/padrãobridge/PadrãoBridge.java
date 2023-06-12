// GRUPO: CLARISSE, EDSON E MATHEUS MILBRATZ
package padrãobridge;

import Aparelhos.Aparelho;
import Aparelhos.Radio;
import Aparelhos.Televisao;
import Controles.ControleAvancado;
import Controles.ControleBasico;

/**
 *
 * @author diniz
 */
public class PadrãoBridge {

    public static void testarAparelhos(Aparelho device) {
        System.out.println("Testando o controle básico.");
        ControleBasico basicRemote = new ControleBasico(device);
        basicRemote.iniciar();
        device.imprimirStatus();

        System.out.println("Testando o controle avançado.");
        ControleAvancado advancedRemote = new ControleAvancado(device);
        advancedRemote.mutar();
        advancedRemote.pularCanal();
        advancedRemote.iniciar();
        device.imprimirStatus();
    }

    public static void main(String[] args) {
        testarAparelhos(new Televisao());
        testarAparelhos(new Radio());
    }
    
}
