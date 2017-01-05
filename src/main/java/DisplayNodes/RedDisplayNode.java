package DisplayNodes;

/**
 * Created by Matt on 16/12/2016.
 */
public class RedDisplayNode extends DisplayNode {

    private final String OFF = "O";
    private final String COLOUR = "R";

    @Override
    public String getColour() {
        if(isOn()) {
            return COLOUR;
        }
        return OFF;
    }
}
