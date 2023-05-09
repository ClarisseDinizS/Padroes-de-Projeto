//NOME: CLARISSE DINIZ, EDSON LIMA, MATHEUS MILBRATZ
package composite;

import java.util.ArrayList;

public class Prova extends Tarefa {
    protected ArrayList<Tarefa> tarefas;
    
    public Prova(String nomeTarefa, float nota) {
        super(nomeTarefa, nota);
        this.tarefas = new ArrayList<>(); 
    }

    @Override
    public void printNomeTarefa() {
        System.out.println("\n" + this.nomeTarefa + " - " + this.nota); 
        tarefas.forEach((tarefa) ->{
           tarefa.printNomeTarefa();
        });  
    }
    
    public void adicionar(Tarefa novaTarefa){
        this.tarefas.add(novaTarefa);
        atualizarNota(novaTarefa.getNota());
    }
    
    public void remover(String nomeTarefa) throws Exception{
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getNomeTarefa().equals(nomeTarefa)){
               this.tarefas.remove(tarefa);
               return;
            } 
        }
        throw new Exception("Não existe tarefa");
    }
    
    public Tarefa pegarTarefa(String nomeTarefa) throws Exception{
        for (Tarefa tarefa : tarefas) {
            if(tarefa.getNomeTarefa().equals(nomeTarefa)){
               return tarefa;
            } 
        }
        throw new Exception("Não existe tarefa");
    }
    
    public void atualizarNota(float nota){
        this.nota = this.nota + nota;
    }
}
