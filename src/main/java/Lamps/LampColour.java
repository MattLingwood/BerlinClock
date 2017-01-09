package Lamps;

/**
 * Created by Matt on 09/01/2017.
 */
public enum LampColour {

    RED ("R", "\u001B[31m"),
    YELLOW("Y", "\u001B[33m");

    private final String colour;
    private final String ansiColour;

    LampColour(String colour, String ansiColour) {
        this.colour = colour;
        this.ansiColour = ansiColour;
    }

    public String getColour() {
        return colour;
    }

    public String getAnsiColour() {
        return ansiColour;
    }
}
