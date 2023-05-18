package AdicionaisDoces;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;
import Pizzas.PizzaDoce;
import Pizzas.PizzaDoceDecorator;

public class KitKat extends PizzaDoceDecorator{
    
    public KitKat(PizzaDoce pizza) {
        super(pizza);
        this.nome = "Kit Kat";
        this.preco = 6.5;
    }
    
}
