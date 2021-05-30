package shop;

import behaviours.ISell;
import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getTotalStockCount() {
        return stock.size();
    }

    public void addItemToStock(ISell item) {
        stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        if (stock.contains(item)){
            stock.remove(item);
        }
    }

    public void clearStock() {
        stock.clear();
    }

    public double getTotalMarkup() {
        double total = 0;
        for (ISell item : stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
