package Assignment._8_MultiplyWithoutSign;

import java.util.Scanner;

public class MultiplyWithoutSign {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pase el numero a multiplicar: ");
        int num1 = scan.nextInt();

        System.out.println("Pase por cuanto lo vamos a multiplicar: ");
        int num2 = scan.nextInt();

        int result = 0;

        // two Negatives
        if (num1 < 0 && num2 < 0)
            for (int i = 0; i > num2; i--)
                result += -num1;
        // once negative
        else if (num2 < 0)
            for (int i = 0; i > num2; i--)
                result += -num1;
        // two Positives
        else for (int i = 0; i < num2; i++)
                result += num1;


        System.out.println("result = " + result);
        System.exit(0);
    }
}
