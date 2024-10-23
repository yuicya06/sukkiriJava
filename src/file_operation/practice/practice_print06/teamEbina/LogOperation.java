package file_operation.practice.practice_print06.teamEbina;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class LogOperation {
	
	//書き込むファイルを指定
	String filepath = "file\\data.txt";

	//スタートログ
	public void StartFileWriter() {
		try( FileWriter fw = new FileWriter(filepath,true);
				BufferedWriter bw = new BufferedWriter(fw);){

			Date d = new Date();
			bw.write(d + ": ***App has started.***"); // ファイルに書き込み
			bw.newLine();
		}catch(IOException e) {
			// IOException の例外処理
			e.printStackTrace();

		}
	}
	//整数値以外のエラーログ
	public void InputMismatchFileWriter() {
		try( FileWriter fw = new FileWriter(filepath,true);
				BufferedWriter bw = new BufferedWriter(fw);){

			Date d = new Date();
			bw.write(d + ": An error has occurred: null"); // ファイルに書き込み
			bw.newLine();
		}catch(IOException e) {
			// IOException の例外処理
			e.printStackTrace();

		}
	}
	//割る数が「0」のエラーログ
	public void IllegalArgumentFileWriter() {
		try( FileWriter fw = new FileWriter(filepath,true);
				BufferedWriter bw = new BufferedWriter(fw);){

			Date d = new Date();
			bw.write(d + ": error: Please enter a non-zero integer."); // ファイルに書き込み
			bw.newLine();
		}catch(IOException e) {
			// IOException の例外処理
			e.printStackTrace();

		}
	}
	
	//計算内容ログ
	public void CalcFileWriter(int num1,int num2) {
		try( FileWriter fw = new FileWriter(filepath,true);
				BufferedWriter bw = new BufferedWriter(fw);){

			Date d = new Date();
			bw.write(d + ": " + (num1 + "/"  + num2 + "=" + num1 / num2)); // ファイルに書き込み
			bw.newLine();
		}catch(IOException e) {
			// IOException の例外処理
			e.printStackTrace();

		}
	}

	//終了ログ
	public void ExitFileWriter() {
		try( FileWriter fw = new FileWriter(filepath,true);
				BufferedWriter bw = new BufferedWriter(fw);){

			Date d = new Date();
			bw.write(d + ": ***App will exit.***"); // ファイルに書き込み
			bw.newLine();
		}catch(IOException e) {
			// IOException の例外処理
			e.printStackTrace();

		}
	}
}
