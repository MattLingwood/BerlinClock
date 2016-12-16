import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Matt on 16/12/2016.
 */
public class TimeTeller {

    public String getTime() {
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:00");
        Calendar cali = Calendar.getInstance();
        return timeFormat.format(cali.getTimeInMillis());
    }
}
