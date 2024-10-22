package file_operation.practice.practice_print06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {

		//起動時のログ
		SimpleDateFormat fmt = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'GMT'XXX yyyy", Locale.ENGLISH);
		Log.log_write(fmt.format(new Date()) + ":***App has started.***");

		Scanner sc = new Scanner(System.in);
		//割られる数字を受付

		System.out.print("the first integer＞");
		int first_num = sc.nextInt();

		//割る数字を受付
		System.out.print("the second integer(other than '0')＞");
		int second_num = sc.nextInt();

		//Divisionメソッドを呼び出し、結果を表示
		Calculation c = new Calculation(first_num, second_num);
		String ans = c.div();
		System.out.println(ans);

		//結果のログ
		Log.log_write(fmt.format(new Date()) + ":" + ans);

		//終了時のログ
		Log.log_write(fmt.format(new Date()) + ":" + "***App will exit.***");

	}

}
