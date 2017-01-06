package ClockFigures;

import DisplayNodes.DisplayNode;

import java.util.LinkedList;

/**
 * Created by Matt on 05/01/2017.
 */
public class Displays {
    public static String ANSI_RESET = "\u001B[0m";

    public void turnDisplaysOn(int activeDisplays, LinkedList<DisplayNode> displayNodes) {
        int counter = 0;
        for (DisplayNode display : displayNodes) {
            if (counter < activeDisplays) {
                display.setOn();
            } else {
                display.setOff();
            }
            counter++;
        }
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

    public int getActiveDisplays(LinkedList<DisplayNode> listOfDisplays) {
        return (int) listOfDisplays.stream().filter(display -> display.isOn()).count();
    }
}
