package test.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import main.basic.Counter;

@RunWith(Enclosed.class)
public class CounterTest {
  // ! 状態を保つクラスのテストを行う場合、副作用を与えないようにテストケースごとにクラスに分割し、setUpでnewしている
  public static class InitialStateCounterTest {
    private Counter sut;

    @Before
    public void setUp() {
      this.sut = new Counter();
    }

    @Test
    public void initialStateTest() {
      int expected = 1;
      int actual = this.sut.increment();
      assertEquals(expected, actual);
    }
  }

  public static class oneExecCounterTest {
    private Counter sut;

    @Before
    public void setUp() {
      this.sut = new Counter();
    }

    @Test
    public void initialStateTest() {
      int expected = 2;
      int actual = this.sut.increment();
      actual = this.sut.increment();
      assertEquals(expected, actual);
    }
  }

  public static class fiftyExecCounterTest {
    private Counter sut;

    @Before
    public void setUp() {
      this.sut = new Counter();
    }

    @Test
    public void initialStateTest() {
      int expected = 51;
      int actual = this.sut.increment();
      for (int i = 0; i < 50; i++) {
        actual = this.sut.increment();
      }
      assertEquals(expected, actual);
    }
  }

}
