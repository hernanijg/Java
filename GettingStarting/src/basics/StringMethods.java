package basics;

public class StringMethods {
    public static void main(String[] args) {
        String strE = "Jhon Doe";

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
        
    }
}
