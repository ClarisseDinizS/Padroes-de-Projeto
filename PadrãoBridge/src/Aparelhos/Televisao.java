// GRUPO: CLARISSE, EDSON E MATHEUS MILBRATZ
package Aparelhos;

/**
 *
 * @author diniz
 */
public class Televisao implements Aparelho{
    
    private boolean ligado = false;
    private int volume = 90;
    private int canal = 1;

    @Override
    public boolean estaHabilitado() {
        return ligado;
    }

    @Override
    public void habilitado() {
        ligado = true;
    }

    @Override
    public void desabilitado() {
        ligado = false;
    }

    @Override
    public int pegarVolume() {
        return volume;
    }

    @Override
    public void setarVolume(int volume) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public int pegarCanal() {
        return canal;
    }

    @Override
    public void setarCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public void imprimirStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Eu sou uma televisão.");
        System.out.println("| Eu estou " + (ligado ? "ligada" : "desligada"));
        System.out.println("| Volume atual da TV é:  " + volume + "%");
        System.out.println("| Canal atual da TV é: " + canal);
        System.out.println("------------------------------------\n");
    }
}
