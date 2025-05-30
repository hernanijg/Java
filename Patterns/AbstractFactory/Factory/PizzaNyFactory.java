package Patterns.AbstractFactory.Factory;

import Patterns.AbstractFactory.PizzaProduct;
import Patterns.AbstractFactory.Products.PizzaHawaiNY;
import Patterns.AbstractFactory.Products.PizzaStandar;

public class PizzaNyFactory extends PizzaZoneFactory {

    @Override
    PizzaProduct makePizza(String type) {
        System.out.println("===== Order in NY =====");
        PizzaProduct p = null;

        switch (type) {
            case "Hawai":
                p = new PizzaHawaiNY();
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
