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
        String firstLine = "", secondLine = "", thirdLine = "";

        int displayCounter=0;
        for (DisplayNode display : this.displayNodes){
            String colour = display.getColour();
            String ansiColour = display.getAnsiColour();

            if(displayCounter==2){
                firstLine+= ansiColour + "╔═╗ " + ANSI_RESET;
                secondLine+= ansiColour + "║"+colour+"║ " + ANSI_RESET;
                thirdLine+= ansiColour + "╚═╝ " + ANSI_RESET;
                displayCounter = 0;
                continue;
            }

            firstLine+= ansiColour + "╔═╗" + ANSI_RESET;
            secondLine+= ansiColour + "║"+colour+" ║" + ANSI_RESET;
            thirdLine+= ansiColour + "╚═╝" + ANSI_RESET;
            displayCounter += 1;
        }

        firstLine+="\n";
        secondLine+="\n";
        thirdLine+="\n";

        return firstLine + secondLine + thirdLine;
    }

    @Override
    public List<DisplayNode> activateDisplays(int minutes) {
        int activeDisplays = minutes/5;
        return turnDisplaysOn(activeDisplays, displayNodes);
    }
}
