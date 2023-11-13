
/*
 * Activity 2.5.9

 */
import java.util.Calendar;

public class CalendarRun {

    public static String getDateTime() {
        Calendar cal = Calendar.getInstance(); 
        String dateTimeStr = cal.getTime().toString(); 
    
        return dateTimeStr; 
    }
}