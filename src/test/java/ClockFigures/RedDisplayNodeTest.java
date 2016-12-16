package ClockFigures;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class RedDisplayNodeTest {

    @Test
    public void red_node_is_off_by_default(){
        RedDisplayNode redDisplayNode = new RedDisplayNode();

        assertThat(redDisplayNode.isOn(),is(false));
    }

    @Test
    public void get_colour_is_off_by_default(){
        RedDisplayNode redDisplayNode = new RedDisplayNode();

        assertThat(redDisplayNode.getColour(),is("Off"));
    }

    @Test
    public void get_colour_is_red_when_set_on(){
        RedDisplayNode redDisplayNode = new RedDisplayNode();

        redDisplayNode.setOn();

        assertThat(redDisplayNode.getColour(),is("Red"));
    }

    @Test
    public void Set_to_on_returns_true(){
        RedDisplayNode node = new RedDisplayNode();

        node.setOn();
        boolean on = node.isOn();

        assertThat(on, is(true));
    }

    @Test
    public void Set_to_off_returns_false(){
        RedDisplayNode node = new RedDisplayNode();

        node.setOff();
        boolean on = node.isOn();

        assertThat(on, is(false));
    }
}