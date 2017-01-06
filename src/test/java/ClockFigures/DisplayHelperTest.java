package ClockFigures;

import DisplayNodes.DisplayNode;
import DisplayNodes.YellowDisplayNode;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 06/01/2017.
 */
public class DisplayHelperTest extends DisplayTestSpecification {
    private LinkedList<DisplayNode> listOfDisplays = new LinkedList<>();
    private DisplayHelper displayHelper;

    @Before
    public void init() {
        displayHelper = new DisplayHelper();
        listOfDisplays.add(new YellowDisplayNode());
        listOfDisplays.add(new YellowDisplayNode());
        listOfDisplays.add(new YellowDisplayNode());
        listOfDisplays.add(new YellowDisplayNode());
    }

    @Test
    public void turn_displays_on_returns_list_with_correct_amount_of_on_displays() {
        int expectedOnDisplays = 2;

        List<DisplayNode> returnedDisplays = DisplayHelper.turnDisplaysOn(expectedOnDisplays, listOfDisplays);

        assertThat(countActiveDisplays(returnedDisplays), is(expectedOnDisplays));
    }

    @Test
    public void create_four_display_row_returns_string_with_all_displays_off_when_passed_new_list_of_display_nodes(){
        String expected =
 ANSI_BLACK+"╔═══════╗"+ANSI_RESET+ANSI_BLACK+"╔═══════╗"+ANSI_RESET+ANSI_BLACK+"╔═══════╗"+ANSI_RESET+ANSI_BLACK+"╔═══════╗"+ANSI_RESET+"\n"
+ANSI_BLACK+"║   O   ║"+ANSI_RESET+ANSI_BLACK+"║   O   ║"+ANSI_RESET+ANSI_BLACK+"║   O   ║"+ANSI_RESET+ANSI_BLACK+"║   O   ║"+ANSI_RESET+"\n"
+ANSI_BLACK+"╚═══════╝"+ANSI_RESET+ANSI_BLACK+"╚═══════╝"+ANSI_RESET+ANSI_BLACK+"╚═══════╝"+ANSI_RESET+ANSI_BLACK+"╚═══════╝"+ANSI_RESET+"\n";

        assertThat(DisplayHelper.createFourDisplayRow(listOfDisplays),is(expected));

    }
}
