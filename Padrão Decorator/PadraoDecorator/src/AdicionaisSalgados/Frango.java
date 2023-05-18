package AdicionaisSalgados;

import Pizzas.PizzaDecorator;
import Pizzas.Pizza;


public class Frango extends PizzaDecorator{
    
    public Frango(Pizza pizza) {
        super(pizza);
        this.nome = "Frango";
        this.preco = 2.5;
    }
    
}
