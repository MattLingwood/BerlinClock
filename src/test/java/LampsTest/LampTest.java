package LampsTest;

import Lamps.Lamp;
import Lamps.LampColour;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 09/01/2017.
 */
public class LampTest {

    private Lamp lamp;

    @Test
    public void red_node_is_off_by_default() {
        lamp = new Lamp(LampColour.RED);
        assertThat(lamp.isOn(), is(false));
    }

    @Test
    public void get_colour_is_off_by_default() {
        lamp = new Lamp(LampColour.RED);

        assertThat(lamp.getColour(), is("O"));
        assertThat(lamp.getAnsiColour(), is("\u001B[30m"));
    }

    @Test
    public void get_colour_is_red_when_set_on() {
        lamp = new Lamp(LampColour.RED);
        lamp.setOn();

        assertThat(lamp.getColour(), is("R"));
        assertThat(lamp.getAnsiColour(), is("\u001B[31m"));
    }

    @Test
    public void Get_colour_is_yellow_when_set_on() {
        lamp = new Lamp(LampColour.YELLOW);

        lamp.setOn();

        assertThat(lamp.getColour(), CoreMatchers.is("Y"));
        assertThat(lamp.getAnsiColour(), CoreMatchers.is("\u001B[33m"));
    }

    @Test
    public void Set_to_on_returns_true() {
        lamp = new Lamp(LampColour.RED);

        lamp.setOn();

        assertThat(lamp.isOn(), is(true));
    }

    @Test
    public void Set_to_off_returns_false() {
        lamp = new Lamp(LampColour.RED);

        lamp.setOff();

        assertThat(lamp.isOn(), is(false));
    }
}
