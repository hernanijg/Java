package Assignment;
import java.util.Scanner;
// 2
public class FamilyNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of family members");
        int familyLength = 0;
        try {
            familyLength = scan.nextInt();

        } catch (Exception e){
            System.out.println("Error: Please enter a valid number");
            scan.nextLine(); // Clean buffer
            main(args);
        }

        StringBuilder n = names(scan, familyLength);
        StringBuilder endM = nameTransform(scan, n);
        System.out.println(endM);
        System.exit(0);
    }


    public static StringBuilder names(Scanner scan, int familyLength){
        StringBuilder n = new StringBuilder("");
        scan.nextLine(); // Clear the newline character
        try {
            for (int i = 0; i < familyLength; i++){

                System.out.println("Enter name of family member #" + (i+1));
                if (i + 1 == familyLength){
                    n.append(scan.nextLine()); // Last name doesn't need comma
                } else {
                    n.append(scan.nextLine()).append(","); // Add comma separator
                }

            }
        } catch (Exception e) {
            System.out.println("Error: Please enter a valid name");
            scan.nextLine(); // Clear buffer
            names(scan, familyLength); // Retry
        }

        return n;
    }

    public static StringBuilder nameTransform(Scanner scan, StringBuilder names){
        String nameString = names.toString();
        String[] args = nameString.split(","); // Split by comma
        StringBuilder endMessage = new StringBuilder("");
        try {
            for (int i = 0; i < args.length; i++) {
                String n = args[i].trim(); // Remove whitespace
                String nLast = n.substring(n.length() - 2).toLowerCase(); // Get last 2 chars

                if (i + 1 == args.length) {
                    // Last name - no underscore needed
                    endMessage.append(n.substring(0, 1).toUpperCase()).append(".")
                            .append(nLast);
                } else {
                    // Other names - add underscore separator
                    endMessage.append(n.substring(0, 1).toUpperCase()).append(".")
                            .append(nLast)
                            .append("_");
                }
            }
        } catch (Exception e){
            System.out.println("Error while transforming names");
            scan.nextLine();
            System.exit(1);
        }

        return endMessage;
    }
}