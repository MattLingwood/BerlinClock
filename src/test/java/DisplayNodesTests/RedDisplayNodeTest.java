package DisplayNodesTests;

import DisplayNodes.DisplayNode;
import DisplayNodes.RedDisplayNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class RedDisplayNodeTest {
    private DisplayNode displayNode;

    @Before
    public void ex(){
        displayNode = new RedDisplayNode();
    }

    @Test
    public void red_node_is_off_by_default(){
        assertThat(displayNode.isOn(),is(false));
    }

    @Test
    public void get_colour_is_off_by_default(){
        assertThat(displayNode.getColour(),is("Off"));
    }

    @Test
    public void get_colour_is_red_when_set_on(){
        displayNode.setOn();

        assertThat(displayNode.getColour(),is("Red"));
    }

    @Test
    public void Set_to_on_returns_true(){
        displayNode.setOn();

        assertThat(displayNode.isOn(), is(true));
    }

    @Test
    public void Set_to_off_returns_false(){
        displayNode.setOff();

        assertThat(displayNode.isOn(), is(false));
    }
}
