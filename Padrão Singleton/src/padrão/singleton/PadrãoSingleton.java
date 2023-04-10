// GRUPO: CLARISSE DINIZ, EDSON LIMA E MATHEUS MILBRATZ

package padrão.singleton;

public class PadrãoSingleton {
    private int valor;
    private static PadrãoSingleton instancia;
    
    private PadrãoSingleton(){
        valor = 0;
    }
    
    public static PadrãoSingleton getInstancia(){
        if(instancia == null){
            instancia = new PadrãoSingleton();
        }
        return instancia;
    }
    
    public void diminuirValor(int decrescimo){
        valor -= decrescimo;
    }
    
    public int getValor(){
        return valor;
    }
}
