package operators;

public class MathOperator {
    public static void main(String[] args) {
        int i = 5, j = 4, sum = i + j;

        System.out.println("sum = " + sum);
        
        int subs = i - j;
        System.out.println("subs = " + subs);
        
        int mult = i - j;
        System.out.println("mult = " + mult);
        
        // We need cast in this case because i & j are int
        float div = (float) i / (float) j;
        System.out.println("div = " + div);

        // Take par and odd
        int rest = i % j ;
        System.out.println("rest = " + rest);
        rest = 8 % 3; // par
        System.out.println("rest = " + rest);


        /**
         * We can change unarios with (-1)*n
         */
        int n = -5; // => Negativo
        System.out.println("n = " + n);
        int p = -n; // => Positivo
        System.out.println("p = " + p);

        //Another change
        n = -10;
        System.out.println("n = " + n);
        p = (-1)*n; // => 10
        System.out.println("p = " + p);
    }
}
