package main.User;

public interface IUserRepository {
  public User find(UserId id);

  public User find(UserName name);

  public void save(User user);
}
