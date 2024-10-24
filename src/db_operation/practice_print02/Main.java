package db_operation.practice_print02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Main {

	// 接続文字列の設定
	// DB の URL
	static String url = "jdbc:postgresql://localhost:5432/postgres";
	// DB のユーザー名
	static String user = "postgres";
	// DB のパスワード
	static String password = "postgrestest";

	static void select() {

		//日付の型フォーマットの設定(家計簿テーブルに日付があるため)
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				Statement stmt = con.createStatement();) {
			// SQL 文の作成
			//			String sql = "select * from 家計簿 where 出金額 >=" + 1000;
			String sql = "select 費目, メモ from 家計簿";//全件取得

			/*SQL 文を実行し、結果を ResultSet に格納する。*/
			ResultSet result = stmt.executeQuery(sql);
			// 実行結果からデータを取得
			while (result.next()) {

				String colItem = result.getString("費目");
				String colMemo = result.getString("メモ");
				System.out.println("===========");
				System.out.println(colItem);
				System.out.println(colMemo);

				/*日付、費目、メモ、入金額、出金額を取得 */
				//				Date colDate = result.getTimestamp("日付"); //(1)sql側の列側の数字でもOK
				//				String colItem = result.getString("費目");	//(2)
				//				String colMemo = result.getString("メモ");	//(3)
				//				int colDeposit = result.getInt("入金額");	//(4)
				//				int colWithdrawal = result.getInt("出金額");
				// 表示
				//				System.out.println(df.format(colDate) + ":" + colItem
				//						+ ":" + colMemo + ":" + colDeposit + ":" + colWithdrawal);
			}
		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		select();

	}

}
