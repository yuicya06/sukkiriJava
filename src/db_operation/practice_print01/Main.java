package db_operation.practice_print01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Main {


	public static void main(String[] args) {
		// 接続文字列の設定
		// DB の URL
		String url = "jdbc:postgresql://localhost:5432/postgres";
		// DB のユーザー名
		String user = "postgres";
		// DB のパスワード
		String password = "postgrestest";
		//日付の型フォーマットの設定(家計簿テーブルに日付があるため)
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		// SQL 文の作成
		String sql = "select 費目 from 家計簿";
		try (// PostgreSQL に接続
		 Connection con = DriverManager.getConnection(url, user, password);
		// SQL を実行するためのインスタンスを生成
		PreparedStatement pstmt = con.prepareStatement(sql);) {
		//プレースホルダーに値をセットする
		//pstmt.setInt(1,380); //（?の番号, セットする値）
		// SQL の実行結果を格納する
		ResultSet result = pstmt.executeQuery();
		
		// 実行結果からデータを取得
		
		
		
		while (result.next()) {
			
//		String name = result.getString(1);
//		System.out.println(name);
		
		String colItem = result.getString("費目");
		System.out.println(colItem);
		
		/*
		// 日付、費目、メモ、入金額、出金額を取得
		Date colDate = result.getTimestamp("日付");
		String colItem = result.getString("費目");
		String colMemo = result.getString("メモ");
		int colDeposit = result.getInt("入金額");
		int colWithdrawal = result.getInt("出金額");
		// 表示
		System.out.println(df.format(colDate) + ":" + colItem
		+ ":" + colMemo + ":" + colDeposit + ":" + colWithdrawal);
		*/
		
		
		}
		} catch (SQLException e) {
		// SQLException の例外処理
		e.printStackTrace();
		}
		
		
		
		

	}
}
