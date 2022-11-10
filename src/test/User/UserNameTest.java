package test.User;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

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

  @Test
  public void isUserNameLengthEmpty() {
    String firstName = "";
    String lastName = "Yoshida";
    this.sut = new UserName(firstName, lastName);
    String actual = this.sut.getFirstName();
    String expected = firstName;
    assertEquals(actual, expected);
  }

  @Test
  public void isUserNameLengthValid() {
    String lastName = "Yoshida";
    String[] validNames = { "123", "1234", "1234567890123456789", "12345678901234567890" };
    for (String validName : validNames) {
      this.sut = new UserName(validName, lastName);
      String actual = this.sut.getFirstName();
      String expected = validName;
      assertEquals(actual, expected);
    }
  }

  @Theory
  public void isUserNameLengthInValid() {
    String lastName = "Yoshida";
    String[] inValidNames = { "", "12", "123456789012345678901" };
    for (String inValidName : inValidNames) {
      this.sut = new UserName(inValidName, lastName);
      String actual = this.sut.getFirstName();
      String expected = "";
      assumeTrue(actual.isEmpty());
      assertEquals(actual, expected);
    }
  }

}
