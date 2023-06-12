// GRUPO: CLARISSE, EDSON E MATHEUS MILBRATZ
package Controles;

import Aparelhos.Aparelho;

/**
 *
 * @author diniz
 */
public class ControleBasico implements Controle {
    protected Aparelho device;
    
    public ControleBasico(Aparelho device) {
        this.device = device;
    }

    public ControleBasico() {
    }

    @Override
    public void iniciar() {
        System.out.println("Controle remoto: botão de ligar");
        if (device.estaHabilitado()) {
            device.desabilitado();
        } else {
            device.habilitado();
        }
    }

    @Override
    public void abaixarVolume() {
        System.out.println("Controle remoto: abaixar volume");
        device.setarVolume(device.pegarVolume() - 10);
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Controle remoto: aumentar volume");
        device.setarVolume(device.pegarVolume() + 10);
    }

    @Override
    public void voltarCanal() {
        System.out.println("Controle remoto: voltar um canal");
        device.setarCanal(device.pegarCanal() - 1);
    }

    @Override
    public void pularCanal() {
        System.out.println("Controle remoto: pular um canal");
        device.setarCanal(device.pegarCanal() + 1);
    }
}
