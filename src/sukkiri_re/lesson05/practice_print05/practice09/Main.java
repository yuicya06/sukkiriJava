package sukkiri_re.lesson05.practice_print05.practice09;

import java.util.Scanner;

public class Main {

	//	問9　 メソッド名： average
	//	引数：double[] array
	//	戻り値の型：double
	//	処理の内容： 引数で受け取る配列の要素の平均値を返し表示する。
	//	　　　　　　 配列の要素数、各値はキーボード入力とします。

	public static double average(double[] array) {

		double sum = 0.0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		double avg = sum / array.length + 1;

		return avg;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("配列の要素数＞");
		int n = sc.nextInt();

		double[] avg = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("入力値＞");
			double m = sc.nextInt();
			avg[i] = m;
		}

		System.out.println(average(avg));

	}

}
