package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.YellowDisplayNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public class MinutesDisplay {

    private LinkedList<DisplayNode> displayNodes = new LinkedList<>();

    public MinutesDisplay() {
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
    }

    public String getPrintableDisplay() {
        return DisplayHelper.createFourDisplayRow(displayNodes);
    }

    public List<DisplayNode> activateDisplays(int minutes) {
        return DisplayHelper.turnDisplaysOn(minutes % 5, displayNodes);
    }


}
