package AdicionaisSalgados;

import Pizzas.PizzaDecorator;
import Pizzas.Pizza;


public class Queijo extends PizzaDecorator{
    
    public Queijo(Pizza pizza) {
        super(pizza);
        this.nome = "Queijo";
        this.preco = 1.9;
    }
    
}
