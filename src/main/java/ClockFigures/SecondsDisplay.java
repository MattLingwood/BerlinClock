package ClockFigures;

/**
 * Created by Matt on 16/12/2016.
 */
public class SecondsDisplay {
    private YellowDisplayNode display = new YellowDisplayNode();

    public DisplayNode getDisplay(int seconds) {

        if(seconds%2==0) {
            display.setOn();
        } else {
            display.setOff();
        }
        return display;
    }
}
