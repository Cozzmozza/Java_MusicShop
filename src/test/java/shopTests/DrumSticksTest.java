package shopTests;

import org.junit.Before;
import org.junit.Test;
import shop.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Skullface Drumsticks", "Black", 8.50, 14.20);
    }

    @Test
    public void hasColour(){
        assertEquals("Black", drumSticks.getColour());
    }

    @Test
    public void hasDescription(){
        assertEquals("Skullface Drumsticks", drumSticks.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(8.50, drumSticks.getBuyPrice(), 0.005);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(14.20, drumSticks.getSellPrice(), 0.005);
    }

    @Test
    public void canSetNewBuyPrice(){
        drumSticks.setBuyPrice(9.20);
        assertEquals(9.20, drumSticks.getBuyPrice(), 0.005);
    }

    @Test
    public void canSetNewSellPrice(){
        drumSticks.setSellPrice(12.80);
        assertEquals(12.80, drumSticks.getSellPrice(), 0.005);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5.70, drumSticks.calculateMarkup(), 0.005);
    }

    @Test
    public void canCalculateMarkupWithNewPrices(){
        drumSticks.setBuyPrice(9.20);
        drumSticks.setSellPrice(12.80);
        assertEquals(3.60, drumSticks.calculateMarkup(), 0.005);
    }
}
