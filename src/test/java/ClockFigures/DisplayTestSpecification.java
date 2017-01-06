package ClockFigures;

import DisplayNodes.DisplayNode;

import java.util.List;

/**
 * Created by Matt on 16/12/2016.
 */
public abstract class DisplayTestSpecification {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public int countActiveDisplays(List<DisplayNode> activeDisplays) {
        return (int) activeDisplays.stream().filter(display -> display.isOn()).count();
    }
}
