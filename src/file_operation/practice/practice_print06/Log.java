package file_operation.practice.practice_print06;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Log {
	public static void log_write(String ans) {
		//割り算の結果をログに書き込み
		// 書き込むファイルを指定
		String filepath = "file\\app.log";

		// try-with-resources 文を使ってファイルを開く
		try(FileWriter fw = new FileWriter(filepath);
				BufferedWriter bw = new BufferedWriter(fw);) {
			// 書き込みを繰り返す
			bw.write(ans); // ファイルに書き込み
			bw.newLine(); // 改行
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

}