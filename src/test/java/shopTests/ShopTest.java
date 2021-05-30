package shopTests;

import behaviours.ISell;
import instruments.BongoDrums;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;
import shop.Book;
import shop.DrumSticks;
import shop.Shop;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private BongoDrums bongoDrums;
    private Book book;
    private DrumSticks drumSticks;
    private ArrayList<ISell> testArray;


    @Before
    public void before(){
        guitar = new Guitar("Acoustic Guitar", "Dark Oak", 6, "Mahogany", 240.15, 399.99);
        drumSticks = new DrumSticks("Skullface Drumsticks", "Black", 8.50, 14.20);
        testArray = new ArrayList<>();
        shop = new Shop();
    }

    @Test
    public void hasEmptyStockInitially(){
        assertEquals(testArray, shop.getStock());
    }

    @Test
    public void canGetTotalStockCount(){
        assertEquals(0, shop.getTotalStockCount());
    }

    @Test
    public void canAddGuitarISellItemToStock(){
        testArray.add(guitar);
        shop.addItemToStock(guitar);
        assertEquals(testArray, shop.getStock());
        assertEquals(1, shop.getTotalStockCount());
    }

    @Test
    public void canAddDrumsticksISellItemToStock(){
        testArray.add(drumSticks);
        shop.addItemToStock(drumSticks);
        assertEquals(testArray, shop.getStock());
        assertEquals(1, shop.getTotalStockCount());
    }

    @Test
    public void canRemoveISellItemFromStockIfExists(){
        shop.addItemToStock(drumSticks);
        shop.removeItemFromStock(drumSticks);
        assertEquals(testArray, shop.getStock());
        assertEquals(0, shop.getTotalStockCount());
    }

    @Test
    public void cannotRemoveItemFromStockIfDoesNotExist(){
        testArray.add(guitar);
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(drumSticks);
        assertEquals(testArray, shop.getStock());
        assertEquals(1, shop.getTotalStockCount());

    }

    @Test
    public void canClearStock(){
        shop.clearStock();
        assertEquals(testArray, shop.getStock());
        assertEquals(0, shop.getTotalStockCount());
    }

    @Test
    public void canCalculateTotalPotentialMarkup(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumSticks);
        assertEquals(165.54, shop.getTotalMarkup(), 0.005);
    }


}
