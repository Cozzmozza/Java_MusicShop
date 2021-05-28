package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String woodMaterial;

//    (String description, String family, String colour, double buyPrice, double sellPrice

    public Guitar(String description, String colour, int numberOfStrings, String woodMaterial, double buyPrice, double sellPrice) {
        super(description, "String", colour, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.woodMaterial = woodMaterial;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getWoodMaterial() {
        return woodMaterial;
    }

    public String play(){
        return "Strumming ye'ol G-TAR";
    }
}
