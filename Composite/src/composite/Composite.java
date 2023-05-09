//NOME: CLARISSE DINIZ, EDSON LIMA, MATHEUS MILBRATZ
package composite;

public class Composite {

    public static void main(String[] args) {

        Tarefa tar1 = new TarefaMat("Tarefa de Derivadas", 5);
        Tarefa tar2 = new TarefaPort("Tarefa de Interpretação de Texto", 5);
        Tarefa tar3 = new TarefaMat("Tarefa de Integral", 5);
        Tarefa tar4 = new TarefaMat("Tarefa de Logaritmo", (float) 3.5);

        tar1.printNomeTarefa();
        tar2.printNomeTarefa();
        tar3.printNomeTarefa();

        Tarefa prova1 = new Prova("Prova de Matemática", 0);
        Tarefa prova2 = new Prova("Prova de Português", 0);

        ((Prova) prova2).adicionar(tar2);
        ((Prova) prova2).printNomeTarefa();

        ((Prova) prova1).adicionar(tar1);
        ((Prova) prova1).adicionar(tar3);
        ((Prova) prova1).adicionar(tar4);
        ((Prova) prova1).printNomeTarefa();
        
    }

}
