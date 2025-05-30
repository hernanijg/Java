package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Factory.PizzaCaliforniaFactory;
import Patterns.AbstractFactory.Factory.PizzaNyFactory;
import Patterns.AbstractFactory.Factory.PizzaZoneFactory;

public class Ex {
    public static void main(String[] args) {
        PizzaZoneFactory ny = new PizzaNyFactory();
        PizzaZoneFactory california = new PizzaCaliforniaFactory();

        PizzaProduct pizza1 = california.orderPizza("Vegetarian");
        System.out.println("Bruce order the pizza: " + pizza1.getName());

        PizzaProduct pizza2 = california.orderPizza("Standar");
        System.out.println("Luis Order the pizza: " + pizza2.getName());

        PizzaProduct pizza3 = ny.orderPizza("Hawai");
        System.out.println("Marcus Order the pizza: " + pizza3.getName());
        
    }
}
