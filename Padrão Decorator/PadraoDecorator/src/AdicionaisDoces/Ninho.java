package AdicionaisDoces;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;
import Pizzas.PizzaDoce;
import Pizzas.PizzaDoceDecorator;

public class Ninho extends PizzaDoceDecorator{
    
    public Ninho(PizzaDoce pizza) {
        super(pizza);
        this.nome = "Leite em pó";
        this.preco = 3.0;
    }
    
}
