package Assignment._11PurchaseOrder;

public class Products {
    private String name;
    private String manufacurer;
    private int price;

    public Products() {}

    public Products(String name, String manufacurer, int price) {
        this.name = name;
        this.manufacurer = manufacurer;
        this.price = price;
    }

    public String getName() {return name;}
    public String getManufacurer() {return manufacurer;}
    public int getPrice() {return price;}

}
