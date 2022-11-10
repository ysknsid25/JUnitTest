package main.User;

public class UserId {

  private String id;

  public UserId() {
  }

  public UserId(String id) throws ArgumentNullException {
    if (id == null || id.isEmpty()) {
      throw new ArgumentNullException("UserId", "UserId");
    }
    this.id = id;
  }

  public String getId() {
    return this.id;
  }

}
