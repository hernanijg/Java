package objs;

import java.util.Scanner;

public class DetectArrays {
    public static void main(String[] args) {
        int[] a = new int[5];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros:");

        for (int i = 0; i < 5; i++){
            a[i] = s.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for(int i = 0; i < a.length - 1; i++){
            /**
             * For string we need use the compareto method
             * like
             * a[i].compareTo(a[i+1] > 0)
             */
            // a[0] = 15 | a[1] = 1
            if (a[i] > a[i+1]) {
                descendente = true;
            }
            // a[0] = 10 | a[1] = 15
            if (a[i] < a[i+1]) {
                ascendente = true;
            }
        }

        if(ascendente == true && descendente == true) System.out.println("Arreglo: Desordentado");
        if(ascendente == true && descendente == false) System.out.println("Arreglo: Ascendente");
        if(ascendente == false && descendente == true) System.out.println("Arreglo: Decendente");
        if(ascendente == false && descendente == false) System.out.println("Arreglo: Todos Iguales");
    }
}
