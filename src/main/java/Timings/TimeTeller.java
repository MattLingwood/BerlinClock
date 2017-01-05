package Timings;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Matt on 16/12/2016.
 */
public class TimeTeller {

    public TimeNode getTime() {
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar cali = Calendar.getInstance();
        return new TimeNode(timeFormat.format(cali.getTimeInMillis()));
    }
}
