package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.PizzaProduct;

public abstract class PizzaZoneFactory {
    
    public PizzaProduct orderPizza(String type) {
        PizzaProduct pizza = makePizza(type);
        
        System.out.println("Make pizza ---- " + pizza.getName());
        pizza.make();
        pizza.cook();
        pizza.cut();
        pizza.pack();

        return pizza;
    }

    abstract PizzaProduct makePizza(String type);
}
