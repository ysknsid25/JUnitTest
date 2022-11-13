package main.User;

public class UserService {
  private final IUserRepository userRepository;

  public UserService(IUserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public boolean isExists(User user) {
    User duplicatedUser = this.userRepository.find(user.getName());
    return duplicatedUser != null;
  }
}
