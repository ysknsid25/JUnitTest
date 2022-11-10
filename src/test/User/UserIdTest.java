package test.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.User.ArgumentNullException;
import main.User.UserId;

public class UserIdTest {
  @Test(expected = ArgumentNullException.class)
  public void nullIsThrowArgumentNullException() throws ArgumentNullException {
    new UserId(null);
  }

  @Test(expected = ArgumentNullException.class)
  public void emptyIsThrowArgumentNullException() throws ArgumentNullException {
    new UserId("");
  }

  @Test
  public void isGetValidId() throws ArgumentNullException {
    String id = "a";
    UserId sut = new UserId(id);
    String actual = sut.getId();
    String expected = id;
    assertEquals(actual, expected);
  }
}
