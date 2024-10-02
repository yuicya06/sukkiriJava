package sukkiri_re.lesson15.practice_print15.practice03;

public class Main {

	//	問3　下記表は各都市の１月の平均気温です。
	//	各国を要素の値に持つString型の配列cityと、
	//	各気温を要素の値に持つdouble型の配列temperatureを作り、
	//	実行結果のような表示をしてください。
	//	Tokyo	Canberra	Washington	Anchorage	Whitehorse
	//	4.9	21.44	0.35	-8.34	-15.3
	//
	//	実行結果例
	//	Tokyo      ：  4.90
	//	Canberra   ： 21.44
	//	Washington ：  0.35
	//	Anchorage  ： -8.34
	//	Whitehorse ：-15.30

	public static void main(String[] args) {
		String[] city = { "Tokyo", "Canberra", "Washington", "Anchorage", "Whitehorse" };
		double[] temp = { 4.9, 21.44, 0.35, -8.34, -15.3 };
		for (int i = 0; i < city.length; i++) {
			System.out.printf("%-12s:%6.2f\n", city[i], temp[i]);
		}

	}

}
