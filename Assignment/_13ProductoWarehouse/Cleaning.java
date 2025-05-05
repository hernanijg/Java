package Assignment._13ProductoWarehouse;

public class Cleaning extends Product{
    private String component;
    private double liters;

    // Constructors
    public Cleaning(){}
    public Cleaning(String component) {
        this.component = component;
    }
    public Cleaning(String component, double liters) {
        this.component = component;
        this.liters = liters;
    }
    public Cleaning(String name, String component, double liters) {
        super(name);
        this.component = component;
        this.liters = liters;
    }
    public Cleaning(String name, Double price, String component, double liters) {
        super(name, price);
        this.component = component;
        this.liters = liters;
    }

    // Getter and Setter
    public String getComponent() {return component;}
    public void setComponent(String component) {this.component = component;}
    public double getLiters() {return liters;}
    public void setLiters(double liters) {this.liters = liters;}

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder(super.toString());
        message.append(this.component != null ? "Component: " + this.component + "\n" : "");
        message.append(this.liters > 0.0 ? "Liters: " + this.liters + "\n" : "");
        String lastMessage = message.toString();
        return lastMessage;
    }
}
