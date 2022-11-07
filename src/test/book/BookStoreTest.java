package test.book;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.book.Book;
import main.book.BookStore;

public class BookStoreTest {
  @Test
  public void getTotalPrice() throws Exception {
    // Set up
    BookStore sut = new BookStore();
    Book book = BookStoreTestHelper.generateBookObj();

    int expected = 4500;

    // Excersize
    sut.addToCart(book, 1);

    // Verify
    assertEquals(sut.getTotalPrice(), expected);
  }

  @Test
  public void get_0() throws Exception {
    // Set up
    BookStore sut = new BookStore();
    Book expected = BookStoreTestHelper.generateBookObj();

    // Excersize
    sut.addToCart(expected, 1);
    Book actual = sut.cartBookInfo(0);

    assertTrue(expected == actual);
  }
}
