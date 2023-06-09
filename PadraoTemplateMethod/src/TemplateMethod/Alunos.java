// GRUPO: CLARISSE, EDSON E MATHEUS MILBRATZ
package TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public final class Alunos {
    protected List<Aluno> alunos;
    protected OrdenadorTemplate ordenador;
    protected ModoDeOrdenacao modoOrdenacao;
    protected CrescenteDecrescente crescenteDecrescente;
    
    public Alunos(ModoDeOrdenacao modoOrdenacao, CrescenteDecrescente crescenteDecrescente) {
        alunos = new ArrayList<>();
        mudarOrdenacao(modoOrdenacao, crescenteDecrescente);
    }
    
    public void mudarOrdenacao(ModoDeOrdenacao modoOrdenacao, CrescenteDecrescente crescenteDecrescente){
        this.modoOrdenacao = modoOrdenacao;
        this.crescenteDecrescente = crescenteDecrescente;
        switch (modoOrdenacao) {
            case NOME:
                ordenador = new OrdenarPorNome();
                break;
            case IDADE:
                ordenador = new OrdenarPorIdade();
                break;
            case NOTA:
                ordenador = new OrdenarPorNota();
                break;
            default:
                break;
        }
    }
    // definir o tipo de ordenação que será feito
    public void setModoDeOrdenacao(ModoDeOrdenacao modoOrdenacao, CrescenteDecrescente crescenteDecrescente) {
        mudarOrdenacao(modoOrdenacao, crescenteDecrescente);
    }
    // adicionar alunos na lista
    public void addAluno(String nome, Integer idade, Double nota) {
        alunos.add(new Aluno(nome, idade, nota));
    }
    // listar os alunos de acordo com a ordenação
    public void printAlunos() {
        List<Aluno> alunosOrdenados = ordenador.ordenarAlunos(alunos, crescenteDecrescente);
        System.out.println("Exibindo alunos ordenados por " + modoOrdenacao.name()
                + " [ORDEM " + crescenteDecrescente.name() + "]:");
        alunosOrdenados.forEach((a) -> {
            System.out.println(String.format("| %s - %d - %.2f", a.getNome(), a.getIdade(), a.getNota()));
        });
        
    }
        
}
