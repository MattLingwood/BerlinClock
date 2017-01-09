package ClockFigures;

import Lamps.Lamp;
import Lamps.LampColour;

import java.util.LinkedList;

/**
 * Created by Matt on 16/12/2016.
 */
public class FiveMinutesDisplay {

    private final Displays displays;
    private LinkedList<Lamp> lamps = new LinkedList<>();

    public FiveMinutesDisplay(Displays displays) {
        this.displays = displays;
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.RED));
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.RED));
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.RED));
        lamps.add(new Lamp(LampColour.YELLOW));
        lamps.add(new Lamp(LampColour.YELLOW));
    }

    public String getPrintableDisplay() {
        String firstLine = "", secondLine = "", thirdLine = "";

        int displayCounter = 0;
        for (Lamp lamp : this.lamps) {
            String colour = lamp.getColour();
            String ansiColour = lamp.getAnsiColour();

            firstLine += ansiColour + "╔═╗" + Displays.ANSI_RESET;
            secondLine += ansiColour + "║" + colour + "║" + Displays.ANSI_RESET;
            thirdLine += ansiColour + "╚═╝" + Displays.ANSI_RESET;

            displayCounter += 1;

            if (displayCounter == 3) {
                firstLine += " ";
                secondLine += " ";
                thirdLine += " ";
                displayCounter = 0;
            }

        }

        firstLine += "\n";
        secondLine += "\n";
        thirdLine += "\n";

        return firstLine + secondLine + thirdLine;
    }

    public void activateDisplays(int minutes) {
        displays.turnDisplaysOn(minutes / 5, lamps);
    }
}
