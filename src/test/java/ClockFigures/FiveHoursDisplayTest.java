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
    public void init() {
        Displays displays = new Displays();
        display = new FiveHoursDisplay(displays);
    }

    @Test
    public void Tenth_hour_returns_two_displays() {
        List<DisplayNode> activeDisplays = display.activateDisplays(10);

        assertThat((countActiveDisplays(activeDisplays)), is(2));
    }

    @Test
    public void Nineth_tenth_eleventh_return_one_two_two() {
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
    public void get_printable_display_returns_3_red_display_string_with_15_hours_time() {
        String expected =
                ANSI_RED + "╔═══════╗" + ANSI_RESET + ANSI_RED + "╔═══════╗" + ANSI_RESET + ANSI_RED + "╔═══════╗" + ANSI_RESET + ANSI_BLACK + "╔═══════╗" + ANSI_RESET + "\n"
                        + ANSI_RED + "║   R   ║" + ANSI_RESET + ANSI_RED + "║   R   ║" + ANSI_RESET + ANSI_RED + "║   R   ║" + ANSI_RESET + ANSI_BLACK + "║   O   ║" + ANSI_RESET + "\n"
                        + ANSI_RED + "╚═══════╝" + ANSI_RESET + ANSI_RED + "╚═══════╝" + ANSI_RESET + ANSI_RED + "╚═══════╝" + ANSI_RESET + ANSI_BLACK + "╚═══════╝" + ANSI_RESET + "\n";

        display.activateDisplays(15);

        assertThat(display.getPrintableDisplay(), is(expected));
    }
}
