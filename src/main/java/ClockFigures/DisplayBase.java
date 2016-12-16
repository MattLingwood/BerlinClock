package ClockFigures;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public abstract class DisplayBase {
    protected List<DisplayNode> turnDisplaysOn(int activeDisplays, LinkedList<DisplayNode> displayNodes) {
        int counter=0;
        for (DisplayNode display: displayNodes){
            if(counter<activeDisplays){
                display.setOn();
            } else {
                display.setOff();
            }
            counter++;
        }
        return displayNodes;
    }

    public abstract List<DisplayNode> activateDisplays(int timePeriod);
}