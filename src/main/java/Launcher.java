import ClockFigures.SecondsDisplay;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Matt on 16/12/2016.
 */
public class Launcher {
    public static void main(String[] args) {
        SecondsDisplay clock = new SecondsDisplay();

        Calendar time = new GregorianCalendar();
        int currentSecond = time.get(Calendar.SECOND);

        System.out.println(clock.getDisplay(currentSecond));
    }
}
