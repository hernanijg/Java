package basics;

public class ConvertTypes {
    public static void main(String[] args) {
        // str => int / byte / short / long
        String numStr = "50";
        int numInt = Integer.parseInt(numStr);
        byte numByte = Byte.parseByte(numStr);
        System.out.println("num Integer = " + numInt);
        System.out.println("num Byte = " + numByte);

        // str => double / float
        numStr = "5032.34e4";
        double realDouble = Double.parseDouble(numStr);
        System.out.println("real Double = " + realDouble);

        // str => boolean (Everything boolean words) [True, FALSE, fAlSe]
        String logicStr = "TRUE";
        boolean logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logic Boolean = " + logicBoolean);

        /* var only take the end */

        // Basic Convert
        int otherNumInt = 50;
        String otherNumStr = Integer.toString(otherNumInt);
        System.out.println("other Num Str = " + otherNumStr);

        /*
         sobrecarga de metodo (valueOf) int / byte / short / long
         Si es String + int concatena
         int + int suma
         */

        otherNumStr = String.valueOf(otherNumStr);
        System.out.println("otherNumStr = " + otherNumStr);

        // Double and float / double
        String otherRealStr = Double.toString(realDouble);
        System.out.println("otherRealStr = " + otherRealStr);
        // value.of work to
        float otherRealFloat = 100.32E2f;
        otherRealStr = String.valueOf(otherRealFloat);
        System.out.println("otherRealFloat = " + otherRealFloat);

        // force convert and lose information
        int i = 32767;
        short s = (short) i; // force/cast convert (32768 error)
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        
        char c = (char) i; //character Unicode 翿
        System.out.println("c = " + c);
        float f = (float) i;
        System.out.println("f = " + f);
    }
}
