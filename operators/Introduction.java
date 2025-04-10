package operators;

public class Introduction {

    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        // suma y luego asigna
        int c = ++a; // c => 3 & a => 3
        System.out.println("c = " + c);
        System.out.println("a = " + a);

        // Asigna y luego suma
        a = 3;
        int d = a++; // Ahora a => 4 y d => 3
        System.out.println("- d = " + d);
        System.out.println("- a = " + a);

        /**
         * Ternario
         * (conditional) ?  true ? false
         * a > b a Mayor
         * a < b a Menor
         * a >= b a Mayor o igual que be
         * a <= b a Menor o igual a b
         * a == b a Igual a b
         * a != b a Diferente a b
         * En los operadores logicos con uno solo (| or &) no tiene efecto cortocircuito
         */


    }
}

