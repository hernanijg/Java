import Filters.FilterUtils;
import basics.Variables;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n----Tested----\n");

        Variables.stringT();
        ArrayList<Integer> indices = FilterUtils.filterCharIndices('a', "a la vibora de la mar");
        String messageReformer = FilterUtils.changeChar('i', indices, "a la vibora de la mar");

        System.out.println(messageReformer);
        System.out.println("\n----Did-------");



    }

}
