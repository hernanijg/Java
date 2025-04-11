package Assignment.MenuOptions_9;

import javax.swing.*;
import java.util.*;

public class MenuOptions {
    public static void main(String[] args) {
        // Create a map to store menu options and their corresponding values
        Map<String, Integer> options = new HashMap();
        options.put("Update", 1);
        options.put("Delete", 2);
        options.put("Add", 3);
        options.put("List", 4);
        options.put("Exit", 5);

        // Convert option keys to array for JOptionPane
        Object[] opArray = options.keySet().toArray();
        Object option;

        // Create product database
        Map<String, Integer> products = new HashMap();
        products.put("Default Product", 0);
        products.put("Test Product", 1);

        Object[] productsArray = products.keySet().toArray();
        Object productSelect;

        // Variables for product updates
        String productName;
        int productCount;

        // Main program loop
        do {
            // Display main menu and get user selection
            option = JOptionPane.showInputDialog(null,
                    "Select an option: ",
                    "Product Manager",
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opArray,
                    opArray[4] // Default to "Exit"
            );

            // Handle window close/cancel action - exit gracefully
            if (option == null) System.exit(0);

            // Handle selected option
            switch (String.valueOf(option)) {
                case "Update":
                    productSelect = selectionProduct(productsArray);
                    productName = productSelect.toString();
                    productCount = products.get(productName);

                    if (productName.equals("Default Product")) {
                        JOptionPane.showMessageDialog(null, "Please select a valid product");
                        break;
                    } else {
                        String newProduct = JOptionPane.showInputDialog(null, "Enter the new product name");
                        productCount = takeCount();

                        // Update product in database
                        products.remove(productName);
                        products.put(newProduct, productCount);
                        // Refresh product list
                        productsArray = products.keySet().toArray();
                    }
                    break;

                case "Delete":
                    productSelect = selectionProduct(productsArray);
                    productName = productSelect.toString();

                    if (productName.equals("Default Product")) {
                        JOptionPane.showMessageDialog(null, "Please select a valid product");
                        break;
                    } else {
                        // Remove product from database
                        products.remove(productName);
                        // Refresh product list
                        productsArray = products.keySet().toArray();
                        JOptionPane.showMessageDialog(null, "Product deleted");
                    }
                    break;

                case "Add":
                    // Add new product to database
                    products.put(
                            JOptionPane.showInputDialog("Enter product name"),
                            takeCount()
                    );
                    // Refresh product list
                    productsArray = products.keySet().toArray();
                    JOptionPane.showMessageDialog(null, "Product added");
                    break;

                case "List":
                    String message = "";
                    // Build list of all products
                    for (Object product: productsArray) {
                        message += product.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, message);
                    break;
            }
        } while (!option.equals("Exit"));

        System.exit(0);
    }

    /**
     * Helper method to display product selection dialog
     * @param productsArray Array of available products
     * @return Selected product
     */
    public static Object selectionProduct(Object[] productsArray) {
        Object productSelect = JOptionPane.showInputDialog(null,
                "Select a product: ",
                "Product Manager",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                productsArray,
                productsArray[0] // Default to first product
        );

        return productSelect;
    }

    /**
     * Safely reads and validates a product quantity from user input.
     * Handles invalid inputs by showing an error and retrying.
     * @return Valid quantity entered by the user.
     */
    public static int takeCount(){
        int count = 0;
        try {
            count = Integer.parseInt(JOptionPane.showInputDialog("Enter product quantity"));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "We need a valid number");
            return takeCount();
        }

        return count;
    }
}
