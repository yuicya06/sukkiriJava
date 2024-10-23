package file_operation.practice.practice_print06.teamIkeda;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 計算を続けるかどうかの判定
		boolean judgement = false;
		String filepath = "app.log";

		/*
		 * 処理内容：ファイルの書き込み処理
		 * ログファイルに書き込みを行うためにBufferedWriterを使用
		 */
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
			// アプリケーション開始時のログメッセージ
			bw.write(new Date() + ": ***App has started.***");
			bw.newLine();

			// 計算処理を行うループ
			do {
				try {
					/**
					 * 処理内容：割り算２つの値をint型変数に代入
					 */
					System.out.print("the first integer＞ ");
					int firstNum = scan.nextInt();
					System.out.print("the second integer(other than '0')＞ ");
					int secondNum = scan.nextInt();
					
					//もし、割る数が「0」の場合に例外処理を投げる
					if (secondNum == 0) {
						throw new IllegalArgumentException();
					}
					
					// 割り算を行い、結果を表示してログにも記載
					int ans = firstNum / secondNum;
					String ansStr = firstNum + " / " + secondNum + " = " + ans;
					System.out.println(ansStr);
					bw.write(new Date()+ ": " + ansStr);
					bw.newLine();
				
					// 入力が整数でない場合の例外処理
				} catch (InputMismatchException e) {
					bw.write(new Date() + ": " + "An error has occurred: null");
					bw.newLine();
					System.out.println("An error has occurred: null");
				
					// 割る数が「0」の場合の例外処理
				} catch (IllegalArgumentException e) {
					bw.write(new Date() + "error: Please enter a non-zero integer.");
					bw.newLine();
					System.out.println(": Please enter a non-zero integer.");

				}
				
				scan.nextLine();
				
				// 計算を続けるかどうかをユーザーに尋ねるループ
				while (true) {
					System.out.print("continue the calculation?[y / n]＞ ");
					String continu = scan.nextLine();
					
					// 「y」を入力した場合は計算を続ける
					if (continu.equals("y")) {
						judgement = true;
						break;
					// 「n」を入力した場合は計算を終了
					} else if (continu.equals("n")) {
						judgement = false;
						bw.write(new Date() + ": ***App will exit.***");
						break;
					// それ以外の入力は無効とする
					} else {
						System.out.println("The input value is invalid.");
					}
				}

			// judgementがtrueの間はループを続ける
			} while (judgement);

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
	}
}