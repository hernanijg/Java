package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ExArrayList {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("One");
        a.add("Two");
        a.add("Three");
        a.add("Four");
        a.add("Five");
        
        a.set(1, "Two Edit");
        System.out.println("a = " + a);

        a.remove(a.get(1));
        System.out.println("a = " + a);

        //a.forEach(System.out::println);
    }
}
