import ClockFigures.*;
import Timings.TimeNode;
import Timings.TimeTeller;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Matt on 16/12/2016.
 */
public class BerlinClock {
    private SecondsDisplay secondsDisplay;
    private FiveHoursDisplay fiveHoursDisplay;
    private HoursDisplay hoursDisplay;
    private FiveMinutesDisplay fiveMinutesDisplay;
    private MinutesDisplay minutesDisplay;

    private int storedHours, storedMinutes;


    public BerlinClock() {
        Displays displays = new Displays();
        secondsDisplay = new SecondsDisplay(displays);
        fiveHoursDisplay = new FiveHoursDisplay(displays);
        hoursDisplay = new HoursDisplay(displays);
        fiveMinutesDisplay = new FiveMinutesDisplay(displays);
        minutesDisplay = new MinutesDisplay(displays);
    }

    public void startClock() {
        Timer timer = new Timer("Display Timer");

        TimerTask task = getTimerTask();

        timer.scheduleAtFixedRate(task, 1000, 1000);
    }

    protected TimerTask getTimerTask() {
        return new TimerTask() {
            @Override
            public void run() {
                TimeNode time = new TimeTeller().getTime();
                setTime(time);
            }
        };
    }

    public void setTime(TimeNode time) {
        int hours = time.getHours();
        int minutes = time.getMinutes();

        if (hours != storedHours) {
            fiveHoursDisplay.activateDisplays(hours);
            hoursDisplay.activateDisplays(hours);
            storedHours = hours;
        }
        if (minutes != storedMinutes) {
            fiveMinutesDisplay.activateDisplays(minutes);
            minutesDisplay.activateDisplays(minutes);
            storedMinutes = minutes;
        }

        secondsDisplay.activateDisplays(time.getSeconds());

        Beautify();
    }

    private void Beautify() {

        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.print(secondsDisplay.getPrintableDisplay());
        System.out.print(fiveHoursDisplay.getPrintableDisplay());
        System.out.print(hoursDisplay.getPrintableDisplay());
        System.out.print(fiveMinutesDisplay.getPrintableDisplay());
        System.out.print(minutesDisplay.getPrintableDisplay());
    }
}
