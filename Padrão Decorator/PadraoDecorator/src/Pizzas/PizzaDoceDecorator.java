// GRUPO: CLARISSE DINIZ, EDSON LIMA E MATHEUS MILBRATZ
package Pizzas;

public abstract class PizzaDoceDecorator extends PizzaDoce{
    
    private PizzaDoce pizza;

    public PizzaDoceDecorator(PizzaDoce pizza) {
        this.pizza = pizza;
    }
    
    @Override
    public String getNome() {
        return String.format("%s, %s", pizza.getNome(), nome);
    }

    @Override
    public Double getPreco() {
        return pizza.getPreco() + preco; 
    } 
    
}
