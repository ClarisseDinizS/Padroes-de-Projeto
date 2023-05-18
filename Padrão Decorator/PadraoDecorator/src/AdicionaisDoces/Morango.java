package AdicionaisDoces;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;
import Pizzas.PizzaDoce;
import Pizzas.PizzaDoceDecorator;

public class Morango extends PizzaDoceDecorator{
    
    public Morango(PizzaDoce pizza) {
        super(pizza);
        this.nome = "Pedaços de Morango";
        this.preco = 4.5;
    }
}
