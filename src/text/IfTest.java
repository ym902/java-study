package text;

import java.util.Random;

public class IfTest {
  public static void main(String[] args) {
    // if
    String weather = "晴れ";
    // equals 文字同士を比較
    if("雨".equals(weather)) {
      System.out.println("傘を持って行く");
    }

    // if else
    int age = 19;
    if(age >= 20) {
      System.out.println("あなたはお酒が飲めます。");
    } else {
      System.out.println("あなたはお酒が飲めません。");
    }

    // if elseif else
    int point = new Random().nextInt(3); // 0~2の間でランダムに数字を取得
    if(point == 2) {
      System.out.println("大吉");
    } else if(point == 1) {
      System.out.println("中吉");
    } else {
      System.out.println("小吉");
    }

    // switch
    String card = "BRONZE";
    // ()      の中に調べたいものを書く
    // :       を最後に書く
    // break   をそれぞれに入れる 条件に当てはまったらswitch文を抜ける
    // default どれにも当てはまらない場合の処理
    switch (card) {
      case "GOLD":
        System.out.println("ゴールド会員です。");
        break;

      case "SILVER":
        System.out.println("シルバー会員です。");
        break;

      case "BRONZE":
        System.out.println("ブロンズ会員です。");
        break;
    
      default:
        System.out.println("非会員です。");
        break;
    }

    // if 条件を複数設定
    // && and
    // || or
    int age2 = 25;
    if(age2 >= 20 && age2 <= 29) {
      System.out.println("あなたは20代です。");
    } else {
      System.out.println("あなたは20代ではありません。");
    }
  }
}
