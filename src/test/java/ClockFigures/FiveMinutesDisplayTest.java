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
public class FiveMinutesDisplayTest extends DisplayTestSpecification{
    private DisplayBase display;

    @Before
    public void init(){
        display = new FiveMinutesDisplay();
    }

    @Test
    public void Zero_returns_no_active_displays(){

        List<DisplayNode> activeDisplays = display.activateDisplays(0);

        assertThat((countActiveDisplays(activeDisplays)), is(0));
    }
    @Test
    public void twenty_five_returns_5_active_displays(){

        List<DisplayNode> activeDisplays = display.activateDisplays(25);

        assertThat((countActiveDisplays(activeDisplays)), is(5));
    }
    @Test
    public void fifty_five_returns_eleven_active_displays(){

        List<DisplayNode> activeDisplays = display.activateDisplays(55);

        assertThat(countActiveDisplays(activeDisplays), is(11));
    }

    @Test
    public void new_five_minute_display_returns_blank_display_string(){
        String expected = " ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗  ╔═╗╔═╗╔═╗  ╔═╗╔═╗ \n"
                         +" ║O ║║O║║O ║ ║O ║║O ║║O║  ║O ║║O ║║O║  ║O ║║O ║ \n"
                         +" ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝ \n";

        assertThat(display.getPrintableDisplay(),is(expected));

    }

    @Test
    public void fifteen_minutes_returns_red_red_yellow_rest_off_display_string(){
        String expected = " ╔═╗╔═╗╔═╗ ╔═╗╔═╗╔═╗  ╔═╗╔═╗╔═╗  ╔═╗╔═╗ \n"
                         +" ║Y ║║Y║║R ║ ║O ║║O ║║O║  ║O ║║O ║║O║  ║O ║║O ║ \n"
                         +" ╚═╝╚═╝╚═╝ ╚═╝╚═╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚═╝ \n";
        display.activateDisplays(15);

        assertThat(display.getPrintableDisplay(),is(expected));
    }
}
