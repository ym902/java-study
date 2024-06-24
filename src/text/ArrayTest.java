package text;

import java.util.Arrays;

public class ArrayTest {
  public static void main(String[] args) {
    // 配列 1
    String[] basket = new String[3]; // 3つ値が入るということ
    basket[0] = "バナナ";
    basket[1] = "にんじん";
    basket[2] = "たまねぎ";
    System.out.println(basket[0]);
    System.out.println(Arrays.toString(basket));

    // 配列 2
    String[] basket2 = {"きゅうり", "じゃがいも", "いちご"};
    System.out.println(basket2[1]);

    // 配列は参照型 住所の情報だけを扱っている
  }
}
