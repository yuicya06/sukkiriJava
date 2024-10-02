package sukkiri_re.lesson05.practice_print05.practice08;

import java.util.Scanner;

public class Main {

	//	問8　 メソッド名： minValue
	//	引数：int[]型 array
	//	戻り値の型：int
	//	処理の内容： 引数で受け取る配列の要素のうち、最も小さい値を返し表示する。
	//			　　　 配列の要素数は5で固定、各値はキーボード入力とします。
	public static int minValue(int[] array) {
		int min = array[0];
		for(int i = 0; i<4; i++) {
			if(min > array[i +1]) {
				min = array[i+1];
			}
		}

		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("入力値＞");
			array[i] = sc.nextInt();
		}
		
		System.out.println("最小値：" + minValue(array));

	}

}
