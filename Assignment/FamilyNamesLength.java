package Assignment;

import javax.swing.*;
import java.util.Arrays;

public class FamilyNamesLength {
    public static void main(String[] args) {
        StringBuilder names = new StringBuilder("");
        int familyLength = 0;
        try {
             familyLength = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el numero de familiares"));
        } catch (Exception e) {
            System.out.println("Ingrese un numero valido");
            main(args);
        }

        for (int i = 0; i < familyLength; i++){
           names.append(JOptionPane.showInputDialog(
                   null,
                   "Ingrese el nombre del familiar #" + (i+1))
                   .concat((i+1) == familyLength ? "" : ",")
           );
        }

        String[] namesArg = names.toString().split(",");

        String nameL = "";
        for (int i = 0; i < namesArg.length; i++){
            if ((i + 1) == namesArg.length) break;

            if(nameL.isBlank()) {
                nameL = namesArg[i].length() > namesArg[i + 1].length() ?
                        namesArg[i] : namesArg[i + 1];
            } else {
                nameL = nameL.length() > namesArg[i + 1].length() ?
                        nameL : namesArg[i + 1];
            }

        }

        System.out.println("El nombre mas largo es: ".concat(nameL).concat(" \nCon ")
                .concat(String.valueOf(nameL.length())).concat(" caracteres"));
        System.exit(0);
    }
}
