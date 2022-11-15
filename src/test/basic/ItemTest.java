package test.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import main.basic.Item;
import main.basic.ItemStock;

@RunWith(Enclosed.class)
public class ItemTest {
  public static class InitialTest {
    private ItemStock sut;

    @Before
    public void setUp() {
      this.sut = new ItemStock();
    }

    @Test
    public void isGetNumResultIsZero() {
      int expected = 0;
      int actual = this.sut.getNum();
      assertEquals(expected, actual);
    }

    @Test
    public void isGetNumResultIsOne() {
      int expected = 1;
      Item item = new Item("Item", 100);
      this.sut.add(item);
      int actual = this.sut.getNum();
      assertEquals(expected, actual);
    }
  }

  public static class ItemGetOneTest {
    private ItemStock sut;
    private Item item;

    @Before
    public void setUp() {
      this.sut = new ItemStock();
      this.item = new Item("Item", 100);
      this.sut.add(this.item);
    }

    @Test
    public void isGetNumResultIsOne() {
      int expected = 1;
      int actual = this.sut.getNum();
      assertEquals(expected, actual);
    }

    @Test
    public void addSameItemAfterGetNumIsOne() {
      int expected = 1;
      this.sut.add(this.item);
      int actual = this.sut.getNum();
      assertEquals(expected, actual);
    }
  }

  public static class ItemGetTwoTest {
    private ItemStock sut;
    private Item item;

    @Before
    public void setUp() {
      this.sut = new ItemStock();
      this.item = new Item("Item", 100);
      this.sut.add(this.item);
    }

    @Test
    public void addSameItemAfterGetNumIsOne() {
      int expected = 2;
      Item item = new Item("Item2", 100);
      this.sut.add(item);
      int actual = this.sut.getNum();
      assertEquals(expected, actual);
    }
  }

  public static class AddNullorEmptyValTest {
    @Test
    public void addEmptyAfterGetNumIsZero() {
      ItemStock sut = new ItemStock();
      Item item = new Item("", 100);
      sut.add(item);
      int expected = 0;
      int actual = sut.getNum();
      assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void addNullInstance() {
      ItemStock sut = new ItemStock();
      sut.add(null);
    }

    @Test
    public void addNullAfterGetNumIsZero() {
      ItemStock sut = new ItemStock();
      Item item = new Item(null, 100);
      sut.add(item);
      int expected = 0;
      int actual = sut.getNum();
      assertEquals(expected, actual);
    }

  }
}
