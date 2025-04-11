package controlFlows;

public class Sentences {
    public static void main(String[] args) {
        /**
         * if, else and else if
         *
         *  is the basic conditional
         *  We can change for a ternario
         */
        if (false) System.out.println("Enter at true");
        else System.out.println("Enter at false");

        /**
         * Validate an instance with cases
         * the default instance is a good practice, the break too
         * */
        int n = 1;
        switch (n){
            case 0:
                System.out.println(n);
                break;
            case 1:
                System.out.println("n = " + n);
                break;
            case 2:
                System.out.println("n = " + n);
                break;
            default:
                System.out.println(" No valor encontrado");
        }
    }
}
