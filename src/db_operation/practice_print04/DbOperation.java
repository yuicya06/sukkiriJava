package db_operation.practice_print04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DbOperation {

	//	Connectionクラスの変数connを初期化せずに変数のみ設定する
	//	URL、ユーザー名、パスワードを初期化せずに変数のみ設定する
	//	SimpleDateFormat型の変数sdfを初期化せずに変数のみ設定する

	/*fields*/
	private Connection conn;
	private String url;

	private String user;

	private String password;

	private SimpleDateFormat sdf;

	//	引数なしで、フィールドのURL、ユーザー名、パスワードに値を代入する
	//	SimpleDateFormatクラスのインスタンスを生成し、フィールド変数sdfに代入
	//	※書式は「yyyy-MM-dd」にする

	/*constructor*/
	public DbOperation() {

		// DB の URL
		url = "jdbc:postgresql://localhost:5432/postgres";
		// DB のユーザー名
		user = "postgres";
		// DB のパスワード
		password = "postgrestest";
		//日付の型フォーマットの設定(家計簿テーブルに日付があるため)
		sdf = new SimpleDateFormat("yyyy-MM-dd");

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
	//	：引数、戻り値はなく、家計簿テーブルからすべての列を取得し、コンソールに表示する
	public void select() {
		//資源付tyr catch文
		try (Statement stmt = conn.createStatement();) {
			String sql = "select * from 家計簿";//全件取得
			/*SQL 文を実行し、結果を ResultSet に格納する。*/
			ResultSet result = stmt.executeQuery(sql);
			// 実行結果からデータを取得
			while (result.next()) {

				/*日付、費目、メモ、入金額、出金額を取得 */
				Date colDate = result.getTimestamp("日付"); //(1)sql側の列側の数字でもOK
				String colItem = result.getString("費目"); //(2)
				String colMemo = result.getString("メモ"); //(3)
				int colDeposit = result.getInt("入金額"); //(4)
				int colWithdrawal = result.getInt("出金額");
				/*表示*/
				System.out.println("=====================");
				System.out.println("日付：" + sdf.format(colDate));
				System.out.println("費目：" + colItem);
				System.out.println("メモ：" + colMemo);
				System.out.println("入金額：" + colDeposit);
				System.out.println("出金額：" + colWithdrawal);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*setter/getter*/
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
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

	public SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

}
