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
public class FiveMinutesDisplayTest extends DisplayTestSpecification {
    private FiveMinutesDisplay display;

    @Before
    public void init() {
        Displays displays = new Displays();
        display = new FiveMinutesDisplay(displays);
    }

    @Test
    public void twenty_five_returns_5_active_displays() {

        List<DisplayNode> activeDisplays = display.activateDisplays(25);

        assertThat((countActiveDisplays(activeDisplays)), is(5));
    }

    @Test
    public void fifty_five_returns_eleven_active_displays() {

        List<DisplayNode> activeDisplays = display.activateDisplays(55);

        assertThat(countActiveDisplays(activeDisplays), is(11));
    }

    @Test
    public void fifteen_minutes_returns_red_red_yellow_rest_off_display_string() {
        String expected =
                ANSI_YELLOW + "╔═╗" + ANSI_RESET + ANSI_YELLOW + "╔═╗" + ANSI_RESET + ANSI_RED + "╔═╗" + ANSI_RESET + " " + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + " " + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + " " + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + "\n"
                        + ANSI_YELLOW + "║Y║" + ANSI_RESET + ANSI_YELLOW + "║Y║" + ANSI_RESET + ANSI_RED + "║R║" + ANSI_RESET + " " + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + " " + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + " " + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + "\n"
                        + ANSI_YELLOW + "╚═╝" + ANSI_RESET + ANSI_YELLOW + "╚═╝" + ANSI_RESET + ANSI_RED + "╚═╝" + ANSI_RESET + " " + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + " " + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + " " + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + "\n";

        display.activateDisplays(15);

        assertThat(display.getPrintableDisplay(), is(expected));
    }
}
