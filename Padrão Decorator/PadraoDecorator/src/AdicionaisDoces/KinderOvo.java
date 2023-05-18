package AdicionaisDoces;

import Pizzas.Pizza;
import Pizzas.PizzaDecorator;
import Pizzas.PizzaDoce;
import Pizzas.PizzaDoceDecorator;

public class KinderOvo extends PizzaDoceDecorator{
    
    public KinderOvo(PizzaDoce pizza) {
        super(pizza);
        this.nome = "Kinder Ovo";
        this.preco = 5.5;
    }
    
}
