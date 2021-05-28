package instrumentsTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Acoustic Guitar", "Dark Oak", 6, "Mahogany", 240.15, 399.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("Acoustic Guitar", guitar.getDescription());
    }

    @Test
    public void hasFamily(){
        assertEquals("String", guitar.getFamily());
    }

    @Test
    public void hasColour(){
        assertEquals("Dark Oak", guitar.getColour());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasWoodMaterial(){
        assertEquals("Mahogany", guitar.getWoodMaterial());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(240.15, guitar.getBuyPrice(), 0.005);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(399.99, guitar.getSellPrice(), 0.005);
    }

    @Test
    public void canSetNewBuyPrice(){
        guitar.setBuyPrice(245.55);
        assertEquals(245.55, guitar.getBuyPrice(), 0.005);
    }

    @Test
    public void canSetNewSellPrice(){
        guitar.setSellPrice(420.99);
        assertEquals(420.99, guitar.getSellPrice(), 0.005);
    }

    @Test
    public void canPLayInstrument(){
        assertEquals("Strumming ye'ol G-TAR", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(159.84, guitar.calculateMarkup(), 0.005);
    }

    @Test
    public void canCalculateMarkupWithNewPrices(){
        guitar.setBuyPrice(245.55);
        guitar.setSellPrice(420.99);
        assertEquals(175.44, guitar.calculateMarkup(), 0.005);
    }


}
