// GRUPO: CLARISSE, EDSON E MATHEUS MILBRATZ
package Aparelhos;

/**
 *
 * @author diniz
 */
public interface Aparelho {
    
    boolean estaHabilitado();

    void habilitado();

    void desabilitado();

    int pegarVolume();

    void setarVolume(int volume);

    int pegarCanal();

    void setarCanal(int canal);

    void imprimirStatus();
}
