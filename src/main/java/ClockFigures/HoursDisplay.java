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
        String h1 = displayNodes.get(0).getColour();
        String h2 = displayNodes.get(1).getColour();
        String h3 = displayNodes.get(2).getColour();
        String h4 = displayNodes.get(3).getColour();

        String display = " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗ \n"
                        +" ║     "+h1+"      ║║     "+h2+"      ║║     "+h3+"      ║║     "+h4+"      ║ \n"
                        +" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝ \n";
        return display;
    }

    public List<DisplayNode> activateDisplays(int hours) {

        int activeDisplays = hours%5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }


}
