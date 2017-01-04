import ClockFigures.*;
import DisplayNodes.DisplayNode;
import Timings.TimeNode;

import java.util.LinkedList;

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
        DisplayNode seconds = secondsDisplay.getDisplay(time.getSeconds());
        LinkedList<DisplayNode> fiveHours = (LinkedList<DisplayNode>) fiveHoursDisplay.activateDisplays(time.getHours());
        LinkedList<DisplayNode> hours = (LinkedList<DisplayNode>) hoursDisplay.activateDisplays(time.getHours());
        LinkedList<DisplayNode> fiveMinutes = (LinkedList<DisplayNode>) fiveMinutesDisplay.activateDisplays(time.getHours());
        LinkedList<DisplayNode> minutes = (LinkedList<DisplayNode>) minutesDisplay.activateDisplays(time.getHours());
    }
}
