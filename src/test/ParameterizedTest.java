package test;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class ParameterizedTest {
  @DataPoint
  public static int INT_PARAM_1 = 3;

  @DataPoint
  public static int INT_PARAM_2 = 4;

  @DataPoint
  public static String STR_PARAM_1 = "Hello";

  @DataPoint
  public static String STR_PARAM_2 = "World";

  public ParameterizedTest() {
    System.out.println("initialized");
  }

  @Theory
  public void hasMixedParameterMethodTest(int param, String strparam) throws Exception {
    System.out.println("Parameter is " + param + "," + strparam);
  }

  @Theory
  public void hasMultiParameterMethodTest(int x, int y) throws Exception {
    System.out.println("Parameter is " + x + "," + y);
  }

}
