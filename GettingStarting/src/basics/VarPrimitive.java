package basics;

public class VarPrimitive {

    public static void main(String[] args) {

        /* Numbers (Always start in 0<L,f,d> but only for class var) */
        //-128 to 127
        byte num1 = 127; // 8 bits -> 1 byte
        //-32768 to 32767
        short num2 = 32767;  // 16 bits -> 2 byte
        //-2147483648 to 2147483647
        int num3 = 2147483647; // 32 bits -> 4 byte
        // -9223372036854775808L to 9223372036854775807L  (A LOT)
        long num4 = 9223372036854775807L;// 64 bits -> 8 byte

        // 32 bits -> 4 byte
        float realFloat = 3.1316f;
        // 64 bits -> 8 byte
        double realDouble = 4.71E2D; // E3 4710.0 | E2 471.0 Positive
        double realDoubleN = 4.71E-3D; // E-3 0.00471 | E-2 0.0471 Negative


        /* Boolean > 1 bit (Default bool is false) */
        boolean a = true;
        boolean b = false;

        /* String (Default char is u0000) */
        // 16 bites -> 2  byte
        char _a = 'a';
        char _b = '\u0021';
        char _c = '\t';

        /*EXAMPLES*/
        System.out.println("Byte: " + Integer.BYTES);
        System.out.println("Short: " + Short.BYTES);
        System.out.println("Short: " + Short.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE);

        // int = 32768 > short = 32767

        System.out.println(Integer.MIN_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE);
        System.out.println("Float Bytes: " + Float.BYTES);
        System.out.println("Double Bytes: " + Double.BYTES);


        // This is int, no short or byte
        var flexibleVar = 127; // JDK 10 or more
        var flexibleLong = 127L; // Only for L, we can use f and d too
        var flexibleDouble = 3.14; // Default is Double
        var flexibleFloat = 3.14F;
    }
}
