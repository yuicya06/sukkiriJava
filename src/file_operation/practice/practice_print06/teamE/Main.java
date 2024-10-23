package file_operation.practice.practice_print06.teamE;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//書式の指定（Wed Oct 23 10:20:44 GMT+09:00 2024）
		SimpleDateFormat fmt = new SimpleDateFormat("EEE MMM dd HH:mm:ss 'GMT'XXX yyyy", Locale.ENGLISH);

		/*起動時のログの書き込み*/
		Log.log_write(fmt.format(new Date()) + ":***App has started.***");

		Scanner sc = new Scanner(System.in);

		//割り算の数値を格納する変数の初期化
		int first_num = 0;
		int second_num = 0;

		//割り算メソッドの答えを格納する変数の初期化
		String ans = null;

		//ループするかの変数
		String yn = null;
		boolean isContinue = true;

		while (isContinue == true) {
			//数値を受付。数値以外が入力されるとエラーを返す
			try {
				//割られる数字を受付
				System.out.println("the first integer＞");
				first_num = Integer.parseInt(sc.nextLine());
				//割る数字を受付
				System.out.println("the second integer(other than '0')＞");
				second_num = Integer.parseInt(sc.nextLine());

				//Divisionメソッドを呼び出し、結果を表示
				Calculation c = new Calculation(first_num, second_num);
				ans = c.div();
				System.out.println(ans);

				//ログメソッドを呼び出しファイルを書き込み
				//結果のログ
				Log.log_write(fmt.format(new Date()) + ":" + ans);

			} catch (Exception e) {
				System.out.println("An error has occurred: null");
				//e.printStackTrace();
				//sc.nextLine(); //数値以外が入力された時に、その値がynに格納されてしまうためここで捕獲
				//エラーをログメソッドに返す
				Log.log_write(fmt.format(new Date()) + "An error has occurred: null" + e.getMessage());

			}

			while (true) {
				System.out.println("continue the calculation?[y / n]＞");
				yn = sc.nextLine();
				//続行するかの分岐文
				if (yn.equals("y")) { //yの時は数値入力に戻る
					isContinue = true;
					break;
				} else if (yn.equals("n")) { //nの時はループを抜け、数値受付ループも抜ける
					isContinue = false;
					break;
				} else { //それ以外の時は再度y/nを受け付ける
					System.out.println("The input value is invalid.");
				}
			}

		}

		//終了時のログ
		Log.log_write(fmt.format(new Date()) + ":" + "***App will exit.***");

	}

}
