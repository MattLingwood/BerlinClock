package ClockFigures;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
public class DisplayNodeTest {

    @Test
    public void Is_off_by_default(){
        DisplayNode node = new DisplayNode();

        boolean on = node.isOn();

        assertThat(on, is(false));
    }

    @Test
    public void Set_to_on_returns_true(){
        DisplayNode node = new DisplayNode();

        node.setOn();
        boolean on = node.isOn();

        assertThat(on, is(true));
    }

    @Test
    public void Set_to_off_returns_false(){
        DisplayNode node = new DisplayNode();

        node.setOff();
        boolean on = node.isOn();

        assertThat(on, is(false));
    }


}
