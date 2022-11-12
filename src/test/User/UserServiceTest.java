package test.User;

import org.junit.Test;

import main.User.ArgumentNullException;
import main.User.User;
import main.User.UserName;
import main.User.UserService;

public class UserServiceTest {
  @Test
  public void uniqueUser() throws ArgumentNullException {
    UserName name = new UserName("kengo", "yoshida");
    User user = new User(name);
    UserName name2 = new UserName("ramen", "tabetaro");
    User user2 = new User(name2);
    UserService sut = new UserService(null);
  }
}
