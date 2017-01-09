package ClockFigures;

import Lamps.Lamp;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class SecondsDisplayTest extends DisplayTestSpecification {
    private SecondsDisplay display;

    @Before
    public void init() {
        Displays displays = new Displays();
        display = new SecondsDisplay(displays);
    }

    @Test
    public void On_off_on_are_Yellow_Off_Yellow() {
        List<Lamp> firstActiveDisplays = display.activateDisplays(10);
        String firstReturnedColour = firstActiveDisplays.get(0).getColour();
        List<Lamp> secondActiveDisplays = display.activateDisplays(11);
        String secondReturnedColour = secondActiveDisplays.get(0).getColour();
        List<Lamp> thirdActiveDisplays = display.activateDisplays(12);
        String thirdReturnedColour = thirdActiveDisplays.get(0).getColour();

        assertThat(firstReturnedColour, is("Y"));
        assertThat(secondReturnedColour, is("O"));
        assertThat(thirdReturnedColour, is("Y"));
    }

    @Test
    public void one_second_returns_off_display() {
        String expected = ANSI_BLACK
                + "                 * *\n"
                + "               *     *\n"
                + "              *   O   *\n"
                + "               *     *\n"
                + "                 * *\n"
                + ANSI_RESET;

        display.activateDisplays(1);

        assertThat(display.getPrintableDisplay(), is(expected));
    }

    @Test
    public void ten_seconds_returns_yellow_display() {
        String expected = ANSI_YELLOW
                + "                 * *\n"
                + "               *     *\n"
                + "              *   Y   *\n"
                + "               *     *\n"
                + "                 * *\n"
                + ANSI_RESET;

        display.activateDisplays(10);

        assertThat(display.getPrintableDisplay(), is(expected));
    }
}
