// GRUPO: CLARISSE DINIZ, EDSON LIMA E MATHEUS MILBRATZ
package Decorator;

import AdicionaisDoces.Brigadeiro;
import AdicionaisDoces.KitKat;
import AdicionaisDoces.Morango;
import AdicionaisDoces.Ninho;
import AdicionaisDoces.Nutella;
import AdicionaisSalgados.Queijo;
import AdicionaisSalgados.Pepperoni;
import AdicionaisSalgados.Palmito;
import AdicionaisSalgados.Frango;
import AdicionaisSalgados.MolhoTomate;
import Pizzas.Pizza;
import Pizzas.PizzaDoce;

public abstract class PadraoDecorator {

    public static void main(String[] args) {
        Pizza pizza = new MolhoTomate();
        pizza = new Frango(pizza);
        System.out.println(String.format("Sua pizza: %s | Preço Total: R$ %.2f", pizza.getNome(), pizza.getPreco()));
        pizza = new Palmito(pizza);
        System.out.println(String.format("\nSua pizza: %s | Preço Total: R$ %.2f", pizza.getNome(), pizza.getPreco()));
        pizza = new Pepperoni(pizza);
        System.out.println(String.format("\nSua pizza: %s | Preço Total: R$ %.2f", pizza.getNome(), pizza.getPreco()));
        pizza = new Queijo(pizza);
        System.out.println(String.format("\nSua pizza : %s | Preço Total: R$ %.2f", pizza.getNome(), pizza.getPreco()));
        
        System.out.println("\n----------------- PIZZA DOCE -----------------");
        PizzaDoce pizzaDoce =  new Brigadeiro();
        pizzaDoce = new KitKat(pizzaDoce);
        System.out.println(String.format("Sua pizza: %s | Preço Total: R$ %.2f", pizzaDoce.getNome(), pizzaDoce.getPreco()));
        pizzaDoce = new Nutella(pizzaDoce);
        System.out.println(String.format("\nSua pizza: %s | Preço Total: R$ %.2f", pizzaDoce.getNome(), pizzaDoce.getPreco()));
        pizzaDoce = new Ninho(pizzaDoce);
        System.out.println(String.format("\nSua pizza: %s | Preço Total: R$ %.2f", pizzaDoce.getNome(), pizzaDoce.getPreco()));
        pizzaDoce = new Morango(pizzaDoce);
        System.out.println(String.format("\nSua pizza: %s | Preço Total: R$ %.2f", pizzaDoce.getNome(), pizzaDoce.getPreco()));
    }
    
}
