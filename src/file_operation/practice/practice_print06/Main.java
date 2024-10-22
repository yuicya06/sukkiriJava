package file_operation.practice.practice_print06;

import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Date now = new Date();


		Scanner sc = new Scanner(System.in);
		//割られる数字を受付
		System.out.println("the first integer＞");
		int first_num = sc.nextInt();
		//割る数字を受付
		System.out.println("the second integer(other than '0')＞");
		int second_num = sc.nextInt();
		//Divisionメソッドを呼び出し、結果を表示
		Calculation c = new Calculation(first_num, second_num);
		String ans = c.div();
		System.out.println(ans);
		//ログメソッドを呼び出しファイルを書き込み
		Log.log_write(ans);

	}

}
