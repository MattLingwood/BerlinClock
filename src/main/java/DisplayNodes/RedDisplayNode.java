package DisplayNodes;

/**
 * Created by Matt on 16/12/2016.
 */
public class RedDisplayNode extends DisplayNode {

    private static final String ANSI_COLOUR = "\u001B[31m";
    private final String COLOUR = "R";

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
