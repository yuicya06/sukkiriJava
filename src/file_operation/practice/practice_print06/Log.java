package file_operation.practice.practice_print06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Log {

	public static void log_write(String ans) {
		//割り算の結果をログに書き込み
		// 書き込むファイルを指定
		String filepath = System.getProperty("user.dir") + "\\file\\app.log";
		// try-with-resources 文を使ってファイルを開く
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true));) {
			// 書き込みを繰り返す
			bw.write(ans);
			// ファイルに書き込み
			bw.newLine(); // 改行
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
