package Computador;

import Notebook.ComputadorNote;
import Tablet.ComputadorTab;

/**
 *
 * @author diniz
 */
public interface FabricaDeComputador {
    
    ComputadorNote criarComputadorNote();
    ComputadorTab criarComputadorTab();
    
    
}
