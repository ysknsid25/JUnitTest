package test.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.User.ArgumentNullException;
import main.User.User;
import main.User.UserName;

public class UserTest {

  @Test(expected = ArgumentNullException.class)
  public void isThrowArgumentNullException() throws ArgumentNullException {
    new User(null, null);
  }

  @Test(expected = ArgumentNullException.class)
  public void isChangeNameThrowArgumentNullException() throws ArgumentNullException {
    UserName actual = new UserName("Kengo", "Yoshida");
    UserName expected = null;
    User sut = new User(actual);
    sut.chengeName(expected);
  }

  @Test
  public void isChangeName() throws ArgumentNullException {
    UserName initVal = new UserName("Kengo", "Yoshida");
    UserName expected = new UserName("Ramen", "Tabetaro");

    User sut = new User(initVal);
    sut.chengeName(expected);
    UserName actual = sut.getName();

    assertEquals(expected, actual);
  }
}
