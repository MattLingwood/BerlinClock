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
public class MinutesDisplayTest extends DisplayTestSpecification{
    private DisplayBase display;

    @Before
    public void init(){
        display = new MinutesDisplay();
    }

    @Test
    public void all_displays_are_off_by_default(){
        List<DisplayNode> activeDisplays = display.activateDisplays(0);

        assertThat((countActiveDisplays(activeDisplays)), is(0));
    }
    @Test
    public void One_returns_one_display(){
        List<DisplayNode> activeDisplays = display.activateDisplays(1);

        assertThat((countActiveDisplays(activeDisplays)), is(1));
    }

    @Test
    public void four_returns_four_displays(){
        List<DisplayNode> activeDisplays = display.activateDisplays(4);

        assertThat((countActiveDisplays(activeDisplays)), is(4));
    }

    @Test
    public void five_returns_zero_displays(){
        List<DisplayNode> activeDisplays = display.activateDisplays(5);

        assertThat(countActiveDisplays(activeDisplays), is(0));
    }

    @Test
    public void get_printable_display_returns_off_display_string_with_new_clock(){
        String expected = " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗ \n"
                +" ║     O      ║║     O      ║║     O      ║║     O      ║ \n"
                +" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝ \n";

        assertThat(display.getPrintableDisplay(),is(expected));
    }

    @Test
    public void get_printable_display_returns_3_yellow_display_string_with_3_minutes_time(){
        String expected = " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗ \n"
                +" ║     Y      ║║     Y      ║║     Y      ║║     O      ║ \n"
                +" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝ \n";

        display.activateDisplays(3);

        assertThat(display.getPrintableDisplay(),is(expected));
    }
}
