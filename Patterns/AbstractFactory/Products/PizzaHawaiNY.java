package Patterns.AbstractFactory.Products;

import Patterns.AbstractFactory.PizzaProduct;

public class PizzaHawaiNY extends PizzaProduct{

    public PizzaHawaiNY() {
        super();
        name = "NY Standar Hawai.";
        mass = "Mass Integral";
        souce = "Tomatto";
        ingredients.add("Chasse");
        ingredients.add("Pineaple");
        ingredients.add("Beacon");
    }

    @Override
    public void cook() {
        System.out.println("Cooking up for 25m a 150^C.");
    }

    @Override
    public void cut() {
        System.out.println("Cut in tringles.");
    }
    
}
