package main.book;

import java.util.ArrayList;

public class BookStore {

  private ArrayList<BookSet> cart = new ArrayList<>();

  public BookStore() {
  }

  /**
   * 書籍をカートに追加する
   * 
   * @param book 書籍
   * @param cnt  個数
   */
  public void addToCart(Book book, int cnt) {
    BookSet bookSet = new BookSet();
    bookSet.setBook(book);
    bookSet.setCnt(cnt);
    cart.add(bookSet);
  }

  /**
   * 購入時の合計金額を返す
   * 
   * @return
   */
  public int getTotalPrice() {
    int totalPrice = 0;
    for (BookSet bookSet : this.cart) {
      Book book = bookSet.getBook();
      int cnt = bookSet.getCnt();
      int price = book.getPrice() * cnt;
      totalPrice += price;
    }
    return totalPrice;
  }

  /**
   * カート内の書籍情報を返す
   * 
   * @param index
   * @return
   */
  public Book cartBookInfo(int index) {
    BookSet bookSet = this.cart.get(index);
    Book book = bookSet.getBook();
    return book;
  }

}
