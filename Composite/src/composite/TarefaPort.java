//NOME: CLARISSE DINIZ, EDSON LIMA, MATHEUS MILBRATZ
package composite;

/**
 *
 * @author diniz
 */
public class TarefaPort extends Tarefa {

    public TarefaPort(String nomeTarefa, float nota) {
        super(nomeTarefa, nota);
    }

    @Override
    public void printNomeTarefa() {
        System.out.println(this.nomeTarefa + "\nValor da Tarefa: " + this.nota+ " pontos");
    }
    
}
