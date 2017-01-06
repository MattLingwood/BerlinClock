package ClockFigures;

import org.junit.Before;
import org.junit.Test;

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
    public void fifteen_minutes_returns_red_red_yellow_rest_off_display_string() {
        String expected =
                ANSI_YELLOW + "╔═╗" + ANSI_RESET + ANSI_YELLOW + "╔═╗" + ANSI_RESET + ANSI_RED + "╔═╗" + ANSI_RESET + " " + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + " " + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + " " + ANSI_BLACK + "╔═╗" + ANSI_RESET + ANSI_BLACK + "╔═╗" + ANSI_RESET + "\n"
                        + ANSI_YELLOW + "║Y║" + ANSI_RESET + ANSI_YELLOW + "║Y║" + ANSI_RESET + ANSI_RED + "║R║" + ANSI_RESET + " " + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + " " + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + " " + ANSI_BLACK + "║O║" + ANSI_RESET + ANSI_BLACK + "║O║" + ANSI_RESET + "\n"
                        + ANSI_YELLOW + "╚═╝" + ANSI_RESET + ANSI_YELLOW + "╚═╝" + ANSI_RESET + ANSI_RED + "╚═╝" + ANSI_RESET + " " + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + " " + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + " " + ANSI_BLACK + "╚═╝" + ANSI_RESET + ANSI_BLACK + "╚═╝" + ANSI_RESET + "\n";

        display.activateDisplays(15);

        assertThat(display.getPrintableDisplay(), is(expected));
    }
}
