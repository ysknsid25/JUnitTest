package main.User;

public class UserName {
  private String firstName = "";
  private String lastName = "";

  /**
   * コンストラクタ
   */
  public UserName(String firstName, String lastName) {
    this.setFirstName(firstName);
    this.setLastName(lastName);
  }

  public String getFirstName() {
    return this.firstName;
  }

  protected void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  protected void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
