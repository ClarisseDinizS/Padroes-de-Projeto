// GRUPO: CLARISSE, EDSON E MATHEUS MILBRATZ
package TemplateMethod;

public class OrdenarPorNome extends OrdenadorTemplate {
    
    @Override
    public int isFirst(Aluno aluno01, Aluno aluno02) {
        return aluno01.getNome().compareToIgnoreCase(aluno02.getNome());
    }
}
