package db_operation.practice_print06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
//	家計簿テーブルからすべての列を取得し、Kakeiboコンストラクタの引数に渡し、インスタンス化したものをArrayListに追加し、そのリストを返す。
	public ArrayList<Kakeibo> select() {
		
		ArrayList<Kakeibo>list = new ArrayList<>();
		
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
				
				while (result.next()) {
					
//					String name = result.getString(1);
//					System.out.println(name);
					
					
					list.add(new Kakeibo(result.getTimestamp("日付"),result.getString("費目"),
							result.getString("メモ"),result.getInt("入金額"),result.getInt("出金額")));
					
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
	
	public int insert(Kakeibo kakeibo) {
		
		int count;
		
		// SQL 文の作成
				String sql = "insert into 家計簿 (日付, 費目, メモ, 入金額, 出金額) values ? , ? , ? , ? , ?";
				try (// PostgreSQL に接続
				 Connection con = DriverManager.getConnection(url, user, password);
				// SQL を実行するためのインスタンスを生成
				PreparedStatement pstmt = con.prepareStatement(sql);) {
				//プレースホルダーに値をセットする
				//pstmt.setInt(1,380); //（?の番号, セットする値）
					pstmt.executeUpdate("日付", kakeibo.getDate());
					pstmt.executeUpdate("費目", kakeibo.getItem());
					pstmt.executeUpdate("メモ", kakeibo.getMemo());
					pstmt.executeUpdate("入金額", kakeibo.getDeposit());
					pstmt.executeUpdate("出金額", kakeibo.getWithdrawal());
				// SQL の実行結果を格納する
				ResultSet result = pstmt.executeQuery();
				
				// 実行結果からデータを取得
				
				
				
				while (result.next()) {
					
//				String name = result.getString(1);
//				System.out.println(name);
				
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
				
				
		
		
		
		return 0;
		
	}
	
	

}
