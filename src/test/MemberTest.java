package test;

import static org.junit.Assume.assumeTrue;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class MemberTest {

  public enum Gender {
    MALE, FEMALE
  }

  @DataPoints
  public static int[] AGEs = { 15, 20, 25, 30 };

  @DataPoints
  public static Gender[] GENDERs = Gender.values();

  @Theory
  public void canEntryUnder25Female(int age, Gender gender) throws Exception {
    // ! assumeTrueは引数がFalseの場合その時点でテスト実行を中断し、次のテストケースに進む
    assumeTrue(age < 25 && gender == Gender.FEMALE);
    System.out.println("Test condition is age:" + age + ", gender:" + gender);
  }

}
