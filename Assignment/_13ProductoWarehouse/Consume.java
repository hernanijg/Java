package Assignment._13ProductoWarehouse;

public class Consume {
    public static void main(String[] args) {
        Product[] products = new Product[8];
        // Fruit products
        products[0] = new Fruit("Apple", 0.39, 1.2, "Red");
        products[1] = new Fruit("Apple", 0.49, 0.98, "Green");

        // Cleaning products
        products[2] = new Cleaning("Desifectante", 4.99, "Chloruro", 1.0);
        products[3] = new Cleaning("Sodio", 1.99, "Sodio", 1.0);

        // Not Perceivable Products
        products[4] = new NotPerceivable("Oreo", 5.99, 200, 400);
        products[5] = new NotPerceivable("Dorito", 4.99, 500, 200);

        // Milk Products
        products[6] = new Milk("Milk 99% pasture", 4.99, 2, 9);
        products[7] = new Milk("Chease Cotija", 6.99, 10, 4);

        int pc = 0;
        for(Product p: products) {
            System.out.println("Welcome to product list: #" + ++pc);
            System.out.println(p);
        }
    }
}
