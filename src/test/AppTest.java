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
}
