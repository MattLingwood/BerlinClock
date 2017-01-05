package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.YellowDisplayNode;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by Matt on 16/12/2016.
 */
public class SecondsDisplay {

    private LinkedList<DisplayNode> displayNodes = new LinkedList<>();

    public SecondsDisplay() {
        displayNodes.add(new YellowDisplayNode());
    }

    public String getPrintableDisplay() {
        String s = displayNodes.getFirst().getColour();
        String ansiColour = displayNodes.getFirst().getAnsiColour();

        String display = ansiColour
                + "                 * *\n"
                + "               *     *\n"
                + "              *   " + s + "   *\n"
                + "               *     *\n"
                + "                 * *\n"
                + DisplayHelper.ANSI_RESET;

        return display;
    }

    public List<DisplayNode> activateDisplays(int seconds) {
        if (seconds % 2 == 0) {
            displayNodes.getFirst().setOn();
        } else {
            displayNodes.getFirst().setOff();
        }
        return displayNodes;
    }
}
