package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;

import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public class MinutesDisplay extends DisplayBase {

    public MinutesDisplay(){
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
    }

    @Override
    public List<DisplayNode> activateDisplays(int timePeriod) {
        int activeDisplays = timePeriod%5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }
}
