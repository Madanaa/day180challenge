package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormatterWithTimeZoneMethod {

    public static class DateUtils {

        /**
         * Returns a formatted date string with the specified time zone.
         *
         * @param date The date to format.
         * @param format The format string to use (e.g. "MM/dd/yyyy HH:mm:ss").
         * @param timeZone The time zone to use (e.g. "America/New_York").
         * @return The formatted date string.
         */
        public static String dateFormatterWithTimeZone(String date, String format, String timeZone) throws ParseException {
            // Set the time zone
            TimeZone tz = TimeZone.getTimeZone(timeZone);

            // Create the date formatter with the specified format and time zone
            DateFormat formatter = new SimpleDateFormat(format);
            formatter.setTimeZone(tz);

            // Format the date and return the result
            return formatter.format(date);
        }
    }

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        String format = "MM/dd/yyyy HH:mm:ss";
        String timeZone = "America/New_York";
        String formattedDate = DateUtils.dateFormatterWithTimeZone("04-01-2023 01:32:27", format, timeZone);
        System.out.println(formattedDate);

    }
}
