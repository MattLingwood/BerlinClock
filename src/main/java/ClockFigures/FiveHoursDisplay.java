package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */

public class FiveHoursDisplay {

    private final Displays displays;
    private LinkedList<DisplayNode> displayNodes = new LinkedList<>();

    public FiveHoursDisplay(Displays displays) {
        this.displays = displays;
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
    }

    public String getPrintableDisplay() {
        return displays.createFourDisplayRow(displayNodes);
    }

    public List<DisplayNode> activateDisplays(int hours) {
        return displays.turnDisplaysOn(hours / 5, displayNodes);
    }
}
