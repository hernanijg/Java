package Assignment._13ProductoWarehouse;

public class Product {
    private String name;
    private Double price;
    private int id;
    private static int autoId;
    {this.id = ++autoId;}

    public Product(){}
    public Product(String name) {
        this.name = name;
    }
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    // Getter and setter methods
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public Double getPrice() {return price;}
    public void setPrice(Double price) {this.price = price;}

    @Override
    public String toString(){
        StringBuilder message = new StringBuilder();
        message.append(this.name != null ? "Name: " + this.name + "\n" : "");
        message.append(this.price > 0.0 ? "Price: " + this.price + "\n" : "");
        String lastMessage = message.toString();
        return lastMessage;
    }
}
