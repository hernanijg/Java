package Assignment;

import java.util.Scanner;

public class NumbersOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = 0.0, b = 0.0;

        System.out.println("Ingrese el primer valor: ");
        a = scan.nextDouble();

        System.out.println("Ingrese el segundo valor: ");
        b = scan.nextDouble();

        System.out.printf("El orden es: " + ((a > b)
                ? (a + ", " + b)
                : (b + ", " + a)
        ));
    }
}
