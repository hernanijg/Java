package objs;

public class Arrays {
    public static void main(String[] args) {
        String[] product = {
                "Kingstin Oendrive",
                "Disco duro ssd",
                "Asus Notebook",
                "Macbook Pro 15Inc"
        };

        // Burble method =>
        sortBurbuja(product);

        System.out.println(java.util.Arrays.toString(product));

    }

    // Burble method
    public static void sortBurbuja(Object[] arg){
        int total = arg.length;

        // Follow the sentences
        for (int i = 0; i < total - 1; i++){
            // Follow the instance and optimice code
            for (int j = 0; j < total - 1 - i; j++){
                // Cast the arg to comparable obj
                if (((Comparable) arg[j+1]).compareTo(arg[j]) < 0 ){
                    // Save arg[0]
                    Object aux = arg[j];
                    // Assign arg[1] in arg[0]
                    arg[j] = arg[j+1];
                    // Assign arg[0] in arg[1]
                    arg[j+1] = aux;
                }
            }
        }
    }
}
