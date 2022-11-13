package test.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.basic.StringUtils;

public class StringUtilsTest {
  @Test
  public void isGetaaa() {
    String expected = "aaa";
    String atctual = StringUtils.toSnakeCase("aaa");
    assertEquals(expected, atctual);
  }

  @Test
  public void isGetSnakeCaseHelloWorld() {
    String expected = "hello_world";
    String atctual = StringUtils.toSnakeCase("HelloWorld");
    assertEquals(expected, atctual);
  }

  @Test
  public void isGetSnakeCasePracticeJunit() {
    String expected = "practice_junit";
    String atctual = StringUtils.toSnakeCase("practiceJunit");
    assertEquals(expected, atctual);
  }

  @Test(expected = NullPointerException.class)
  public void isThrowNullPointerException() throws NullPointerException {
    StringUtils.toSnakeCase(null);
  }
}
