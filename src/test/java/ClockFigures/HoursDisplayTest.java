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
public class HoursDisplayTest extends DisplayTestSpecification {
    private HoursDisplay display;

    @Before
    public void init(){
        display = new HoursDisplay();
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
    public void get_printable_display_returns_3_red_display_string_with_3_hours_time(){
        String expected =
                 ANSI_RED+"╔═══════╗"+ANSI_RESET+ANSI_RED+"╔═══════╗"+ANSI_RESET+ANSI_RED+"╔═══════╗"+ANSI_RESET+ANSI_BLACK+"╔═══════╗"+ANSI_RESET+"\n"
                +ANSI_RED+"║   R   ║"+ANSI_RESET+ANSI_RED+"║   R   ║"+ANSI_RESET+ANSI_RED+"║   R   ║"+ANSI_RESET+ANSI_BLACK+"║   O   ║"+ANSI_RESET+"\n"
                +ANSI_RED+"╚═══════╝"+ANSI_RESET+ANSI_RED+"╚═══════╝"+ANSI_RESET+ANSI_RED+"╚═══════╝"+ANSI_RESET+ANSI_BLACK+"╚═══════╝"+ANSI_RESET+"\n";

        display.activateDisplays(3);

        assertThat(display.getPrintableDisplay(),is(expected));
    }
}
