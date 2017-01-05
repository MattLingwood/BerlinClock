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
public class FiveHoursDisplayTest extends DisplayTestSpecification {
    private FiveHoursDisplay display;

    @Before
    public void init(){
        display = new FiveHoursDisplay();
    }

    @Test
    public void All_displays_are_off_by_default(){
        List<DisplayNode> activeDisplays = display.activateDisplays(0);

        assertThat((countActiveDisplays(activeDisplays)), is(0));
    }

    @Test
    public void Fifth_hour_first_display_only(){
        List<DisplayNode> activeDisplays = display.activateDisplays(5);

        assertThat((countActiveDisplays(activeDisplays)), is(1));
    }
    @Test
    public void Nineth_hour_first_display_only(){
        List<DisplayNode> activeDisplays = display.activateDisplays(9);

        assertThat((countActiveDisplays(activeDisplays)), is(1));
    }

    @Test
    public void Tenth_hour_returns_two_displays(){
        List<DisplayNode> activeDisplays = display.activateDisplays(10);

        assertThat((countActiveDisplays(activeDisplays)), is(2));
    }

    @Test
    public void fifteenth_hour_returns_three_displays(){
        List<DisplayNode> activeDisplays = display.activateDisplays(15);

        assertThat((countActiveDisplays(activeDisplays)), is(3));
    }

    @Test
    public void twentieth_hour_returns_four_displays(){
        List<DisplayNode> activeDisplays = display.activateDisplays(20);

        assertThat((countActiveDisplays(activeDisplays)), is(4));
    }

    @Test
    public void Nineth_tenth_eleventh_return_one_two_two(){
        List<DisplayNode> activeDisplays = display.activateDisplays(9);
        int countOne = countActiveDisplays(activeDisplays);
        List<DisplayNode> activeDisplaysTwo = display.activateDisplays(10);
        int countTwo = countActiveDisplays(activeDisplaysTwo);
        List<DisplayNode> activeDisplaysThree = display.activateDisplays(11);
        int countThree = countActiveDisplays(activeDisplaysThree);

        assertThat(countOne, is(1));
        assertThat(countTwo, is(2));
        assertThat(countThree, is(2));
    }

    @Test
    public void get_printable_display_returns_off_display_string_with_new_clock(){
        String expected = " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗ \n"
                +" ║     O      ║║     O      ║║     O      ║║     O      ║ \n"
                +" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝ \n";

        assertThat(display.getPrintableDisplay(),is(expected));
    }

    @Test
    public void get_printable_display_returns_3_red_display_string_with_15_hours_time(){
        String expected = " ╔═══════╗╔═══════╗╔═══════╗╔═══════╗ \n"
                +" ║     R      ║║     R      ║║     R      ║║     O      ║ \n"
                +" ╚═══════╝╚═══════╝╚═══════╝╚═══════╝ \n";

        display.activateDisplays(15);

        assertThat(display.getPrintableDisplay(),is(expected));
    }
}
