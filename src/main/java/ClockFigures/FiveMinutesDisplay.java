package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;
import DisplayNodes.YellowDisplayNode;

import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public class FiveMinutesDisplay extends DisplayBase {

    public FiveMinutesDisplay(){
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
    public String getPrintableDisplay() {
        String fm1 = displayNodes.get(0).getColour();
        String fm2 = displayNodes.get(1).getColour();
        String fm3 = displayNodes.get(2).getColour();
        String fm4 = displayNodes.get(3).getColour();
        String fm5 = displayNodes.get(4).getColour();
        String fm6 = displayNodes.get(5).getColour();
        String fm7 = displayNodes.get(6).getColour();
        String fm8 = displayNodes.get(7).getColour();
        String fm9 = displayNodes.get(8).getColour();
        String fm10 = displayNodes.get(9).getColour();
        String fm11 = displayNodes.get(10).getColour();

        String display = " ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗  ╔═╗╔═╗╔═╗  ╔═╗╔═╗ \n"
                        +" ║"+fm1+" ║║"+fm2+"║║"+fm3+" ║ ║"+fm4+" ║║"+fm5+" ║║"+fm6+"║  ║"+fm7+" ║║"+fm8+" ║║"+fm9+"║  ║"+fm10+" ║║"+fm11+" ║ \n"
                        +" ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝ \n";
        return display;
    }

    @Override
    public List<DisplayNode> activateDisplays(int minutes) {
        int activeDisplays = minutes/5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }
}
