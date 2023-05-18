package AdicionaisSalgados;

import Pizzas.PizzaDecorator;
import Pizzas.Pizza;


public class Calabresa extends PizzaDecorator{
    
    public Calabresa(Pizza pizza) {
        super(pizza);
        this.nome = "Calabresa";
        this.preco = 3.0;
    }
}
