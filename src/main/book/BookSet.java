package main.book;

public class BookSet {
  /**
   * 購入する書籍
   */
  private Book book = null;

  /**
   * 購入数
   */
  private int cnt = -1;

  public BookSet() {
  }

  public Book getBook() {
    return this.book;
  }

  public void setBook(Book book) {
    this.book = book;
  }

  public int getCnt() {
    return this.cnt;
  }

  public void setCnt(int cnt) {
    this.cnt = cnt;
  }

}
