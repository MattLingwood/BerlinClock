package Lamps;

/**
 * Created by Matt on 09/01/2017.
 */
public class Lamp {

    private final String ANSI_OFF = "\u001B[30m";
    private final String OFF = "O";
    private final String ANSI_COLOUR;
    private final String COLOUR;
    private boolean on = false;

    public Lamp(LampColour lampColourEnum) {
        COLOUR = lampColourEnum.getColour();
        ANSI_COLOUR = lampColourEnum.getAnsiColour();
    }

    public boolean isOn() {
        return on;
    }

    public void setOn() {
        on = true;
    }

    public void setOff() {
        on = false;
    }

    public String getColour() {
        if (isOn()) {
            return COLOUR;
        }
        return OFF;
    }

    public String getAnsiColour() {
        if (isOn()) {
            return ANSI_COLOUR;
        }
        return ANSI_OFF;
    }
}
