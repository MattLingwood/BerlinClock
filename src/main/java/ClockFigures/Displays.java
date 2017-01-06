package ClockFigures;

import DisplayNodes.DisplayNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 05/01/2017.
 */
public class Displays {
    public static String ANSI_RESET = "\u001B[0m";

    public List<DisplayNode> turnDisplaysOn(int activeDisplays, LinkedList<DisplayNode> displayNodes) {
        int counter = 0;
        for (DisplayNode display : displayNodes) {
            if (counter < activeDisplays) {
                display.setOn();
            } else {
                display.setOff();
            }
            counter++;
        }
        return displayNodes;
    }

    public String createFourDisplayRow(LinkedList<DisplayNode> displayNodes) {
        String firstLine = "", secondLine = "", thirdLine = "";


        for (DisplayNode display : displayNodes) {
            String colour = display.getColour();
            String ansiColour = display.getAnsiColour();

            firstLine += ansiColour + "╔═══════╗" + ANSI_RESET;
            secondLine += ansiColour + "║   " + colour + "   ║" + ANSI_RESET;
            thirdLine += ansiColour + "╚═══════╝" + ANSI_RESET;
        }

        firstLine += "\n";
        secondLine += "\n";
        thirdLine += "\n";

        return firstLine + secondLine + thirdLine;
    }
}
