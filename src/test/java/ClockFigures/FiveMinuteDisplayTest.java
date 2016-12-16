package ClockFigures;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class FiveMinuteDisplayTest extends DisplayTestSpecification{
    private DisplayBase display;

    @Before
    public void init(){
        display = new FiveMinuteDisplay();
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
}
