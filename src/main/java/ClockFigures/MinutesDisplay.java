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
        String m1 = displayNodes.get(0).getColour();
        String m2 = displayNodes.get(1).getColour();
        String m3 = displayNodes.get(2).getColour();
        String m4 = displayNodes.get(3).getColour();

        String display = " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗ \n"
                        +" ║     "+m1+"      ║║     "+m2+"      ║║     "+m3+"      ║║     "+m4+"      ║ \n"
                        +" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝ \n";

        return display;
    }

    @Override
    public List<DisplayNode> activateDisplays(int minutes) {
        int activeDisplays = minutes%5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }


}
