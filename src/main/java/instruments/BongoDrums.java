package instruments;

public class BongoDrums extends Instrument{

    private String region;

    public BongoDrums(String description, String region, String colour, double buyPrice, double sellPrice) {
        super(description, "Percussion", colour, buyPrice, sellPrice);
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public String play(){
        return "Bongo boom boom";
    }
}
