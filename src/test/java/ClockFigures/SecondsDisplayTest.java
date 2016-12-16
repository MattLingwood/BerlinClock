package ClockFigures;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class SecondsDisplayTest {

    @Test
    public void Even_seconds_are_Yellow(){
        SecondsDisplay secondsColour = new SecondsDisplay();

        DisplayNode display = secondsColour.getDisplay(10);

        assertThat(display.getColour(), is("Yellow"));
    }

    @Test
    public void Odd_seconds_are_Off() {
        SecondsDisplay secondsColour = new SecondsDisplay();

        DisplayNode display = secondsColour.getDisplay(9);

        assertThat(display.getColour(), is("Off"));
    }

    @Test
    public void On_off_on_are_Yellow_Off_Yellow(){
        SecondsDisplay secondsColour = new SecondsDisplay();

        DisplayNode firstNode = secondsColour.getDisplay(10);
        assertThat(firstNode.getColour(), is("Yellow"));

        DisplayNode secondNode = secondsColour.getDisplay(11);
        assertThat(secondNode.getColour(), is("Off"));

        DisplayNode thirdNode = secondsColour.getDisplay(12);
        assertThat(thirdNode.getColour(), is("Yellow"));
    }
}
