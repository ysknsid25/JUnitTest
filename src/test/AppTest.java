package test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import main.Calculator;

public class AppTest {
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void canGetResultByMultiply() {
    Calculator calc = new Calculator();
    int expected = 12;
    int actual = calc.multiply(3, 4);
    assertThat(actual, is(expected));
  }

  @Test
  public void canGetResultByDevide() {
    Calculator calc = new Calculator();
    int expected = 3;
    int actual = calc.devide(12, 4);
    assertThat(actual, is(expected));
  }

  @Test(expected = IllegalArgumentException.class)
  public void canThrowWhenDevideByZero() {
    Calculator calc = new Calculator();
    calc.devide(12, 0);
  }
}
