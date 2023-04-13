package Computador;

import Notebook.ComputadorNote;
import Tablet.ComputadorTab;
import Tablet.IpadApple;
import Notebook.MacBook;

/**
 *
 * @author diniz
 */
public class FabricaApple implements FabricaDeComputador{

    @Override
    public ComputadorNote criarComputadorNote() {
        return new MacBook();
    }

    @Override
    public ComputadorTab criarComputadorTab() {
        return new IpadApple();
    }
    
}
