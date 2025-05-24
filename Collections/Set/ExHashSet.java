package Collections.Set;

import java.util.*;

public class ExHashSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("One");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Five");

        boolean b = hs.add("Three");

        // Wrong => Collections.sort((List)hs);
        //        System.out.println("Are set duplicable? : " + b);
        //        System.out.println(hs);

        // .... ==

        String [] fish = {"Salmon", "Salmon", "Tuna", "Sharm", "Mojarra", "Bagre", "Bagre"};
        Set<String> u = new HashSet<>();
        Set<String> d = new HashSet<>();

        for(String f: fish) {
            if (!u.add(f)) d.add(f);
        }

        u.removeAll(d);

        System.out.println(d);
        System.out.println(u);
    }
}
