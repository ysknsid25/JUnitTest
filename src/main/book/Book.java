package main.book;

public class Book {

  /**
   * コンストラクタ
   */
  public Book() {
  }

  /**
   * 書籍のタイトル
   */
  private String title = "";

  /**
   * 値段。日本円なのでint
   */
  private int price = -1;

  /**
   * 著者情報
   */
  private Author author = null;

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return this.price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

}
