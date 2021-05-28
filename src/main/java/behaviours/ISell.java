package behaviours;

public interface ISell {

    double calculateMarkup();
    String getDescription();
    double getBuyPrice();
    double getSellPrice();
    void setBuyPrice(double newBuyPrice);
    void setSellPrice(double newSellPrice);

}
