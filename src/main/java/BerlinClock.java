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
        LinkedList<DisplayNode> fiveMinutes = (LinkedList<DisplayNode>) fiveMinutesDisplay.activateDisplays(time.getMinutes());
        LinkedList<DisplayNode> minutes = (LinkedList<DisplayNode>) minutesDisplay.activateDisplays(time.getMinutes());

        Beautify(seconds, fiveHours, hours, fiveMinutes, minutes);
    }

    private void Beautify(DisplayNode seconds, LinkedList<DisplayNode> fiveHours, LinkedList<DisplayNode> hours, LinkedList<DisplayNode> fiveMinutes, LinkedList<DisplayNode> minutes) {

        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        String s = seconds.getColour();
        System.out.println(
"                              * *                               \n"
+"                            *     *                             \n"
+"                           *   "+s+"   *                            \n"
+"                            *     *                             \n"
+"                              * *                               \n");

        String fh1 = fiveHours.get(0).getColour();
        String fh2 = fiveHours.get(1).getColour();
        String fh3 = fiveHours.get(2).getColour();
        String fh4 = fiveHours.get(3).getColour();

        System.out.print(
" ╔═══════╗╔═══════╗╔═══════╗╔═══════╗ \n"
+" ║     "+fh1+"      ║║     "+fh2+"      ║║     "+fh3+"      ║║     "+fh4+"      ║ \n"
+" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝ \n");

        String h1 = hours.get(0).getColour();
        String h2 = hours.get(1).getColour();
        String h3 = hours.get(2).getColour();
        String h4 = hours.get(3).getColour();

        System.out.print(
" ╔═══════╗╔═══════╗╔═══════╗╔═══════╗ \n"
+" ║     "+h1+"      ║║     "+h2+"      ║║     "+h3+"      ║║     "+h4+"      ║ \n"
+" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝ \n");

        String fm1 = fiveMinutes.get(0).getColour();
        String fm2 = fiveMinutes.get(1).getColour();
        String fm3 = fiveMinutes.get(2).getColour();
        String fm4 = fiveMinutes.get(3).getColour();
        String fm5 = fiveMinutes.get(4).getColour();
        String fm6 = fiveMinutes.get(5).getColour();
        String fm7 = fiveMinutes.get(6).getColour();
        String fm8 = fiveMinutes.get(7).getColour();
        String fm9 = fiveMinutes.get(8).getColour();
        String fm10 = fiveMinutes.get(9).getColour();
        String fm11 = fiveMinutes.get(10).getColour();

        System.out.print(
" ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗  ╔═╗╔═╗╔═╗  ╔═╗╔═╗ \n"
+" ║"+fm1+" ║║"+fm2+"║║"+fm3+" ║ ║"+fm4+" ║║"+fm5+" ║║"+fm6+"║  ║"+fm7+" ║║"+fm8+" ║║"+fm9+"║  ║"+fm10+" ║║"+fm11+" ║ \n"
+" ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝ \n");

        System.out.println(minutesDisplay.getPrintableDisplay());
    }
}
