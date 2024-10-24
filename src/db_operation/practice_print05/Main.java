package db_operation.practice_print05;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
//		●Mainクラス
//		・メソッド
//		mainメソッド
//		：DbOperationインスタンスを生成し、selectメソッドを呼び出し、Kakeibo型の
//		ArrayListに代入。
//		　その後、すべての要素においてshowメソッドを呼び出す。
//		※DBに接続するたびに、connectメソッド、disconnectメソッドを呼び出す必要あり
		
		
		DbOperation db = new DbOperation();
		
		ArrayList<Kakeibo>list = new ArrayList<>();
		
		db.connect();
		list=db.select();
		db.disconnect();
		
		for(Kakeibo kb :list) {
			kb.show();
		}
		

		

	}

}
