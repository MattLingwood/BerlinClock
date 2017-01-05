package DisplayNodesTests;

import DisplayNodes.DisplayNode;
import DisplayNodes.YellowDisplayNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Matt on 16/12/2016.
 */
public class YellowDisplayNodeTest {
    private DisplayNode displayNode;

    @Before
    public void init(){
        displayNode = new YellowDisplayNode();
    }

    @Test
    public void Yellow_node_is_off_by_default(){

        assertThat(displayNode.isOn(),is(false));
    }

    @Test
    public void Turn_yellow_node_on_returns_true(){
        displayNode.setOn();

        assertThat(displayNode.isOn(),is(true));
    }

    @Test
    public void Get_colour_is_off_by_default(){
        assertThat(displayNode.getColour(),is("O"));
        assertThat(displayNode.getAnsiColour(), is("\u001B[30m"));
    }

    @Test
    public void Get_colour_is_yellow_when_set_on(){
        displayNode.setOn();

        assertThat(displayNode.getColour(),is("Y"));
        assertThat(displayNode.getAnsiColour(), is("\u001B[33m"));
    }
}
