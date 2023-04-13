package Notebook;

/**
 *
 * @author diniz
 */
public class MacBook implements ComputadorNote{

    @Override
    public void exibirEspecificacaoNote() {
        System.out.println("Nome: Apple notebook MacBook Air"
                + "\nTela: 13 polegadas"
                + "\nArmazenamento: 256GB  ");
    }
    
}
