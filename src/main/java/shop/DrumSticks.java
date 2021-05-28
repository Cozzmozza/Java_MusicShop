package shop;

import behaviours.ISell;

public class DrumSticks implements ISell {

    private String description;
    private String colour;
    private double buyPrice;
    private double sellPrice;

    public DrumSticks(String description, String colour, double buyPrice, double sellPrice) {
        this.description = description;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getColour() {
        return colour;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }
}
