package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import main.ItemStock;
import main.ItemStockImpl;

@RunWith(Enclosed.class)
public class ItemStockTest {
  /**
   * 空の場合
   */
  public static class ItemStockWhenEmptyTest {
    ItemStock sut;

    @Before
    public void setUp() throws Exception {
      sut = new ItemStockImpl();
    }

    @Test
    public void sizeAreturnToZero() throws Exception {
      assertEquals(sut.size("A"), 0);
    }

    @Test
    public void contains_AreturnFalse() throws Exception {
      assertEquals(sut.contains("A"), false);
    }
  }

  /**
   * 商品を一つ登録した場合
   */
  public static class ItemStockWhenATest {
    ItemStock sut;

    @Before
    public void setUp() throws Exception {
      sut = new ItemStockImpl();
      sut.add("A", 10);
    }

    @Test
    public void sizeAreturnToTen() throws Exception {
      assertEquals(sut.size("A"), 10);
    }

    @Test
    public void contains_AreturnTrue() throws Exception {
      assertEquals(sut.contains("A"), true);
    }
  }
}
