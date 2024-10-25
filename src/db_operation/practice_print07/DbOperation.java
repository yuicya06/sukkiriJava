package db_operation.practice_print07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DbOperation {
	//	・フィールド
	//	Connectionクラスの変数connを初期化せずに変数のみ設定する
	//	URL、ユーザー名、パスワードを初期化せずに変数のみ設定する

	/*fields*/
	private Connection conn;
	private String url;

	private String user;

	private String password;

	//	・コンストラクタ
	//	引数なしで、フィールドのURL、ユーザー名、パスワードに値を代入する

	public DbOperation() {

		url = "jdbc:postgresql://localhost:5432/postgres";
		// DB のユーザー名
		user = "postgres";
		// DB のパスワード
		password = "postgrestest";

	}

	//	connectメソッド
	//	：戻り値、引数なしで、フィールド変数connに値を代入する
	//	※例外処理が必要

	public void connect() {
		try {

			conn = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	//	disconnectメソッド
	//	：戻り値、引数なしで、フィールド変数connがnullでないならconnのcloseメソッドを呼び出す
	//	※例外処理が必要

	public void disconnect() {

		try {

			if (conn != null) {
				conn.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	//	selectメソッド
	//	：引数なし、戻り値はKakeibo型のArrayList
	//	Kakeibo型のArrayListを用意する
	//	家計簿テーブルからすべての列を取得し、Kakeiboコンストラクタの引数に渡し、
	//	インスタンス化したものをArrayListに追加し、そのリストを返す。
	public ArrayList<Kakeibo> select() {

		ArrayList<Kakeibo> list = new ArrayList<>();

		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				Statement stmt = con.createStatement();) {
			// SQL 文の作成
			//			String sql = "select * from 家計簿 where 出金額 >=" + 1000;
			String sql = "select * from 家計簿";//全件取得

			/*SQL 文を実行し、結果を ResultSet に格納する。*/
			ResultSet result = stmt.executeQuery(sql);

			// 実行結果からデータを取得
			while (result.next()) {

				//					String name = result.getString(1);
				//					System.out.println(name);

				list.add(new Kakeibo(result.getTimestamp("日付"), result.getString("費目"),
						result.getString("メモ"), result.getInt("入金額"), result.getInt("出金額")));

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

		return list;

	}

	//	insertメソッド
	//	　　：引数はKakeibo型(Kakeiboインスタンス)、戻り値はint型
	//		int型変数countを用意する
	//	　	PreparedStatementクラスのメソッドを用いて、
	//	  	引数で受け取ったKakeibo型のフィールドをDBに追加し、
	//	  	その戻り値を変数countに代入し、その変数countを返す

	public int insert(Kakeibo kb) {

		int count = 0;

		// SQL 文の作成
		String sql = "insert into 家計簿 values (" + "'" + kb.formatter(kb.getDate()) + "'" + "," + "'" + kb.getItem()
				+ "'"
				+ "," + "'" + kb.getMemo() + "'" + "," + kb.getDeposit() + "," + kb.getWithdrawal() + ")";
		/*
		 * 
		 * 
		 * 
		 * String sql = "insert into 家計簿 values (?, ?, ?, ?,?)";
		 * 
		 * 
		 * 
		 */
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);) {
			//プレースホルダーに値をセットする
			//pstmt.setInt(1,380); //（?の番号, セットする値）

			//java.sql.Dateが必要→日付のlong値が必要→日付はjava.util.Dateが必要

			/*util.dateからsql.dateにするのがめんどくさい
			 * 
			 * 
			 *  ①Kakeiboインスタンスのフィールド変数dateをlong値に変換
			 *  long long_date = kb.getDate().getTime();
			 *  
			 *  
			 *  ②long値を使って、java.sql.Dateインスタンスを生成
			 *  java.sql.Date sql_date =  new java.sqlDate(long_date);
			 *  
			 *  ③ java.sql.DateのインスタンスをgetDateの第2引数に渡す
			 *  ps.setDate(1,sql_date);
			 *  //java.sql.Date sql?date  new java.sql.Date(long_date);
			 *  
			 *  
			 *  
			* ps.setString(1, new java.sql.Date(kb.getDate().getTime());
			* ps.setString(2,kb.getExpenses());
			* ps.setString(3,kb.getMemo());
			* ps.setString(4,kb.getDeposit());
			* ps.setString(5,kb.getWithdrawal());
			* 
			* 
			* 
			*/

			// SQL の実行結果を格納する
			int result = pstmt.executeUpdate();

			// 実行結果からデータを取得

			/*			
						while (result.next()) {
			
						//				String name = result.getString(1);
						//				System.out.println(name);
			
						//				String colItem = result.getString("費目");
						//				System.out.println(colItem);
			
						
						// 日付、費目、メモ、入金額、出金額を取得
						Date colDate = result.getTimestamp("日付");
						String colItem = result.getString("費目");
						String colMemo = result.getString("メモ");
						int colDeposit = result.getInt("入金額");
						int colWithdrawal = result.getInt("出金額");
						// 表示
						System.out.println(df.format(colDate) + ":" + colItem
						+ ":" + colMemo + ":" + colDeposit + ":" + colWithdrawal);
						
			
						}
						
			*/
		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();
			return count;
		}

		return count += 1;

	}

	public int update(java.util.Date date, int widthDrawl) {

		int count = 0;

		// SQL 文の作成
		String sql = "update 家計簿 set 出金額 = ? where 日付 = ? ";

		/*
		 * 
		 * update 家計簿 set 入金額 =99999;
		 * 
		 * String sql = "insert into 家計簿 values (?, ?, ?, ?,?);
		 * 
		 * 
		 * 
		 */
		try (// PostgreSQL に接続
				Connection con = DriverManager.getConnection(url, user, password); //
				// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);) {

			//プレースホルダーに値をセットする
			//pstmt.setInt(1,380); //（?の番号, セットする値）

			//java.sql.Dateが必要→日付のlong値が必要→日付はjava.util.Dateが必要

			/*util.dateからsql.dateにするのがめんどくさい
			 * 
			 * 
			 *  ①Kakeiboインスタンスのフィールド変数dateをlong値に変換
			 *  long long_date = kb.getDate().getTime();
			 *  
			 *  
			 *  ②long値を使って、java.sql.Dateインスタンスを生成
			 *  java.sql.Date sql_date =  new java.sqlDate(long_date);
			 *  
			 *  ③ java.sql.DateのインスタンスをgetDateの第2引数に渡す
			 *  ps.setDate(1,sql_date);
			 *  //java.sql.Date sql?date  new java.sql.Date(long_date);
			 *  
			 *  
			 *  
			* ps.setString(1, new java.sql.Date(kb.getDate().getTime());
			* ps.setString(2,kb.getExpenses());
			* ps.setString(3,kb.getMemo());
			* ps.setString(4,kb.getDeposit());
			* ps.setString(5,kb.getWithdrawal());
			* 
			* 
			* 
			*/

			Kakeibo kb = new Kakeibo(date, widthDrawl);

			//long long_date = kb.getDate().getTime();
			long long_date = date.getTime();

			pstmt.setInt(1, widthDrawl);
			pstmt.setDate(2, new java.sql.Date(kb.getDate().getTime()));

			// SQL の実行結果を格納する
			int result = pstmt.executeUpdate();

			// 実行結果からデータを取得

			/*			
						while (result.next()) {
			
						//				String name = result.getString(1);
						//				System.out.println(name);
			
						//				String colItem = result.getString("費目");
						//				System.out.println(colItem);
			
						
						// 日付、費目、メモ、入金額、出金額を取得
						Date colDate = result.getTimestamp("日付");
						String colItem = result.getString("費目");
						String colMemo = result.getString("メモ");
						int colDeposit = result.getInt("入金額");
						int colWithdrawal = result.getInt("出金額");
						// 表示
						System.out.println(df.format(colDate) + ":" + colItem
						+ ":" + colMemo + ":" + colDeposit + ":" + colWithdrawal);
						
			
						}
						
			*/
		} catch (SQLException e) {
			// SQLException の例外処理
			e.printStackTrace();
			return count;
		}

		return count += 1;

	}

	private Object getWidhdrawal() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
}
