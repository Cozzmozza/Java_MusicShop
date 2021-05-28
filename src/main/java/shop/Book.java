package shop;

import behaviours.ISell;

public class Book implements ISell {

    private String description;
    private String difficultyLevel;
    private double buyPrice;
    private double sellPrice;

    public Book(String description, String difficultyLevel, double buyPrice, double sellPrice) {
        this.description = description;
        this.difficultyLevel = difficultyLevel;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
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
