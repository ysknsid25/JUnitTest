package test.basic;

import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
  @Test(expected = IllegalArgumentException.class)
  public void throwIllegalArgumentException() throws IllegalArgumentException {
    Calculator sut = new Calculator();
    sut.divide(3, 0);
  }
}
