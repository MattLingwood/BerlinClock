package DisplayNodes;

/**
 * Created by Matt on 16/12/2016.
 */
public abstract class DisplayNode {

    protected static final String ANSI_OFF = "\u001B[30m";
    protected static final String OFF = "O";
    private boolean on = false;

    public boolean isOn() {
        return on;
    }

    public void setOn() {
        on = true;
    }

    public void setOff() {
        on = false;
    }

    public abstract String getColour();

    public abstract String getAnsiColour();
}
