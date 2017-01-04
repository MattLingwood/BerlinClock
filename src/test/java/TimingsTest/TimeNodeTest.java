package TimingsTest;

import Timings.TimeNode;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 18/12/2016.
 */
public class TimeNodeTest {
    private TimeNode node;

    @Test
    public void Getters_return_correct_ints_set_in_constructor(){
        String timeString = "23:50:00";
        int expectedHours = 23;
        int expectedMinutes = 50;
        int expectedSeconds = 00;

        node = new TimeNode(timeString);

        assertThat(node.getHours(),is(expectedHours));
        assertThat(node.getMinutes(),is(expectedMinutes));
        assertThat(node.getSeconds(), is(expectedSeconds));
    }

    @Test
    public void Setting_hours_greater_than_24_returns_0(){
        String timeString = "24:00:00";
        int expectedHours = 00;

        node = new TimeNode(timeString);

        assertThat(node.getHours(),is(expectedHours));
    }

    @Test
    public void Setting_minutes_greater_than_59_returns_0(){
        String timeString = "00:60:00";
        int expectedMinutes = 00;

        node = new TimeNode(timeString);

        assertThat(node.getMinutes(),is(expectedMinutes));
    }

    @Test
    public void Setting_seconds_greater_than_59_returns_0(){
        String timeString = "00:00:60";
        int expectedSeconds = 00;

        node = new TimeNode(timeString);

        assertThat(node.getSeconds(),is(expectedSeconds));
    }
}
