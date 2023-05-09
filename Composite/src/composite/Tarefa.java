//NOME: CLARISSE DINIZ, EDSON LIMA, MATHEUS MILBRATZ
package composite;

/**
 *
 * @author diniz
 */
public abstract class Tarefa {
    protected String nomeTarefa;
    protected float nota;

    public Tarefa(String nomeTarefa,float nota) {
        this.nomeTarefa = nomeTarefa;
        this.nota = nota;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public float getNota() {
        return nota;
    }
    
    public void printNomeTarefa(){
        System.out.println("\n"+this.nomeTarefa);
    }
    
}
