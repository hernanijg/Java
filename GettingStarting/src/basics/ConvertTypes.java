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
        numStr = "50.4";
        double realDouble = Double.parseDouble(numStr);
        System.out.println("real Double = " + realDouble);

        // str => boolean (Everything boolean words) [True, FALSE, fAlSe]
        String logicStr = "TRUE";
        boolean logicBoolean = Boolean.parseBoolean(logicStr);
        System.out.println("logic Boolean = " + logicBoolean);

        /* var only take the end */

    }
}
