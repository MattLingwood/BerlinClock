package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;

import java.util.LinkedList;

/**
 * Created by Matt on 16/12/2016.
 */

public class HoursDisplay {

    private final Displays displays;
    private LinkedList<DisplayNode> displayNodes = new LinkedList<>();

    public HoursDisplay(Displays displays) {
        this.displays = displays;
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
    }

    public String getPrintableDisplay() {
        return displays.createFourDisplayRow(displayNodes);
    }

    public void activateDisplays(int hours) {
        displays.turnDisplaysOn(hours % 5, displayNodes);
    }
}
