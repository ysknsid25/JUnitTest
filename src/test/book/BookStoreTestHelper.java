package test.book;

import main.book.Author;
import main.book.Book;

public class BookStoreTestHelper {
  public static Book generateBookObj() {
    Book book = new Book();
    book.setTitle("TestTitle");
    book.setPrice(4500);
    Author author = new Author();
    author.setFirstName("Martin");
    author.setLastName("Flower");
    book.setAuthor(author);
    return book;
  }
}
