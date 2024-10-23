package file_operation.practice.practice_print06.teamTakehana;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	//ファイルパス
	private static String filepath ="app.log";
	//method applog (メッセージを追記するメソッド）
	public static  void appLog(String message){
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath, true));//ファイルに書き込む
				//書き込むデータにDate型フォーマットがあるため、PrintWriterを使う。
				PrintWriter pw = new PrintWriter(bw)) {

			//DateインスタンスからStringを生成する
			Date now = new Date();//現在の日時を取得
			SimpleDateFormat sdf = 
					new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy",Locale.ENGLISH);
			String str = sdf.format(now);//日時フォーマットをString型に変更

			//app追記
			pw.println(str + ":" + message); //app.logファイルに日付とメッセージを書き込む

		} catch (IOException ex) {//例外処理
			ex.printStackTrace();//スタックトレースを出力
		}

	} 

	public static void main(String[] args) {
		appLog("***App has started.***");//プログラム開始の知らせをapp.logファイルに追記
		Scanner sc = new Scanner (System.in);//Scannerクラスのインスタンスを生成

		while (true) {//無限ループ
			try {
				//分子整数をキーボードで受付
				System.out.print("the first integer＞");
				int numerator ;//キーボードで入力された分子整数を格納する変数
				try {
					numerator = Integer.parseInt(sc.nextLine());//入力されたString 型から整数型に変更

				}catch (NumberFormatException e) {//整数ではない場合に例外処理
					throw new InputMismatchException("null");
				}


				//割り算の分母整数をキーボードで受付
				System.out.print("the second integer(other than '0')＞ ");
				int denominator;//キーボードで入力された分母整数を格納する変数
				try {
					denominator = Integer.parseInt(sc.nextLine());//入力されたString 型から整数型に変更
					if (denominator == 0) {//入力は０の場合、
						throw new IllegalArgumentException("Please enter a non-zero integer.");
					} 
				}catch (NumberFormatException e) {//整数ではない場合に例外処理
					throw new InputMismatchException("null");//メッセージを表示
				}


				//割り算
				int result = numerator/denominator;//割り算結果をresult変数に代入
				String displayResult = numerator + "/"+ denominator + "="+ result;//method appLogの引数として渡すため、String型に変更 
				System.out.println(displayResult);//割り算をString 型で表示
				appLog(displayResult);//割り算をapp.logファイルに追記


			}catch(InputMismatchException e) {///整数ではない時に例外処理
				System.out.println("An error has occurred: null");//メッセージを表示
				appLog("An error has occurred: null");//app.logファイルにメッセージを追記

			}catch(IllegalArgumentException e) {//割り算の分母は0の時に例外処理
				System.out.println("error: " + e.getMessage());//メッセージを表示
				appLog( "error: " + e.getMessage());//app.logファイルにメッセージを追記
			}


			// 計算を続けるか確認する。
			while (true) {//無限ループ
				System.out.print("continue the calculation?[y / n]＞ ");//キーボードで受付
				String str = sc.nextLine();//キーボードでYes(y) or No(n)を入力

				if (str.equalsIgnoreCase("y")) {//ｙを入力された場合
					break;  // このループを抜けて再度に割り算ループに戻り、割り算を続行

				} else if (str.equalsIgnoreCase("n")) {//ｎを入力された場合プログラムを終了させる。
					appLog("***App will exit.***");//プログラムの終了知らせをapp.logファイルにメッセージを追記
					System.out.println("***App will exit.***");//コンソールにメッセー ジを表示する。
					sc.close();//入力停止、コードしなければ無限入力になる。
					return; //プログラム終了

				} else {//ｙまたｎ以外を入力された場合下記のメッセージを表示する
					System.out.println("The input value is invalid.");//表示メッセージ
					appLog("The input value is invalid.");//app.logファイルにメッセージを追記
				}
			}
		}
	}
}

//【練習問題】ファイル操作⑥
//※	fileOperation.practice.practice_print06パッケージ内に以下を作成しましょう。
//
//＜目的＞エラーなく実行できる割り算のプログラム
//＜条件＞
//・入力値や割る数について例外が発生した場合はその例外の内容をapp.logファイルに追記する。
//・割り算を例外なく行うことができた場合、その割り算の式をapp.logファイルに追記する。
//・割り算を繰り返し行うことができるようにする。
//・app.logファイルに追記するものは「現在日時：例外内容または式」といったものにする。
//・例外内容については「割り算に用いる入力値」に関してである。
//・「割り算に用いる入力値」については、割られる数、割る数が整数値以外の場合「null」(InputMismatchExceptionクラス)、割る数が「0」の場合「Please enter a non-zero integer.」(IllegalArgumentExceptionクラス)をapp.logファイルに追記する。
//
//コンソール	app.log
//the first integer＞ 3
//the second integer(other than '0')＞ 1
//3 / 1 = 3
//continue the calculation?[y / n]＞y
//the first integer＞ a
//An error has occurred: null
//continue the calculation?[y / n]＞y
//the first integer＞ 3
//the second integer(other than '0')＞ a
//An error has occurred: null
//continue the calculation?[y / n]＞y
//the first integer＞ 4
//the second integer(other than '0')＞ 2
//4 / 2 = 2
//continue the calculation?[y / n]＞abc
//The input value is invalid.
//continue the calculation?[y / n]＞y
//the first integer＞ 5
//the second integer(other than '0')＞ 0
//error: Please enter a non-zero integer.
//continue the calculation?[y / n]＞n
//
//※水色マーカーは入力値	Fri Apr 19 13:59:15 GMT+09:00 2024: ***App has started.***
//Fri Apr 19 13:59:18 GMT+09:00 2024: 3 / 1 = 3
//Fri Apr 19 13:59:26 GMT+09:00 2024: An error has occurred: null
//Fri Apr 19 13:59:35 GMT+09:00 2024: An error has occurred: null
//Fri Apr 19 13:59:39 GMT+09:00 2024: 4 / 2 = 2
//Fri Apr 19 13:59:49 GMT+09:00 2024: error: Please enter a non-zero integer.
//Fri Apr 19 13:59:51 GMT+09:00 2024: ***App will exit.***
//
//
//※青文字部分は割り算が成功した場合である
//※赤文字は整数値以外が読み込まれた場合である
//(値はgetMessage()で取得可)
//※緑文字は割る数が0の場合である
//



