package Computador;

import Notebook.ComputadorNote;
import Tablet.ComputadorTab;
import Notebook.SamsungBook;
import Tablet.TabSamsungLite;

/**
 *
 * @author diniz
 */
public class FabricaSamsung implements FabricaDeComputador {

    @Override
    public ComputadorNote criarComputadorNote() {
       return new SamsungBook(); 
    }

    @Override
    public ComputadorTab criarComputadorTab() {
        return new TabSamsungLite();
    }
    
}
