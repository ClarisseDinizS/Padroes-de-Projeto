// GRUPO: CLARISSE DINIZ, EDSON LIMA E MATHEUS MILBRATZ

package padrão.singleton;

public class Desacumuladora {

    public static void outroMetodo(PadrãoSingleton ps){
        ps = PadrãoSingleton.getInstancia();
        ps.diminuirValor(50);
        ps.diminuirValor(10);
    }
   
    public static void main(String[] args) {
        
        // PadrãoSingleton ps = new PadrãoSingleton();
        PadrãoSingleton ps = PadrãoSingleton.getInstancia();
        ps.diminuirValor(30);
        ps.diminuirValor(40);
        System.out.println("O valor é " + ps.getValor());
        
        Desacumuladora.outroMetodo(ps);
        System.out.println("O valor é " + ps.getValor());
    }
    
}
