package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;

import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */

public class HoursDisplay extends DisplayBase {

    public HoursDisplay(){
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new RedDisplayNode());
    }

    @Override
    public String getPrintableDisplay() {
        return createFourDisplayRow();
    }

    public List<DisplayNode> activateDisplays(int hours) {

        int activeDisplays = hours%5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }


}
