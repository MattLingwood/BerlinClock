package ClockFigures;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class FiveHoursDisplayTest {
    private DisplayBase display;

    @Before
    public void init(){
        display = new FiveHoursDisplay();
    }

    @Test
    public void All_displays_are_off_by_default(){
        List<DisplayNode> activeDisplays = display.activateDisplays(0);

        assertThat((CountActiveDisplays(activeDisplays)), is(0));
    }

    @Test
    public void Fifth_hour_first_display_only(){
        List<DisplayNode> activeDisplays = display.activateDisplays(5);

        assertThat((CountActiveDisplays(activeDisplays)), is(1));
    }
    @Test
    public void Nineth_hour_first_display_only(){
        List<DisplayNode> activeDisplays = display.activateDisplays(9);

        assertThat((CountActiveDisplays(activeDisplays)), is(1));
    }

    @Test
    public void Tenth_hour_returns_two_displays(){
        List<DisplayNode> activeDisplays = display.activateDisplays(10);

        assertThat((CountActiveDisplays(activeDisplays)), is(2));
    }

    @Test
    public void fifteenth_hour_returns_three_displays(){
        List<DisplayNode> activeDisplays = display.activateDisplays(15);

        assertThat((CountActiveDisplays(activeDisplays)), is(3));
    }

    @Test
    public void twentieth_hour_returns_four_displays(){
        List<DisplayNode> activeDisplays = display.activateDisplays(20);

        assertThat((CountActiveDisplays(activeDisplays)), is(4));
    }

    @Test
    public void Nineth_tenth_eleventh_return_one_two_two(){
        List<DisplayNode> activeDisplays = display.activateDisplays(9);
        int countOne = CountActiveDisplays(activeDisplays);
        List<DisplayNode> activeDisplaysTwo = display.activateDisplays(10);
        int countTwo = CountActiveDisplays(activeDisplaysTwo);
        List<DisplayNode> activeDisplaysThree = display.activateDisplays(11);
        int countThree = CountActiveDisplays(activeDisplaysThree);

        assertThat(countOne, is(1));
        assertThat(countTwo, is(2));
        assertThat(countThree, is(2));
    }

    private int CountActiveDisplays(List<DisplayNode> activeDisplays) {
        return (int) activeDisplays.stream().filter(display -> display.isOn()).count();
    }
}
