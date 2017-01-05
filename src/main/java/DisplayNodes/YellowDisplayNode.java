package DisplayNodes;

/**
 * Created by Matt on 16/12/2016.
 */
public class YellowDisplayNode extends DisplayNode {

    public static final String OFF = "O";
    public static final String COLOUR = "Y";

    @Override
    public String getColour() {
        if (isOn()){
            return COLOUR;
        }
        return OFF;
    }
}
