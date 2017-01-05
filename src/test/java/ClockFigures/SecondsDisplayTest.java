package ClockFigures;

import DisplayNodes.DisplayNode;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class SecondsDisplayTest extends DisplayTestSpecification{
    private SecondsDisplay display;

    @Before
    public void init(){
        display = new SecondsDisplay();
    }

    @Test
    public void Even_seconds_are_Yellow(){
        List<DisplayNode> activeDisplays = display.activateDisplays(10);

        assertThat((countActiveDisplays(activeDisplays)), is(1));
    }

    @Test
    public void Odd_seconds_are_Off() {
        List<DisplayNode> activeDisplays = display.activateDisplays(9);

        assertThat((countActiveDisplays(activeDisplays)), is(0));
    }

    @Test
    public void On_off_on_are_Yellow_Off_Yellow(){
        List<DisplayNode> firstActiveDisplays = display.activateDisplays(10);
        String firstReturnedColour = firstActiveDisplays.get(0).getColour();
        List<DisplayNode> secondActiveDisplays = display.activateDisplays(11);
        String secondReturnedColour = secondActiveDisplays.get(0).getColour();
        List<DisplayNode> thirdActiveDisplays = display.activateDisplays(12);
        String thirdReturnedColour = thirdActiveDisplays.get(0).getColour();

        assertThat(firstReturnedColour, is("Y"));
        assertThat(secondReturnedColour, is("O"));
        assertThat(thirdReturnedColour, is("Y"));
    }
}
