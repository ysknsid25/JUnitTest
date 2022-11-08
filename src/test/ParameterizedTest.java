package test;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ParameterizedTest {
  @RunWith(Theories.class)
  public static class IntParameterizedTest {
    @DataPoint
    public static int INT_PARAM_1 = 3;

    @DataPoint
    public static int INT_PARAM_2 = 4;

    @Theory
    public void hasParameterMethodTest(int param) throws Exception {
      System.out.println("Parameter is " + param);
    }

  }

  @RunWith(Theories.class)
  public static class StringParameterizedTest {
    @DataPoint
    public static String STR_PARAM_1 = "Hello";

    @DataPoint
    public static String STR_PARAM_2 = "World";

    @Theory
    public void hasStringParameterMethodTest(String param) throws Exception {
      System.out.println("Parameter is " + param);
    }

  }

}
