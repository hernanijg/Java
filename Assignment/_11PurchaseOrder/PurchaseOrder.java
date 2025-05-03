package Assignment._11PurchaseOrder;

import java.util.Arrays;
import java.util.Date;

public class PurchaseOrder {
    private int id;
    private String description;
    private Date date;
    private Client client;
    private Products[] products = new Products[0];

    private static int lastId;

    public PurchaseOrder(String description) {
        this.id = ++lastId;
        this.description = description;
    }

    // Getter Methods
    public int getId() {return id;}
    public String getDescription() {return description;}
    public Date getDate() {return date;}
    public Client getClient() {return client;}
    public Products[] getProducts() {return products;}

    // Setter Methods
    public void setClient(Client client) {this.client = client;}
    public void setDate(Date date) {this.date = date;}

    public void addProducto (Products product) {
        int pCount = this.products.length;

            Products[] newProducts = Arrays.copyOf(this.products, pCount + 1);
            newProducts[pCount] = product;
            this.products = newProducts;

    }

    public int getTotal () {
        int t = 0;
        for (Products p: this.products) t += p.getPrice();

        return t;
    }
}
