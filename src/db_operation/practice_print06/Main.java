package db_operation.practice_print06;

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
		} catch (Exception e) {
			e.printStackTrace();
			return new Date();
		}

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
		
		System.out.print("費目 ：");
		String item = sc.nextLine();
		
		System.out.print("メモ ：");
		String memo = sc.nextLine();
		
		
		System.out.print("入金額 ：");
		int deposit = sc.nextInt();
		sc.nextLine();
		
		System.out.print("出金額 ：");
		int withdrawal = sc.nextInt();
		
		db.connect();
		
		try {
			
			Kakeibo kb = new Kakeibo(formatter(date), item, memo, deposit, withdrawal);
			
			int count = db.insert(kb);
			
			if(count ==1 ) {
				System.out.println("追加しました。");
				
			}else {
				System.out.println("追加できませんでした。");
			}
			
			
			 list = db.select();
			
			 for(Kakeibo l : list) {
				 l.show();
			 }
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		db.disconnect();
		
		
		
		
		
		

	}

}
