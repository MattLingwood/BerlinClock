package ClockFigures;

import Lamps.Lamp;
import Lamps.LampColour;

import java.util.LinkedList;

/**
 * Created by Matt on 16/12/2016.
 */
public class MinutesDisplay {

    private LinkedList<Lamp> lamps = new LinkedList<>();
    private Displays displays;

    public MinutesDisplay(Displays displays) {
        this.displays = displays;
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.YELLOW));
    }

    public String getPrintableDisplay() {
        return displays.createFourDisplayRow(lamps);
    }

    public void activateDisplays(int minutes) {
        displays.turnDisplaysOn(minutes % 5, lamps);
    }
}
