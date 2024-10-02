package sukkiri_re.lesson05.practice_print05.practice05;

public class Main {
	//	問5　 メソッド名： printMin
	//	引数： double a, double b, double c
	//	戻り値：なし
	//	処理の内容： 引数で渡された a, b, c の値のうち、最小値を出力する

	public static void printMin(double a, double b, double c) {

//		double min = a;
//		if (min > b) {
//			min = b;
//		}
//
//		if (min > c) {
//			min = c;
//		}
//		System.out.println("最小値min：" + min);
		
		double min = Math.min(Math.min(a, b), c);
		System.out.println(min);

	}

	public static void main(String[] args) {
		printMin(1.4, 2.5, 4.2);

	}

}
