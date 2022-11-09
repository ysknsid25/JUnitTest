package main.User;

public class User {

  private UserId id;
  private UserName name;

  /**
   * コンストラクタ
   * 
   * @param name
   */
  public User(UserName name) throws ArgumentNullException {

    if (name == null) {
      throw new ArgumentNullException(this.getClass().toString(), "name");
    }

    this.id = new UserId();
    this.name = name;
  }

  /**
   * インスタンスを再構成する際に利用するコンストラクタ
   */
  public User(UserId id, UserName name) throws ArgumentNullException {
    if (id == null) {
      throw new ArgumentNullException(this.getClass().toString(), "id");
    }
    if (name == null) {
      throw new ArgumentNullException(this.getClass().toString(), "name");
    }

    this.id = id;
    this.name = name;
  }

  /**
   * 名前を変更する
   * 
   * @param name
   * @throws ArgumentNullException
   */
  public void chengeName(UserName name) throws ArgumentNullException {
    if (name == null) {
      throw new ArgumentNullException(this.getClass().toString(), "name");
    }
    this.setName(name);
  }

  public UserId getId() {
    return this.id;
  }

  public void setId(UserId id) {
    this.id = id;
  }

  public UserName getName() {
    return this.name;
  }

  public void setName(UserName name) {
    this.name = name;
  }

}
