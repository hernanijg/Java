import Filters.FilterUtils;
import basics.Variables;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n----Tested----\n");

        Variables.stringT();
        int[] result = FilterUtils.filterChar('a', "a la vibora de la mar");

        System.out.println(result[0]);
        System.out.println("\n----Did-------");
    }

}
