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


    public BerlinClock() {
        secondsDisplay = new SecondsDisplay();
        fiveHoursDisplay = new FiveHoursDisplay();
        hoursDisplay = new HoursDisplay();
        fiveMinutesDisplay = new FiveMinutesDisplay();
        minutesDisplay = new MinutesDisplay();
    }

    public void setTime(TimeNode time){
        secondsDisplay.activateDisplays(time.getSeconds());
        fiveHoursDisplay.activateDisplays(time.getHours());
        hoursDisplay.activateDisplays(time.getHours());
        fiveMinutesDisplay.activateDisplays(time.getMinutes());
        minutesDisplay.activateDisplays(time.getMinutes());

        Beautify();
    }

    private void Beautify() {

        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println(secondsDisplay.getPrintableDisplay());
        System.out.println(fiveHoursDisplay.getPrintableDisplay());
        System.out.println(hoursDisplay.getPrintableDisplay());
        System.out.println(fiveMinutesDisplay.getPrintableDisplay());
        System.out.println(minutesDisplay.getPrintableDisplay());
    }
}
