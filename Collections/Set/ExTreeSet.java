package Collections.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ExTreeSet {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("One");
        ts.add("Two");
        ts.add("Three");
        ts.add("Three");
        ts.add("Four");
        ts.add("Five");

        System.out.println("ts = " + ts);
        
        Set<Integer> tsn = new TreeSet<>(Comparator.reverseOrder()); // Invert Sort
        tsn.add(1);
        tsn.add(2);
        tsn.add(3);
        tsn.add(4);
        tsn.add(5);
        System.out.println("tsn = " + tsn);
    }
}
