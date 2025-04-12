package Assignment._10_AgeCalculator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Age Calculator - Calculates precise age based on birth date
 * Note: Uses legacy Date/Calendar classes for educational purposes
 * (Modern Java should use java.time package instead)
 */
public class AgeCalculator {
    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth date (yyyy-MM-dd): ");

        // Date formatter for expected input pattern
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date bornD = new Date(); // Placeholder initialization

        try {
            // Parse user input into Date object
            bornD = df.parse(scan.next());
        } catch (Exception e) {
            // Handle invalid date format
            System.out.println("Please enter a date in the following format:" +
                    "\nExample: 2020-03-03 (yyyy-MM-dd)");
            // Recursively restart on error (not recommended for production)
            main(args);
            return;
        }

        // Get current date and set birth date for comparison
        Calendar currentC = Calendar.getInstance();
        Calendar bornC = Calendar.getInstance();
        bornC.setTime(bornD);

        int age = 0;

        // Only calculate if birth year is in past
        if (bornC.get(Calendar.YEAR) < currentC.get(Calendar.YEAR)) {
            // Base age calculation (year difference)
            age = currentC.get(Calendar.YEAR) - bornC.get(Calendar.YEAR);

            /* Age Adjustment Logic:
             * 1. If birth month hasn't occurred yet this year → subtract 1
             * 2. If same month but birth day hasn't occurred → subtract 1
             */
            if (bornC.get(Calendar.MONTH) > currentC.get(Calendar.MONTH)) {
                age--;
            } else if (bornC.get(Calendar.MONTH) == currentC.get(Calendar.MONTH)) {
                if (bornC.get(Calendar.DAY_OF_MONTH) > currentC.get(Calendar.DAY_OF_MONTH)) {
                    age--;
                }
            }

            System.out.println("Age: " + age);
        } else {
            // Handle future dates
            System.out.println("The person hasn't been born yet.");
        }

        System.exit(0); // Explicit termination
    }
}