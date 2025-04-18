package objs;

import java.util.Scanner;

public class DeleteArray {
    public static void main(String[] args) {
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }

        int posicion = 5;

        for (int i = posicion; i < a.length - 1; i++) {
            a[i] = a[i+1];
        }

//        for (int i = 0; i < a.length; i++) {
//            System.out.println(i +" => " + a[i]);
//        }

        int[] b = new int[a.length-1];
        // This copy by a[0] in b[0] to b[9]
        System.arraycopy(a, 0, b, 0, b.length);
        for (int i = 0; i < b.length; i++) {
            System.out.println(i +" => " + b[i]);

        }
    }
}
