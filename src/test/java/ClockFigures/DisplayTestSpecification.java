package ClockFigures;

import DisplayNodes.DisplayNode;

import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public abstract class DisplayTestSpecification {
    public int countActiveDisplays(List<DisplayNode> activeDisplays) {
        return (int) activeDisplays.stream().filter(display -> display.isOn()).count();
    }
}
