package basics;

public class StringMethods {
    public static void main(String[] args) {
        String strE = "Jhon Doe";
        String strL = "Jhon Doe create the program universe";

        System.out.println("strE.length() = " + strE.length());
        System.out.println("strE.toLowerCase() = " + strE.toLowerCase());
        System.out.println("strE.toUpperCase = " + strE.toUpperCase());
        System.out.println("strE.equals = " + strE.equals("Jhon Doe"));
        System.out.println("strE.equalsIgnoreCase = " + strE.equalsIgnoreCase("jhon doe"));
        System.out.println("strE.compareTo = " + strE.compareTo("Jhon Doe")); // Orden Lexico grafico = True == 0
        System.out.println("strE.charAt(0) = " + strE.charAt(0)); // Take a character by ID
        System.out.println("strE.substring(2) = " + strE.substring(2));
        System.out.println("strE.substring(2, 5) = " + strE.substring(2, 5));
        System.out.println("strE.substring(strE.length()-1) = " + strE.substring(strE.length()-1));

        //=====

        System.out.println("strL.replace(\"o\", \"O\") = " + strL.replace("o", "O"));
        System.out.println("strL.indexOf(\"un\") = " + strL.indexOf("un")); // First incident
        System.out.println("strL.lastIndexOf(\"o\") = " + strL.lastIndexOf("o")); // Last Incident
        System.out.println("strL.indexOf('z') = " + strL.indexOf("z")); // => -1 (ERROR not found)
        System.out.println("strL.contains(\"z\") = " + strL.contains("z")); // => False, is same the last one
        System.out.println("strL.startsWith() = " + strL.startsWith("Jhon")); // => True
        System.out.println("strL.endsWith(\"<>\") = " + strL.endsWith("<>")); // => False


        // --- at arrays length is an attribute, no a method
        char [] arg = strL.toCharArray();
        String [] arg2 = strL.split(" ");
        int longs = arg.length;
        int longs2 = arg2.length;

        for (int i = 0; i < longs; i++){
            //System.out.println("arg[i] = " + arg[i]);
            System.out.print(arg[i]);
        }

        for (int i = 0; i < longs2; i++) {
            System.out.println(arg2[i]);
        }

        System.out.println("\n");
        System.out.println("   Jhon Doe End Examples  ".trim()); // take spaces

    }
}
