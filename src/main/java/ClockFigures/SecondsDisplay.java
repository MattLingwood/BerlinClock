package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.YellowDisplayNode;

import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public class SecondsDisplay extends DisplayBase{

    public SecondsDisplay() {
        displayNodes.add(new YellowDisplayNode());
    }

    @Override
    public String getPrintableDisplay() {
        String s = displayNodes.getFirst().getColour();

        String display = "                              * *                               \n"
                        +"                            *     *                             \n"
                        +"                           *   "+s+"   *                            \n"
                        +"                            *     *                             \n"
                        +"                              * *                               \n";

        return display;
    }

    @Override
    public List<DisplayNode> activateDisplays(int seconds) {
        if(seconds%2==0) {
            displayNodes.getFirst().setOn();
        } else {
            displayNodes.getFirst().setOff();
        }
        return displayNodes;
    }
}
