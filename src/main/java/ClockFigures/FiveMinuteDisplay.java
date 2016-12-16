package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;
import DisplayNodes.YellowDisplayNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public class FiveMinuteDisplay extends DisplayBase {

    private LinkedList<DisplayNode> displayNodes = new LinkedList<>();

    public FiveMinuteDisplay(){
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new RedDisplayNode());
        displayNodes.add(new YellowDisplayNode());
        displayNodes.add(new YellowDisplayNode());
    }


    @Override
    public List<DisplayNode> activateDisplays(int minutes) {
        int activeDisplays = minutes/5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }
}
