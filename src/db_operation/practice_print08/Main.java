package db_operation.practice_print08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	//	formatterメソッド(staticメソッド)
	//	：引数は文字列を受け取り、java.util.Date型を返す
	//	受け取った文字列を「yyyy-MM-dd」の書式のjava.util.Date型に変換する
	//	変換する際、例外処理が必要であり、変換成功時は成功したものを返し、
	//	失敗時は現在日時のjava.util.Date型を返す

	static Date formatter(String str) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date date = fmt.parse(str);

			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Date();

	}

	//	：DbOperationインスタンス、Kakeibo型ArrayListインスタンス、Scannerインスタンスを生成する。
	//	　出力結果例のように入力を受け取り、それらをKakeiboコンストラクタに渡し、Kakeiboインスタンスを生成する。
	//	　そのKakeiboインスタンスでDBに追加処理を行い、その追加処理を行うメソッドの戻り値によって、
	//	 「追加しました」あるいは「追加できませんでした」を表示する。
	//	　その後、selectメソッドを呼び出す。
	//	　出力結果例のように、表示する。
	//	 ※DBに接続するたびに、connectメソッド、disconnectメソッドを呼び出す必要あり

	public static void main(String[] args) {

		DbOperation db = new DbOperation();
		ArrayList<Kakeibo> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("日付 ：");
		String date = sc.nextLine();
		java.util.Date util_date = formatter(date);


		try {

			db.connect();

			int count = db.delete(util_date);

			db.disconnect();

			if (count == 1) {
				System.out.println("削除しました");

			} else {
				System.out.println("削除できませんでした");
			}

			db.connect();
			list = db.select();
			db.disconnect();

			for (Kakeibo l : list) {
				l.show();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
