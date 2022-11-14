package test.basic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.basic.NumberUtils;

public class NumberUtilsTest {
  @Test
  public void isEven() {
    NumberUtils sut = new NumberUtils();
    boolean actual = sut.isEven(10);
    assertTrue(actual);
  }

  @Test
  public void isOdd() {
    NumberUtils sut = new NumberUtils();
    boolean actual = sut.isEven(7);
    assertFalse(actual);
  }
}
