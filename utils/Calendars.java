package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendars {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // this is a special unboxing.

        // Set a specift Time
        // c.set(2020, Calendar.MARCH, 25, 19, 20, 40);
        // => That is same this but this have more control of variants
        c.set(Calendar.YEAR, 2020);
        c.set(Calendar.MONTH, Calendar.MARCH);
        c.set(Calendar.DAY_OF_MONTH, 25);

        c.set(Calendar.HOUR, 9);
        c.set(Calendar.AM_PM, Calendar.PM);
        c.set(Calendar.MINUTE, 19);
        c.set(Calendar.SECOND, 20);
        c.set(Calendar.MILLISECOND, 40);

        Date d = c.getTime();

        // Simple format, check de Dates.java File for more
        SimpleDateFormat df = new SimpleDateFormat("EE dd 'to' MMMM, yyyy 'Hour:' hh:mm:ss:SS a");
        String dSF = df.format(d);

        System.out.println("d = " + dSF);
    }
}
