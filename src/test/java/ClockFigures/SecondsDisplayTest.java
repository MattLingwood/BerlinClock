package ClockFigures;

import DisplayNodes.DisplayNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class SecondsDisplayTest {
    private SecondsDisplay display;

    @Before
    public void init(){
        display = new SecondsDisplay();
    }

    @Test
    public void Even_seconds_are_Yellow(){
        DisplayNode node = display.getDisplay(10);

        assertThat(node.getColour(), is("Y"));
    }

    @Test
    public void Odd_seconds_are_Off() {
        DisplayNode node = display.getDisplay(9);

        assertThat(node.getColour(), is("O"));
    }

    @Test
    public void On_off_on_are_Yellow_Off_Yellow(){
        DisplayNode firstNode = display.getDisplay(10);
        String firstReturnedColour = firstNode.getColour();
        DisplayNode secondNode = display.getDisplay(11);
        String secondReturnedColour = secondNode.getColour();
        DisplayNode thirdNode = display.getDisplay(12);
        String thirdReturnedColour = thirdNode.getColour();

        assertThat(firstReturnedColour, is("Y"));
        assertThat(secondReturnedColour, is("O"));
        assertThat(thirdReturnedColour, is("Y"));
    }
}
