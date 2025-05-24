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

        System.out.println("==============");
        Map<String, Object> hm2 = new HashMap<>();
        hm2.put("FirstKet", hm); // We can anidate hashmaps.
        System.out.println(hm2);

        System.out.println("==============");
        Map<String, String> hm3 = (Map<String, String>)hm2.get("FirstKet");
        System.out.println(hm3.get("Name"));
        System.out.println(hm3.getOrDefault("Name2", "Default Text"));


    }
}
