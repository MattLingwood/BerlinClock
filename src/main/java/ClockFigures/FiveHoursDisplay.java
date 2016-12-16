package ClockFigures;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */

public class FiveHoursDisplay extends DisplayBase {

    private LinkedList<DisplayNode> displayNodes = new LinkedList<>();

    public FiveHoursDisplay(){
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
    }

    public List<DisplayNode> activateDisplays(int hours) {

        int activeDisplays = hours/5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }
}