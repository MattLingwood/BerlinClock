package LampsTest;

import Lamps.LampColour;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 09/01/2017.
 */
public class LampColourTest {

    private LampColour lampColour;

    @Test
    public void red_lamp_colour_returns_red_string_and_ansi_code_for_red() {
        lampColour = LampColour.RED;

        assertThat(lampColour.getColour(), is("R"));
        assertThat(lampColour.getAnsiColour(), is("\u001B[31m"));
    }

    @Test
    public void yellow_lamp_returns_yellow_string_and_ansi_code_for_yellow() {
        lampColour = LampColour.YELLOW;

        assertThat(lampColour.getColour(), is("Y"));
        assertThat(lampColour.getAnsiColour(), is("\u001B[33m"));
    }
}