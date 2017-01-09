package ClockFigures;

import Lamps.Lamp;
import Lamps.LampColour;

import java.util.LinkedList;

/**
 * Created by Matt on 16/12/2016.
 */

public class HoursDisplay {

    private final Displays displays;
    private LinkedList<Lamp> lamps = new LinkedList<>();

    public HoursDisplay(Displays displays) {
        this.displays = displays;
        lamps.add(new Lamp(LampColour.RED));
        lamps.add(new Lamp(LampColour.RED));
        lamps.add(new Lamp(LampColour.RED));
        lamps.add(new Lamp(LampColour.RED));
    }

    public String getPrintableDisplay() {
        return displays.createFourDisplayRow(lamps);
    }

    public void activateDisplays(int hours) {
        displays.turnDisplaysOn(hours % 5, lamps);
    }
}
