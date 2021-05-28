package instrumentsTests;

import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Dark Oak", 6, "Mahogany");
    }

    @Test
    public void hasColour(){
        assertEquals("Dark Oak", guitar.getColour());
    }

    @Test
    public void hasFamily(){
        assertEquals("String", guitar.getFamily());
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
    public void canPLayInstrument(){
        assertEquals("Strumming ye'ol G-TAR", guitar.play());
    }
}
