package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String description;
    private String family;
    private String colour;
    private double buyPrice;
    private double sellPrice;


    public Instrument(String description, String family, String colour, double buyPrice, double sellPrice) {
        this.description = description;
        this.family = family;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public String getColour() {
        return colour;
    }

    public String getFamily() {
        return family;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setBuyPrice(double newBuyPrice) {
        this.buyPrice = newBuyPrice;
    }

    public void setSellPrice(double newSellPrice) {
        this.sellPrice = newSellPrice;
    }

    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }
}
