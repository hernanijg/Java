package wrapper;

public class WrapperClass {
    public static void main(String[] args) {
        /**
         * i => Instance (Integer, Double ... )
         * e => Example (int, String, long ... )
         *
         * The Constants always are =>
         * i.MIN_VALUE
         * i.MAX_VALUE
         * i.POSITIVE_INFINITY
         * i.NEGATIVE_INFINITY
         *
         * Double & Float static methods =>
         *
         * i.valueOf(String)
         * i.valueOf(int)
         * i.parseDouble(String)
         * i.toString(e)
         * i.isNan(e) => Boolean
         * i.isInfinite(e) => Boolean
         * i.doubleToLongBits(e)
         * i.longBitsToDouble(e)
         */

        /**
         *  the static methods too (Integer, Short, Bits, Double ...) =>
         *  Create the var through class returns an instance of this.
         */

        Integer i = Integer.valueOf(1234567); // => Instance of Integer
        // Methods of Instances
        String s = i.toString();
        int j = i.intValue();
        long l = i.longValue();
        float f = i.floatValue();
        double d = i.doubleValue();

        /** Lost information
         * i.shortValue()
         * i.byteValue()
         */

        int k = Integer.parseInt("2345678");

        /** Same Methods
         * short and byte are same
         */
        long lO = Long.valueOf("2345645678"); // Instance of Long

        /** That is same float */
        double dO = Double.valueOf("23456f2"); // Istance of Double

        // This have a differentes static methos
        Character c = Character.valueOf('A'); // Instance of Char
        String sC = c.toString();
        char c2 = c.charValue();
        char c3 = Character.toLowerCase(c);
        boolean b = Character.isDigit(c);
        boolean b1 = Character.isAlphabetic(c);
        boolean b2 = Character.isUpperCase(c);
        boolean b3 = Character.isLowerCase(c);
        boolean b4 = Character.isLetter(c);
        boolean b5 = Character.isSpaceChar(c);
        // boolean b6 = Character.isSpaceChar(''); // I mean this is decreapet
        boolean b7 = Character.isDigit('7');

    }
}
