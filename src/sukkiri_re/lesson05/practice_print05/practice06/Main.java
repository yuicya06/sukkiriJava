package sukkiri_re.lesson05.practice_print05.practice06;

public class Main {

	//	問6　 メソッド名：getMin
	//	引数：double a, double b
	//	戻り値の型：double　return文で三項条件演算子を使用して下さい (テキストp122参照)
	//	処理の内容： 引数で受け取る2つの値のうち、小さい方の値を返す

	public static double getMin(double a, double b) {
		
		double min = a > b ? b : a;
		return min;
	}

	public static void main(String[] args) {
		double min = getMin(4.0, 3.0);
		System.out.println(min);

	}

}
