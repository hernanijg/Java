package Assignment._6_NumbersCompare;

import java.util.Scanner;

public class NumbersCompare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a comparar");
        int count = 0;

        try {
            int value = scan.nextInt();
            if (value >= 10)
                count = value;
            else {
                System.out.println("El numero minimos a comparar es 10");
                scan.nextLine();
                main(args);
            }
        } catch (Exception e){
            System.out.println("e = " + e);
            scan.nextLine();
            main(args);
        }
        
        int max = 0;

        compare:
        for (int i = 1; i <= count; i++){
            System.out.println("Ingrese el valor del #: " + i);
            
            if (max == 0) {
                max = scan.nextInt();
                continue compare;
            }
            
            int nCompare = scan.nextInt();
            if(max > nCompare){
                continue compare;
            } else {
                max = nCompare;
            }
            
        }

        System.out.println("max = " + max);
        System.exit(0);
    }
}
