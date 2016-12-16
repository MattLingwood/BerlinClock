package ClockFigures;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Matt on 16/12/2016.
 */
public class YellowDisplayNodeTest {
    @Test
    public void red_node_is_off_by_default(){
        YellowDisplayNode yellowDisplayNode = new YellowDisplayNode();

        assertThat(yellowDisplayNode.isOn(),is(false));
    }

    @Test
    public void get_colour_is_off_by_default(){
        YellowDisplayNode yellowDisplayNode = new YellowDisplayNode();

        assertThat(yellowDisplayNode.getColour(),is("Off"));
    }

    @Test
    public void get_colour_is_red_when_set_on(){
        YellowDisplayNode yellowDisplayNode = new YellowDisplayNode();

        yellowDisplayNode.setOn();

        assertThat(yellowDisplayNode.getColour(),is("Yellow"));
    }
}
