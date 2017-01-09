package ClockFigures;

import DisplayNodes.DisplayNode;
import Lamps.Lamp;

import java.util.LinkedList;

/**
 * Created by Matt on 05/01/2017.
 */
public class Displays {
    public static String ANSI_RESET = "\u001B[0m";

    public void turnDisplaysOn(int activeDisplays, LinkedList<Lamps.Lamp> displayNodes) {
        int counter = 0;
        for (Lamps.Lamp lamp : displayNodes) {
            if (counter < activeDisplays) {
                lamp.setOn();
            } else {
                lamp.setOff();
            }
            counter++;
        }
    }

    public String createFourDisplayRow(LinkedList<Lamps.Lamp> displayNodes) {
        String firstLine = "", secondLine = "", thirdLine = "";


        for (Lamps.Lamp lamp : displayNodes) {
            String colour = lamp.getColour();
            String ansiColour = lamp.getAnsiColour();

            firstLine += ansiColour + "╔═══════╗" + ANSI_RESET;
            secondLine += ansiColour + "║   " + colour + "   ║" + ANSI_RESET;
            thirdLine += ansiColour + "╚═══════╝" + ANSI_RESET;
        }

        firstLine += "\n";
        secondLine += "\n";
        thirdLine += "\n";

        return firstLine + secondLine + thirdLine;
    }

    public int getActiveDisplays(LinkedList<Lamp> listOfDisplays) {
        return (int) listOfDisplays.stream().filter(display -> display.isOn()).count();
    }
}
