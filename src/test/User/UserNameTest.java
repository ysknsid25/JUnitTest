package test.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.User.UserName;

public class UserNameTest {

  private String testFirstName = "Yoshida";
  private String testLastName = "Kengo";

  private UserName sut;

  @Before
  public void setup() {
    this.sut = new UserName(this.testFirstName, this.testLastName);
  }

  @Test
  public void isFirstNameYoshida() {
    String actual = this.sut.getFirstName();
    String expected = this.testFirstName;
    assertEquals(actual, expected);
  }

  @Test
  public void isLastNameKengo() {
    String actual = this.sut.getLastName();
    String expected = this.testLastName;
    assertEquals(actual, expected);
  }

}
