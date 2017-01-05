import ClockFigures.*;
import Timings.TimeNode;

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
        secondsDisplay = new SecondsDisplay();
        fiveHoursDisplay = new FiveHoursDisplay();
        hoursDisplay = new HoursDisplay();
        fiveMinutesDisplay = new FiveMinutesDisplay();
        minutesDisplay = new MinutesDisplay();
    }

    public void setTime(TimeNode time){
        int hours = time.getHours();
        int minutes = time.getMinutes();

        if(hours!=storedHours){
            fiveHoursDisplay.activateDisplays(hours);
            hoursDisplay.activateDisplays(hours);
            storedHours = hours;
        }
        if(minutes!=storedMinutes){
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
