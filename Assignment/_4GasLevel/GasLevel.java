package Assignment._4GasLevel;

import java.util.Scanner;

// #3
public class GasLevel {
    public static void main(String[] args) {
        int gas = 0;
        String status = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese cantidad de gas que posee: ");
        gas = scan.nextInt();

        if(gas == 70){
            status += "Tanque lleno";
        } else if (gas >= 60 && gas < 70) {
            status += "Tanque casi lleno";
        } else if (gas >= 40 && gas < 60) {
            status += "Tanque entre 3/4";
        } else if (gas >= 35 && gas < 40) {
            status += "Medio Tanque";
        } else if (gas >= 20 && gas < 35) {
            status += "Suficiente";
        } else if (gas >= 1 && gas < 20) {
            status += "Insuficiente";
        } else {
            status += "Apagado";
        }

        System.out.println("status = " + status);
    }
}
