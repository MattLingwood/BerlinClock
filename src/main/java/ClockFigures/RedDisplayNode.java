package ClockFigures;

/**
 * Created by Matt on 16/12/2016.
 */
public class RedDisplayNode extends DisplayNode{

    private final String OFF = "Off";
    private final String COLOUR = "Red";

    @Override
    public String getColour() {
        if(isOn()) {
            return COLOUR;
        }
        return OFF;
    }
}
