package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.YellowDisplayNode;

import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public class MinutesDisplay extends DisplayBase {

    public MinutesDisplay(){
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
    }

    @Override
    public String getPrintableDisplay() {
        return createFourDisplayRow();
    }

    @Override
    public List<DisplayNode> activateDisplays(int minutes) {
        int activeDisplays = minutes%5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }


}
