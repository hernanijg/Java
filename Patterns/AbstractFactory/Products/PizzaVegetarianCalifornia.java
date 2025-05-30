package Patterns.AbstractFactory.Products;

import Patterns.AbstractFactory.PizzaProduct;

public class PizzaVegetarianCalifornia extends PizzaProduct {
        
    public PizzaVegetarianCalifornia() {
        super();
        name = "Vegetarian.";
        mass = "Mass Integral";
        souce = "Tomatto";
        ingredients.add("Chasse");
        ingredients.add("Toffu");
    }

    @Override
    public void cook() {
        System.out.println("Cooking up for 20m a 180^C.");
    }

    @Override
    public void cut() {
        System.out.println("Cut in tringles.");
    }
}
