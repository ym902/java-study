package text;

public class CastTest {
  public static void main(String[] args) {
    // キャスト データ型を変更すること
    // 小さなサイズのデータ型から、大きなサイズのデータ型への変更は暗黙的に行われる
    int x = 25;
    double y = x;
    System.out.println(y); // 25.0 double型=小数点

    // 大きなサイズのデータ型から、小さなサイズのデータ型への変更は明示的に行う
    double a = 25.2;
    int b = (int)a;
    System.out.println(b); // 25 切り捨て
  }
}
