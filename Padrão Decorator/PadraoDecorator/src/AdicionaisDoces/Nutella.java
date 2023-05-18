
package AdicionaisDoces;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;
import Pizzas.PizzaDoce;
import Pizzas.PizzaDoceDecorator;


public class Nutella  extends PizzaDoceDecorator{
    
    public Nutella(PizzaDoce pizza) {
        super(pizza);
        this.nome = "Nutella";
        this.preco = 8.5;
    }
}
    

