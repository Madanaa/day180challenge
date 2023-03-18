package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateWithTimeZoneDemo {

    private static String modifyDateLayout(String inputDate) throws ParseException{
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z").parse(inputDate);
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(date);
    }
    public static void main(String[] args) throws ParseException {
        String inputDate = "2010-01-04 01:32:27 UTC";
        String newDate;
        newDate = modifyDateLayout(inputDate);
        System.out.println(newDate);
    }
}
