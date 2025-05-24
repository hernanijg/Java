package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        hm.put(null, "1234"); // Only one null
        hm.put("Name", "Jhon");
        hm.put("LastName", "Doe");
        hm.put("Email", "jhondoe@email.com");
        hm.put("Age", "41");

        System.out.println("hm = " + hm);
        String name = hm.get("Name");

        System.out.println("name = " + name);

        System.out.println("==============");
        hm.replace("Name", "Jhon", "Many");
        for (Map.Entry<String, String> hma: hm.entrySet()) System.out.println(
                hma.getKey() + " => " + hma.getValue()
        );
    }
}
