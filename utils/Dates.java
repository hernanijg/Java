package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);

        /**
         * EE => String Day (First 3)
         * EEEE => Full String Day
         * dd => Int Day
         * MMMM => String Month
         * MM => Int Month
         * YYYY => Year
         * for custom text we need use '' => 'to'
         */
        SimpleDateFormat df = new SimpleDateFormat("EE dd 'to' MMMM, yyyy");
        String dateStr = df.format(date);

        System.out.println("dateStr = " + dateStr);

        Date date2 = new Date();
        long dateEnd = date2.getTime() - date.getTime(); // Milisegundos
        System.out.println("dateEnd = " + dateEnd);
    }
}
