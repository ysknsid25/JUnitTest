package main.basic;

public class StringUtils {

  public StringUtils() {
  }

  /**
   * 文字列をスネークケースに変換する
   * 
   * @param str
   * @return
   * @throws NullPointerException
   */
  public static String toSnakeCase(String str) throws NullPointerException {
    if (str == null) {
      throw new NullPointerException();
    }
    char[] chrArr = str.toCharArray();
    String retStr = "";
    for (int i = 0; i < chrArr.length; i++) {
      char c = chrArr[i];
      boolean isUpperCase = Character.isUpperCase(c);
      char lowerc = Character.toLowerCase(c);
      if (i > 0 && isUpperCase) {
        retStr += "_";
      }
      retStr += String.valueOf(lowerc);
    }
    return retStr;
  }

}
