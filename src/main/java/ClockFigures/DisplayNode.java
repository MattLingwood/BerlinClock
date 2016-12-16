package ClockFigures;

/**
 * Created by Matt on 16/12/2016.
 */
public abstract class DisplayNode {
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
}
