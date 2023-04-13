package factoryMethod;

import Celular.Celular;
import Fabricantes.FabricaXiaomi;
import Fabricantes.FabricaMotorola;
import Fabricantes.FabricaApple;
import Fabricantes.FabricaDeCelular;
import Fabricantes.FabricaSamsung;

/**
 *
 * @author diniz
 */
public class factory {

    public static void main(String[] args) {
        
        FabricaDeCelular fabrica = new FabricaApple();
        Celular celular = fabrica.criarCelular();
        celular.exibirFichaTecnica();
        System.out.println("----------------------");
        
        fabrica = new FabricaMotorola();
        celular = fabrica.criarCelular();
        celular.exibirFichaTecnica();
        System.out.println("----------------------");
        
        fabrica = new FabricaXiaomi();
        celular = fabrica.criarCelular();
        celular.exibirFichaTecnica();
        System.out.println("----------------------");
        
        fabrica = new FabricaSamsung();
        celular = fabrica.criarCelular();
        celular.exibirFichaTecnica();
        System.out.println("----------------------");
    }
    
}
