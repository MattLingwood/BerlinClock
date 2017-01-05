package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */

public class FiveHoursDisplay extends DisplayBase {

    public FiveHoursDisplay(){
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
    }

    @Override
    public String getPrintableDisplay() {
        return createFourDisplayRow(displayNodes);
    }


    public List<DisplayNode> activateDisplays(int hours) {

        int activeDisplays = hours/5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }
}
