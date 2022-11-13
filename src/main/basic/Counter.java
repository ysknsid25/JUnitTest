package main.basic;

public class Counter {

  private int cnt = 0;

  public Counter() {
  }

  public int increment() {
    return ++this.cnt;
  }

}
