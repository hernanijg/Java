package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.PizzaProduct;
import Patterns.AbstractFactory.Products.PizzaStandar;
import Patterns.AbstractFactory.Products.PizzaVegetarianCalifornia;

public class PizzaCaliforniaFactory extends PizzaZoneFactory {

    @Override
    PizzaProduct makePizza(String type) {
        System.out.println("===== Order in California =====");
        PizzaProduct p = null;
        switch (type) {
            case "Vegetarian":
                p = new PizzaVegetarianCalifornia();
                break;

            case "Standar":
                p = new PizzaStandar();
                break;
            default:
                p = new PizzaStandar();
                break;
        }

        return p;
    }

}
