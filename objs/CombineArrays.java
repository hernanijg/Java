package objs;

public class CombineArrays {
    public static void main(String[] args) {
        int [] a, b, c;
        a = new int[10];
        b = new int[10];
        c = new int[20]; // Combine arrays (a+b)

        // Only assign values to a and b
        for (int i = 0; i < a.length; i++){
            a[i] = i + 1;
        }
        for (int i = 0; i < b.length; i++){
            b[i] = (i+1) * 5;
        }
        // -----

        // Combine arrays
        int aux = 0;
        // Here is b.lenth but we can a.length too
//        for (int i = 0; i < b.length; i++){
//            c[aux++] = a[i]; // Assig in c[0] a[0] => next I: c[2] a[1]
//            c[aux++] = b[i]; // Assig in c[1] b[0] => next I: c[3] b[1]
//        }

        aux = 0;
        /**
         * @The arrays usually are divisible by 3 or 2
         * this option is for optimice iterations and code
         * and consume fewer resources
         * @We can iterar by 3 too, only change i+=2 for i+=3 and j < 2 for j < 3
         * but that is only for arrays divisible by 3
         */
        for (int i = 0; i < b.length; i+=2) {
            for (int j = 0; j < 2; j++) {
                c[aux++] = a[i+j]; // Assig in c[0] a[0] => next I: c[1] a[1]

            }for (int j = 0; j < 2; j++) {
                c[aux++] = b[i+j]; // Assig in c[3] b[0] => next I: c[4] b[1]
            }
        }

        // Only show the array 
        for (int i = 0; i < c.length; i++){
            System.out.println("c[i] = " + c[i]);
        }
    }
}
