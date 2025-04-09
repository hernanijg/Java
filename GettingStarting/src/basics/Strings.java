package basics;

public class Strings {
    public static void main(String[] args) {
        String str = "Java Programming";
        String strO = new String("Java Programming");
        String str1 = "java programming";
        boolean equalLogic = str == strO;

        /*  == compare for refence or obj
         *  str.equals(str0) compare content or str.equalsIgnoreCase(str0)
         *  String is special type, is an obj
         *  para optimizar si dos variables tienen el mismo contenido pasara a apuntar a la misma
         * referencia en memoria
         *  */

        System.out.println("equalLogic = " + equalLogic); // False
        System.out.println("str equals strO = " + str.equals(strO)); // True
        System.out.println("str1 = " + str1);


    }
}
