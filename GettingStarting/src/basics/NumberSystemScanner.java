package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSystemScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        //String numDStr = scanner.nextLine();
        int numD = 0;
        try {
            numD = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Enter a num");
            main(args);
            System.exit(0);
        }

        String message = "Num Enter is = " + numD;
        System.out.println(message);
    }

}
