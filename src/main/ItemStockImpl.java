package main;

public class ItemStockImpl implements ItemStock {

  private String item = "";
  private int num = 0;

  public ItemStockImpl() {

  }

  @Override
  public void add(String item, int num) {
    this.item = item;
    this.num = num;
  }

  @Override
  public int size(String item) {
    if (this.item.equals(item)) {
      return this.num;
    }
    return 0;
  }

  @Override
  public boolean contains(String item) {
    return this.item.equals(item) && this.num > 0;
  }

}
