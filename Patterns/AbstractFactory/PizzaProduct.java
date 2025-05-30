package Patterns.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProduct {
    protected String name;
    protected String mass;
    protected String souce;
    protected List<String> ingredients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public PizzaProduct() {
        this.ingredients = new ArrayList<>();
    }
    
    public void make() {
        System.out.println("Make: " + name);
        System.out.println("Select the mass: " + mass); 
        System.out.println("Add souce: " + souce);
        System.out.println("Add the ingredients: ");
        this.ingredients.forEach(System.out::println);
    }

    public void pack () {
        System.out.println("Put the pizza in the box..");
    }

    abstract public void cook();
    abstract public void cut();

    @Override
    public String toString() {
        return "PizzaProduct: " + 
                "name: " + name +
                "mass: " + mass +
                "souce: " + souce +
                "ingredients: " + ingredients;
    }

}
