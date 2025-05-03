package Assignment._11PurchaseOrder;

import java.util.Date;

public class NewOrder {
    public static void main(String[] args) {
        // Order #1
        PurchaseOrder order1 = new PurchaseOrder("Order #1");
        order1.setClient(new Client("Juan", "Gutierrez"));
        order1.setDate(new Date());

        order1.addProducto(new Products("T-shirt", "Polo", 20));
        order1.addProducto(new Products("Pants", "Adidas", 45));
        order1.addProducto(new Products("Shoes", "Nike", 145));
        order1.addProducto(new Products("Socks", "Tommy", 5));

        printOrder(order1);
        // ====

        // Order #2
        PurchaseOrder order2 = new PurchaseOrder("Order #2");
        order2.setClient(new Client("Jhon", "Doe"));
        order2.setDate(new Date());

        order2.addProducto(new Products("Watch", "Rolex", 2000));
        order2.addProducto(new Products("Sunglases", "Sunglasses+", 45));
        order2.addProducto(new Products("Shoes", "Versace", 300));
        order2.addProducto(new Products("Coat", "Zara", 200));

        printOrder(order2);
        // ====

        // Order #1
        PurchaseOrder order3 = new PurchaseOrder("Order #3");
        order3.setClient(new Client("Mauro", "Perez"));
        order3.setDate(new Date());

        order3.addProducto(new Products("Air Max 360", "Nike", 130));
        order3.addProducto(new Products("Jordan Retro 1", "Nike", 299));
        order3.addProducto(new Products("Body Ensurence", "Ensurence+", 39));
        order3.addProducto(new Products("Bag V", "Adidas", 99));

        printOrder(order3);
    }

    public static void printOrder(PurchaseOrder order){
        System.out.println("\nDescription: " + order.getDescription() +
                "\nUser: " + order.getClient().getName() + " " + order.getClient().getLastname() +
                "\nDate: " + order.getDate() +
                "\nProducts: "
        );

        for (Products p: order.getProducts())
            System.out.println(p.getName() + " (" + p.getManufacurer() + ")" + "\tPrice: " + p.getPrice() + "$");

        System.out.println("Total: " + order.getTotal() + "$");
        System.out.println("============");
    }
}
