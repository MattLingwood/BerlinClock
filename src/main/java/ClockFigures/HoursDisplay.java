package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */

public class HoursDisplay {

    private LinkedList<DisplayNode> displayNodes = new LinkedList<>();

    public HoursDisplay() {
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
    }

    public String getPrintableDisplay() {
        return DisplayHelper.createFourDisplayRow(displayNodes);
    }

    public List<DisplayNode> activateDisplays(int hours) {
        return DisplayHelper.turnDisplaysOn(hours % 5, displayNodes);
    }
}
