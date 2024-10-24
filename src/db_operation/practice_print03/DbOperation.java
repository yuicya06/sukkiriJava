package db_operation.practice_print03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperation {
	// 接続文字列の設定
	// DB の URL
	private String url = "jdbc:postgresql://localhost:5432/postgres";
	// DB のユーザー名
	private String user = "postgres";
	// DB のパスワード
	private String password = "postgrestest";
	
	public void select() {
		
		
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(getUrl(), getUser(), getPassword());
				// SQL を実行するためのインスタンスを生成
				Statement stmt = con.createStatement();) {
			// SQL 文の作成
			//			String sql = "select * from 家計簿 where 出金額 >=" + 1000;
			String sql = "select 費目, メモ, 入金額, 出金額 from 家計簿";//全件取得

			/*SQL 文を実行し、結果を ResultSet に格納する。*/
			ResultSet result = stmt.executeQuery(sql);
			// 実行結果からデータを取得
			while (result.next()) {

				String colItem = result.getString("費目");
				String colMemo = result.getString("メモ");
				int colDeposit= result.getInt("入金額");
				int colWithdrawal = result.getInt("出金額");
				System.out.println("======================");
				System.out.println(colItem);
				System.out.println(colMemo);
				System.out.println(colDeposit);
				System.out.println(colWithdrawal);

				
				
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
	
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
