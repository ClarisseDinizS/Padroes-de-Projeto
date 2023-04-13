package AbstractMethod;

import Notebook.ComputadorNote;
import Tablet.ComputadorTab;
import Computador.FabricaApple;
import Computador.FabricaDeComputador;
import Computador.FabricaSamsung;

/**
 *
 * @author diniz
 */
public class AbstractMethod {

    public static void main(String[] args) {
        
        FabricaDeComputador fabrica;
        ComputadorNote notebook;
        ComputadorTab tablet;
        
        System.out.println("------- Notebook -------");
        
        fabrica = new FabricaApple();
        
        notebook = fabrica.criarComputadorNote();
        notebook.exibirEspecificacaoNote();
        
        System.out.println("------- Tablet -------");
        
        tablet = fabrica.criarComputadorTab();
        tablet.exibirEspecificacaoTab();
        
        System.out.println("------- Notebook -------");
        
        fabrica = new FabricaSamsung();
        
        notebook = fabrica.criarComputadorNote();
        notebook.exibirEspecificacaoNote();
        
        System.out.println("------- Tablet -------");
        
        tablet = fabrica.criarComputadorTab();
        tablet.exibirEspecificacaoTab();
        
        
        
    }
}
