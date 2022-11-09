package main.User;

public class ArgumentNullException extends Exception {

  public ArgumentNullException(String classname, String varname) {
    System.out.println(classname + "の" + varname + "がnullが値として渡ってきています。");
  }

}
