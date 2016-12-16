package ClockFigures;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class FiveHoursDisplayTest {

    @Test
    public void All_displays_are_off_by_default(){
        FiveHoursDisplay displays = new FiveHoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(0);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(0));
    }

    @Test
    public void Fifth_hour_first_display_only(){
        FiveHoursDisplay displays = new FiveHoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(5);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(1));
    }
    @Test
    public void Nineth_hour_first_display_only(){
        FiveHoursDisplay displays = new FiveHoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(9);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(1));
    }

    @Test
    public void Tenth_hour_returns_two_displays(){
        FiveHoursDisplay displays = new FiveHoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(10);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(2));
    }

    @Test
    public void fifteenth_hour_returns_three_displays(){
        FiveHoursDisplay displays = new FiveHoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(15);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(3));
    }

    @Test
    public void twentieth_hour_returns_four_displays(){
        FiveHoursDisplay displays = new FiveHoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(20);

        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(4));
    }

    @Test
    public void Nineth_tenth_eleventh_return_one_two_two(){
        FiveHoursDisplay displays = new FiveHoursDisplay();

        List<DisplayNode> activeDisplays = displays.activateDisplays(9);
        assertThat(((int) activeDisplays.stream().filter(display -> display.isOn()).count()), is(1));
        List<DisplayNode> activeDisplaysTwo = displays.activateDisplays(10);
        assertThat(((int) activeDisplaysTwo.stream().filter(display -> display.isOn()).count()), is(2));
        List<DisplayNode> activeDisplaysThree = displays.activateDisplays(11);
        assertThat(((int) activeDisplaysThree.stream().filter(display -> display.isOn()).count()), is(2));
    }
}
