package basics;

public class Strings {
    public static void main(String[] args) {
        String str = "Java Programming";
        String strO = new String("Java Programming");
        String str1 = "java programming";
        boolean equalLogic = str == strO;

        /**
         *  == compare for refence or obj
         *  str.equals(str0) compare content or str.equalsIgnoreCase(str0)
         *  String is special type, is an obj
         *  para optimizar si dos variables tienen el mismo contenido pasara a apuntar a la misma
         * referencia en memoria
         *  */

        System.out.println("equalLogic = " + equalLogic); // False
        System.out.println("str equals strO = " + str.equals(strO)); // True
        System.out.println("str1 = " + str1);

        String teacher = "Andres Guzman";
        String detail = strO + " with " + teacher + " teacher ";
        System.out.println("detail = " + detail);

        int numA = 10;
        int numB = 20;

        /**
        * Remember use the () for int sum
        * la precedencia siempre va para los parentesis o de izquierda a derecha
        * .concat() is more efficiency at memory
        * */

        System.out.println(detail + numB + numA); //Java Programming with Andres Guzman teacher 2010
        System.out.println(detail + (numB + numA)); //Java Programming with Andres Guzman teacher 30

        String detail2 = strO.concat(" with ").concat(teacher).concat(" teacher");
        System.out.println("detail2 = " + detail2);


        /**
         * Crean una nueva instancia, no un nuevo objeto, solo siempre se debe asignar
         * transform, concat and replace
         */
        // Se trata como si fuera un flujo (Landa exprecion)
        String cO = strO.transform(c -> {
            System.out.println("c = " + c); // Same strO
            return c + " with " + teacher;
        });
        System.out.println("cO = " + cO);

        // No toma los acentos
        String replace = cO.replace("a", "A");
        System.out.println("replace = " + replace);

        String a = "a";
        String b = "b";
        String c = a;

        long initial = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(a);

        /**
         * Concat para menos caracteres
         * las sumas a rangos medios
         * y StringBuilder para todo
         * */
        for (int i = 0; i < 1; i++){
            // c += a + b + "\n"; // 500 => 13ms | 15000 => 216ms
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 5ms | 15000 => 453ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms | 15000 => 5ms
        }

        long end = System.currentTimeMillis();

        //System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(end - initial);

        // If string is null, the methods gift error because it don't have reference
        String strN = null;
        String strEmpty = "";
        String strEmpty2 = " ";
        boolean strNB = strN == null;

        /**
         * Isblank is more estricto y segura but is only +JDK11
         * isEmpty take the space
         */
        System.out.println("strEmpty = " + strEmpty.isEmpty());
        System.out.println("strEmpty2 = " + strEmpty2.isBlank());
        System.out.println("strNB = " + strNB);

        /** This is error => NullPointerException
         * System.out.println("strN.toLowerCase() = " + strN.toLowerCase());
         * Se puede concatenar con los +
        */

    }
}
