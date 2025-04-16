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
        int total = product.length;

        for (int i = 0; i < total - 1; i++){
            for (int j = 0; j < total - 1 - i; j++){
                // For int compare to only compare Integer
                if(product[j+1].compareTo(product[j]) < 0){
                    // Compare j0 to j1 and continue with j1 to j2 and follow
                    String aux = product[j];
                    product[j] = product[j+1];
                    product[j+1] = aux;
                }
            }
        }

    }
    public static void sortBurbuja(Object[] arg){
        int total = arg.length, count = 0;

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
