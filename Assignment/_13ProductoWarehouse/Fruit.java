package Assignment._13ProductoWarehouse;

public class Fruit extends Product{
    private double weight;
    private String color;

    // Constructor
    public Fruit(){}
    public Fruit(double weight) {
        this.weight = weight;
    }
    public Fruit(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }
    public Fruit(String name, double weight, String color) {
        super(name);
        this.weight = weight;
        this.color = color;
    }
    public Fruit(String name, Double price, double weight, String color) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    // Getter and Setter
    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder(super.toString());
        message.append(this.color != null ? "Color: " + this.color + "\n" : "");
        message.append(this.weight > 0.0 ? "Weight: " + this.weight + "\n" : "");
        String lastMessage = message.toString();
        return lastMessage;

    }
}
