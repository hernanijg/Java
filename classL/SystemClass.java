package classL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Properties;

public class SystemClass {
    public static void main(String[] args) {
        /**
         * The System class refered for UserSystem attributes
         * We use to little configure own space
         */

        // Little Classes
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separetor");
        System.out.println("lineSeparator = " + lineSeparator);


        // All propertias add in System class
        Properties p = System.getProperties();
        //p.list(System.out); // => soutv


        // Take the custom properties =>
        try {
            // Start at source dock
            FileInputStream file = new FileInputStream("classL/config.properties");
            System.out.println("file = " + file);
            p.load(file);
            //p.list(System.out);

            // => That is same but we need check the properties by System.
            p.setProperty("same.propertie", "propertie at Systemclass");
            System.setProperties(p);
            //System.getProperties().list(System.out);
        } catch (Exception e) {
            System.out.println("File not found");
        }
        
        // Env Vars =>
        Map<String, String> varEnv = System.getenv();
        System.out.println("varEnv = " + varEnv);

        String path = varEnv.get("PATH");
        System.out.println("path = " + path);
        return;
    }
}
