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
    boolean isValidLength = this.chkUserNameLength(firstName);
    if (isValidLength) {
      this.firstName = firstName;
    }
  }

  public String getLastName() {
    return this.lastName;
  }

  protected void setLastName(String lastName) {
    boolean isValidLength = this.chkUserNameLength(lastName);
    if (isValidLength) {
      this.lastName = lastName;
    }
  }

  /**
   * ユーザー名の長さチェック
   * 
   * @param value
   * @return
   */
  private boolean chkUserNameLength(String value) {
    if (value == null || value.isEmpty()) {
      return false;
    }
    if (3 <= value.length() && value.length() <= 20) {
      return true;
    }
    return false;
  }
}
