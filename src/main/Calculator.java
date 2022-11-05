package main;

import java.util.ArrayList;
import java.util.List;

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

  public List<String> getList() {
    List<String> retList = new ArrayList<String>();
    retList.add("Apple");
    retList.add("Banana");
    retList.add("Orange");
    return retList;
  }
}
