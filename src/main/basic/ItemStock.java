package main.basic;

import java.util.ArrayList;
import java.util.List;

public class ItemStock {

  private List<Item> itemlist;

  public ItemStock() {
    this.itemlist = new ArrayList<Item>();
  }

  public void add(Item item) throws NullPointerException {
    boolean isUnique = true;
    if (item == null) {
      throw new NullPointerException();
    }
    if (item.getName() != null && !item.getName().isEmpty()) {
      for (Item addedItem : itemlist) {
        if (addedItem.getName().equals(item.getName())) {
          isUnique = false;
          break;
        }
      }
      if (isUnique) {
        this.itemlist.add(item);
      }
    }
  }

  public int getNum() {
    return this.itemlist.size();
  }

}
