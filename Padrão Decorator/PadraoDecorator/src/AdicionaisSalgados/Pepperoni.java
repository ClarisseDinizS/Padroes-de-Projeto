package AdicionaisSalgados;

import Pizzas.PizzaDecorator;
import Pizzas.Pizza;

public class Pepperoni extends PizzaDecorator{
    
    public Pepperoni(Pizza pizza) {
        super(pizza);
        this.nome = "Pepperoni";
        this.preco = 4.5;
    }
    
}
