package test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import main.Calculator;

/**
 * 一つのクラス・メソッドに最低一つのテストが存在する。
 * テストクラスの命名は、検査対象クラス + Test
 * 検証対象のオブジェクト名はsut
 * 実値 = actual
 * 期待値 = expected
 */
public class AppTest {

  /**
   * 一番最後に行われる処理。慣習的にメソッド名はtearDown
   */
  @After
  public void tearDown() {
    System.out.println("after");
  }

  @Ignore("当たり前のテスト")
  @Test
  public void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  public void canGetResultByMultiply() {
    Calculator calc = new Calculator();
    int expected = 12;
    int actual = calc.multiply(3, 4);
    assertEquals(actual, expected);
  }

  @Test
  public void canGetResultByDevide() {
    Calculator calc = new Calculator();
    int expected = 3;
    int actual = calc.devide(12, 4);
    assertEquals(actual, expected);
  }

  @Test(expected = IllegalArgumentException.class)
  public void canThrowWhenDevideByZero() {
    Calculator calc = new Calculator();
    calc.devide(12, 0);
  }

  // @Test
  // public void intentionalFail() {
  // fail("無条件に失敗させたい時に使う");
  // }

  /**
   * 一番最初に行う処理。
   * メソッド名は慣習的にsetupとされる。
   */
  @Before
  public void setup() {
    System.out.println("before");
  }

  @Test
  public void isContainApple() {
    Calculator sut = new Calculator();
    List<String> actual = sut.getList();
    assertTrue(actual.contains("Apple"));
  }

}
