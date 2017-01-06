package ClockFigures;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class MinutesDisplayTest extends DisplayTestSpecification {
    private MinutesDisplay display;

    @Before
    public void init() {
        Displays displays = new Displays();
        display = new MinutesDisplay(displays);
    }

    @Test
    public void get_printable_display_returns_3_yellow_display_string_with_3_minutes_time() {
        String expected =
                ANSI_YELLOW + "╔═══════╗" + ANSI_RESET + ANSI_YELLOW + "╔═══════╗" + ANSI_RESET + ANSI_YELLOW + "╔═══════╗" + ANSI_RESET + ANSI_BLACK + "╔═══════╗" + ANSI_RESET + "\n"
                        + ANSI_YELLOW + "║   Y   ║" + ANSI_RESET + ANSI_YELLOW + "║   Y   ║" + ANSI_RESET + ANSI_YELLOW + "║   Y   ║" + ANSI_RESET + ANSI_BLACK + "║   O   ║" + ANSI_RESET + "\n"
                        + ANSI_YELLOW + "╚═══════╝" + ANSI_RESET + ANSI_YELLOW + "╚═══════╝" + ANSI_RESET + ANSI_YELLOW + "╚═══════╝" + ANSI_RESET + ANSI_BLACK + "╚═══════╝" + ANSI_RESET + "\n";

        display.activateDisplays(3);

        assertThat(display.getPrintableDisplay(), is(expected));
    }
}
