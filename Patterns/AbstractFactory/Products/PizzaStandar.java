package Patterns.AbstractFactory.Products;

import Patterns.AbstractFactory.PizzaProduct;

public class PizzaStandar extends PizzaProduct{
    
    public PizzaStandar() {
        super();
        name = "Standar";
        mass = "Mass Integral";
        souce = "Tomatto";
        ingredients.add("Chasse");
        ingredients.add("Pepperoni");
    }

    @Override
    public void cook() {
        System.out.println("Cooking up for 30m a 160^C.");
    }

    @Override
    public void cut() {
        System.out.println("Cut in tringles.");
    }
}
