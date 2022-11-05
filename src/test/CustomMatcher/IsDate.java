package test.CustomMatcher;

import java.util.Calendar;
import java.util.Date;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

public class IsDate extends BaseMatcher<Date> {

  private final int y;
  private final int m;
  private final int d;
  private Object actual;

  /**
   * コンストラクタ
   * 
   * @param y
   * @param m
   * @param d
   */
  private IsDate(int y, int m, int d) {
    this.y = y;
    this.m = m;
    this.d = d;
  }

  /**
   * ファクトリメソッド
   * 
   * @param y
   * @param m
   * @param d
   * @return
   */
  public static Matcher<Date> dateOf(int y, int m, int d) {
    return new IsDate(y, m, d);
  }

  /**
   * 実装したい比較方法の実態
   * 
   * @param actual
   * @return
   */
  @Override
  public boolean matches(Object actual) {
    this.actual = actual;
    if (!(this.actual instanceof Date)) {
      return false;
    }
    Calendar cal = Calendar.getInstance();
    cal.setTime((Date) actual);
    if (this.y != cal.get(Calendar.YEAR)) {
      return false;
    }
    if (this.m != cal.get(Calendar.MONTH)) {
      return false;
    }
    if (this.d != cal.get(Calendar.DATE)) {
      return false;
    }
    return true;
  }

  /**
   * matchesメソッドがfalseを返した場合に呼ばれる
   */
  @Override
  public void describeTo(Description desc) {
    desc.appendValue(String.format("%d/%02d/%02d", this.y, this.m, this.d));
  }
}
