package text;

public class VariableTest {
  public static void main(String[] args) {
    // データ型 変数名;
    int number = 7;
    boolean result = true;
    String item = "りんご";
    item = "みかん";

    System.out.println(number);
    System.out.println(result);
    System.out.println(item);

    // 定数 上書きできない変数のこと
    // finalをつける
    // すべて大文字 / 複数文字の場合は、区切りを"_"で結合する
    final int ADULT = 140;
    int price = ADULT * 2;
    System.out.println(price);
  }
}
