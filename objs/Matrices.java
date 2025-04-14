package objs;

import java.net.Inet4Address;
import java.util.Arrays;

public class Matrices {
    public static void main(String[] args) {
        /**
         * This is like excel
         * int num = new int[2][2]
         * The colums are optionals because is variable
         * r|c=>
         * -|1|2
         * 1|1|2  => num[0][0] | num[0][1]
         * 2|1|2  => num[1][0] | num[1][1]
         */

        // This is like int[][] num = new Int[2][4]
        int[][] num = {{1,2,3,4}, {12,13,14,15}}; // Is same arrays

        System.out.println("num[1][3] = " + num[1][3]);
        System.out.println("num.length = " + num.length); // => Rows Lengs
        System.out.println("num[0].length = " + num[0].length); // => Columns Lengs


        for (int i = 0; i < num.length; i++){ // Rows It
            System.out.println("Row: " + i);
            for (int j = 0; j < num[0].length; j++){ // Colums It
                System.out.print(num[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

        // More simple but only for static values
        for(int[] num1 : num){
            System.out.println("Row: " + Arrays.toString(num1));
            for(int num2 : num1){
                System.out.print(num2+ "\t");
            }
            System.out.println();
        }

    }

}
