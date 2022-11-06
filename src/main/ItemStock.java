package main;

public interface ItemStock {
  /**
   * 商品と数量を指定して追加する
   * 
   * @param item
   * @param num
   */
  public void add(String item, int num);

  /**
   * 商品を指定して、商品の在庫数を返す
   * 
   * @param item
   * @return 在庫数。登録されていない場合は0
   */
  public int size(String item);

  /**
   * 商品の在庫が残っている場合にtrueを返す
   * 
   * @param item 商品名
   * @return 在庫が1以上の場合にtrue
   */
  public boolean contains(String item);
}
