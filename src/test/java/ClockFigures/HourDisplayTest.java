package ClockFigures;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class HourDisplayTest {
    @Test
    public void all_displays_are_off_by_default(){
        HoursDisplay displays = new HoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(0);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(0));
    }
    @Test
    public void One_returns_one_display(){
        HoursDisplay displays = new HoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(1);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(1));
    }

    @Test
    public void four_returns_four_displays(){
        HoursDisplay displays = new HoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(4);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(4));
    }

    @Test
    public void five_returns_zero_displays(){
        HoursDisplay displays = new HoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(5);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(0));
    }
}
