package file_operation.practice.practice_print06.teamKitano;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLog {
	
	/*フィールド*/
	private String filepath;
	
	/*コンストラクタ*/
	public FileLog(String filepath) {
		this.filepath = filepath;
	}
	
	/*メソッド*/
	//ファイルの初期化
	public void FileUpdate() {
		
		// try-catch 文を使ってファイルを開く
		try( BufferedWriter bw = new BufferedWriter(new FileWriter(this.filepath)); ) {
			//何も処理をしない
			
		}catch(IOException e) {
			// IOException の例外処理
			e.printStackTrace();
		}
		
	}
	
	//書き込みを行うメソッド
	public void log(String str) {
		//日付を取得して文字列に変換
		Date now = new Date();
		String nowTime = now.toString();

		// try-catch 文を使ってファイルを開く
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(this.filepath, true));) {

			bw.write(nowTime +":"+ str); // ファイルに書き込み
			bw.newLine(); // 改行

		}catch(IOException e) {
			// IOException の例外処理
			e.printStackTrace();
		}
	}

}
