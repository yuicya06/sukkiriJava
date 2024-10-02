package sukkiri_re.lesson05.practice_print05.practice07;

import java.util.Random;

public class Main {

	//	問7　※配列を使ってください
	//	メソッド名： weather
	//	引数：なし
	//	戻り値の型： String
	//	処理の内容： 天気予報メッセージをランダムに生成して、そのメッセージを返す。
	//	天気予報メッセージは、次の中からランダムに組み合わせて作り出すものとする。
	//	{今日・明日・明後日}の天気は{晴れ・曇り・雨・雪}でしょう。 
	//	例：明日の天気は雨でしょう。
	//	ヒント：引数なしなので、メソッド呼び出し時に渡す値はありません。
	//	配列の宣言はweatherメソッドの中で行います。

	public static String weather() {
		//気予報メッセージをランダムに生成
		//{今日・明日・明後日}の天気は{晴れ・曇り・雨・雪}でしょう。 
		Random rand = new Random();
		int d = rand.nextInt(3);
		int w = rand.nextInt(4);
		//		String dd ="";
		//		String ww ="";

		//		switch (d) {
		//
		//		case 0 -> {
		//			 dd = "今日";
		//		}
		//		case 1 -> {
		//			 dd = "明日";
		//		}
		//		case 2 -> {
		//			 dd = "明後日";
		//		}
		//
		//		}
		//
		//		switch (w) {
		//
		//		case 0 -> {
		//			 ww = "晴れ";
		//		}
		//		case 1 -> {
		//			 ww = "曇り";
		//		}
		//		case 2 -> {
		//			 ww = "雨";
		//		}
		//		case 3 -> {
		//			 ww = "雪";
		//		}
		//
		//		}
		//

		String[] dd = { "今日", "明日", "明後日" };
		String[] ww = { "晴れ", "曇り", "雨", "雪" };

		String x = dd[d] + "の天気は" + ww[w] + "でしょう";

		//		String x = dd + "の天気は" + ww + "でしょう。";
				return x;

	}

	public static void main(String[] args) {
		System.out.println(weather());

	}

}
