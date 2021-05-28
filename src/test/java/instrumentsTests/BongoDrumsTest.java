package instrumentsTests;

import instruments.BongoDrums;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BongoDrumsTest {

    BongoDrums bongoDrums;

    @Before
    public void before(){
        bongoDrums = new BongoDrums("Extra special Bongo Drums", "Morocco", "Dark Red", 480.50, 729.00);
    }

    @Test
    public void hasDescription(){
        assertEquals("Extra special Bongo Drums", bongoDrums.getDescription());
    }

    @Test
    public void hasFamily(){
        assertEquals("Percussion", bongoDrums.getFamily());
    }

    @Test
    public void hasRegion(){
        assertEquals("Morocco", bongoDrums.getRegion());
    }

    @Test
    public void hasColour(){
        assertEquals("Dark Red", bongoDrums.getColour());
    }


    @Test
    public void hasBuyPrice(){
        assertEquals(480.50, bongoDrums.getBuyPrice(), 0.005);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(729.00, bongoDrums.getSellPrice(), 0.005);
    }

    @Test
    public void canSetNewBuyPrice(){
        bongoDrums.setBuyPrice(523.59);
        assertEquals(523.59, bongoDrums.getBuyPrice(), 0.005);
    }

    @Test
    public void canSetNewSellPrice(){
        bongoDrums.setSellPrice(900.50);
        assertEquals(900.50, bongoDrums.getSellPrice(), 0.005);
    }

    @Test
    public void canPLayInstrument(){
        assertEquals("Bongo boom boom", bongoDrums.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(248.50, bongoDrums.calculateMarkup(), 0.005);
    }

    @Test
    public void canCalculateMarkupWithNewPrices(){
        bongoDrums.setBuyPrice(523.59);
        bongoDrums.setSellPrice(950.50);
        assertEquals(426.91, bongoDrums.calculateMarkup(), 0.005);
    }

}
