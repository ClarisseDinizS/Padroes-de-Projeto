package Notebook;

/**
 *
 * @author diniz
 */
public class SamsungBook implements ComputadorNote{

    @Override
    public void exibirEspecificacaoNote() {
        System.out.println("Nome: Notebook Samsung Book"
                + "\nTela: 15.6 polegadas"
                + "\nArmazenamento: 256GB SSD ");
    }
    
}
