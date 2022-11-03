package main;

public class Calculator {
  public int multiply(int x, int y) {
    return x * y;
  }

  public int devide(int x, int y) {
    if (y == 0) {
      throw new IllegalArgumentException("devide by zero");
    }
    return x / y;
  }
}
