package ClockFigures;

import Lamps.Lamp;
import Lamps.LampColour;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by Matt on 16/12/2016.
 */
public class SecondsDisplay {

    private LinkedList<Lamp> lamps = new LinkedList<>();

    public SecondsDisplay(Displays displays) {
        lamps.add(new Lamp(LampColour.YELLOW));
    }

    public String getPrintableDisplay() {
        String s = lamps.getFirst().getColour();
        String ansiColour = lamps.getFirst().getAnsiColour();

        String display = ansiColour
                + "                 * *\n"
                + "               *     *\n"
                + "              *   " + s + "   *\n"
                + "               *     *\n"
                + "                 * *\n"
                + Displays.ANSI_RESET;

        return display;
    }

    public List<Lamp> activateDisplays(int seconds) {
        if (seconds % 2 == 0) {
            lamps.getFirst().setOn();
        } else {
            lamps.getFirst().setOff();
        }
        return lamps;
    }
}
