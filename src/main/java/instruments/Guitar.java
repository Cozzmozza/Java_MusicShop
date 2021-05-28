package instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private String woodMaterial;

    public Guitar(String colour, int numberOfStrings, String woodMaterial) {
        super(colour, "String");
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
