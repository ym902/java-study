package text;

public class OperatorTest {
  public static void main(String[] args) {
    // 演算子 足し算
    int total = 10 + 20;
    System.out.println(total);

    // 変数を使って足し算
    String y = "yen";
    System.out.println(10 + 20 + y);

    // % 余り
    int surplus = 4 % 2;
    System.out.println(surplus);
    surplus = 5 % 2;
    System.out.println(surplus);

    // += 加算代入 累計を計算するときなどに使用
    int sum = 0;
    sum += 10;
    System.out.println(sum);

    // ++ インクリメント
    int count = 0;
    count++;
    System.out.println(count);
  }
}