package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String colour;
    private String family;

    public Instrument(String colour, String family) {
        this.colour = colour;
        this.family = family;
    }

    public String getColour() {
        return colour;
    }

    public String getFamily() {
        return family;
    }
}
