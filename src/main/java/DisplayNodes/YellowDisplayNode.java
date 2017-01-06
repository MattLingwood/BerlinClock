package DisplayNodes;

/**
 * Created by Matt on 16/12/2016.
 */
public class YellowDisplayNode extends DisplayNode {

    private static final String COLOUR = "Y";
    private static final String ANSI_COLOUR = "\u001B[33m";

    @Override
    public String getColour() {
        if (isOn()) {
            return COLOUR;
        }
        return OFF;
    }

    @Override
    public String getAnsiColour() {
        if (isOn()) {
            return ANSI_COLOUR;
        }
        return ANSI_OFF;
    }
}
