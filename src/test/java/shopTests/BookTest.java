package shopTests;

import org.junit.Before;
import org.junit.Test;
import shop.Book;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("G-tar 4 dumz", "Amateur", 3.20, 5.50);
    }

    @Test
    public void hasDescription(){
        assertEquals("G-tar 4 dumz", book.getDescription());
    }

    @Test
    public void hasDifficultyLevel(){
        assertEquals("Amateur", book.getDifficultyLevel());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(3.20, book.getBuyPrice(), 0.005);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(5.50, book.getSellPrice(), 0.005);
    }

    @Test
    public void canSetNewBuyPrice(){
        book.setBuyPrice(18.99);
        assertEquals(18.99, book.getBuyPrice(), 0.005);
    }

    @Test
    public void canSetNewSellprice(){
        book.setSellPrice(52.39);
        assertEquals(52.39, book.getSellPrice(), 0.005);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(2.30, book.calculateMarkup(), 0.005);
    }

    @Test
    public void canCalculateMarkupWithNewPrices(){
        book.setBuyPrice(18.99);
        book.setSellPrice(52.39);
        assertEquals(33.40, book.calculateMarkup(), 0.005);
    }

}
