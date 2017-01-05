package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;

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
        String fh1 = displayNodes.get(0).getColour();
        String fh2 = displayNodes.get(1).getColour();
        String fh3 = displayNodes.get(2).getColour();
        String fh4 = displayNodes.get(3).getColour();

        String display = " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗ \n"
                        +" ║     "+fh1+"      ║║     "+fh2+"      ║║     "+fh3+"      ║║     "+fh4+"      ║ \n"
                        +" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝ \n";
        return display;
    }

    public List<DisplayNode> activateDisplays(int hours) {

        int activeDisplays = hours/5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }
}
