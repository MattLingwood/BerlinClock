package ClockFigures;

import DisplayNodes.DisplayNode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public abstract class DisplayBase {
    protected LinkedList<DisplayNode> displayNodes = new LinkedList<>();
    protected static final String ANSI_RESET = "\u001B[0m";

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

    protected String createFourDisplayRow(LinkedList<DisplayNode> displayNodes) {
        String firstLine = "", secondLine = "", thirdLine = "";


        for (DisplayNode display : this.displayNodes){
            String colour = display.getColour();
            String ansiColour = display.getAnsiColour();

            firstLine+= ansiColour + "╔═══════╗" + ANSI_RESET;
            secondLine+= ansiColour + "║     "+colour+"      ║" + ANSI_RESET;
            thirdLine+= ansiColour + "╚═══════╝" + ANSI_RESET;
        }

        firstLine+="\n";
        secondLine+="\n";
        thirdLine+="\n";

        return firstLine + secondLine + thirdLine;
    }

    public abstract String getPrintableDisplay();

    public abstract List<DisplayNode> activateDisplays(int timePeriod);
}