package basics;

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
    }

}
