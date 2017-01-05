package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;
import DisplayNodes.YellowDisplayNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public class FiveMinutesDisplay {

    private LinkedList<DisplayNode> displayNodes = new LinkedList<>();

    public FiveMinutesDisplay() {
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
    }

    public String getPrintableDisplay() {
        String firstLine = "", secondLine = "", thirdLine = "";

        int displayCounter = 0;
        for (DisplayNode display : this.displayNodes) {
            String colour = display.getColour();
            String ansiColour = display.getAnsiColour();

            firstLine += ansiColour + "╔═╗" + DisplayHelper.ANSI_RESET;
            secondLine += ansiColour + "║" + colour + "║" + DisplayHelper.ANSI_RESET;
            thirdLine += ansiColour + "╚═╝" + DisplayHelper.ANSI_RESET;

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

    public List<DisplayNode> activateDisplays(int minutes) {
        return DisplayHelper.turnDisplaysOn(minutes / 5, displayNodes);
    }
}
