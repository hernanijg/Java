package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el nombre de la factura: ");
        String reciveName = scanner.nextLine();

        double price1 = producto(scanner, 1);
        double price2 = producto(scanner, 2);

        double[] sumaArg = {price1, price2};

        // Lo encontre despues de hacer el for >:|
        //double sum1 = Arrays.stream(sumaArg).sum();
        //System.out.println("sum1 = " + sum1);

        double suma = sumProductos(sumaArg);

        double tax = suma * 0.19;
        double total = suma + tax;

        System.out.printf("La factura \"%s\" dio un total bruto de %.2f, con un impuesto de %.2f y el monto después de impuesto es de %.2f",
                reciveName, suma, tax, total);

        System.exit(0);
    }

    public static double producto(Scanner scan, int productN){
        double price = 0.0D;
        System.out.println("Escriba el precio del producto #" + productN);

        try {
            price = scan.nextDouble();
        } catch (Exception e){
            System.out.println("Error: Porfavor ingrese un numero valido.");
            scan.nextLine(); // Clean buffer
            producto(scan, productN);
        }

        return price;
    }

    // Se pueden sumar mas de dos productos
    public static double sumProductos(double[] products){
        double suma = 0.0;
        for (int i = 0; i < products.length; i++){
            suma += products[i];
        }

        return suma;
    }
}
