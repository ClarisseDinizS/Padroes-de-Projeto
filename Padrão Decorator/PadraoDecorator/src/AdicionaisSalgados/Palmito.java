package AdicionaisSalgados;

import Pizzas.PizzaDecorator;
import Pizzas.Pizza;


public class Palmito extends PizzaDecorator{
    
    public Palmito(Pizza pizza) {
        super(pizza);
        this.nome = "Palmito";
        this.preco = 0.5;
    }
    
}
