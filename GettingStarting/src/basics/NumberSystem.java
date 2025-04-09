package basics;

import javax.swing.*;

public class NumberSystem {

    public static void main(String[] args) {
        int numDec = 500;
        System.out.println("numDec = " + numDec);

        System.out.println("binario = " + numDec + " = " + Integer.toBinaryString(numDec));
        int numByte = 0B111110100; // Bytes

        System.out.println("Octal = " + numByte + " = " + Integer.toOctalString(numByte));
        int numOctal = 0764;

        System.out.println("Hex= " + numOctal + " = " + Integer.toHexString(numDec));
        int numHex = 0x1f4;

        //System.out.println("numHex = " + numHex);
        // Everything in console is 500 :0

        // - Entry System
        String numDecJopS = JOptionPane.showInputDialog(null, "Enter a Integer num");
        int numDecJop = 0;

        // Error Control
        try {
            numDecJop = Integer.parseInt(numDecJopS);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: Enter a Integer number");
            main(args);
            System.exit(0);
        };

        System.out.println("\nnumDecJop = " + numDecJop);

        // String Concat example
        String message = "Byte = " + numDecJop + " = " + Integer.toBinaryString(numDecJop);
        message += "\nOctal = " + numDecJop + " = " + Integer.toOctalString(numDecJop);
        message += "\nHex = " + numDecJop + " = " + Integer.toHexString(numDecJop);

        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}
