package file_operation.practice.practice_print06.teamEbina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//ログのインスタンス
		LogOperation log = new LogOperation();
		//スタートログの書き込み
		log.StartFileWriter();

		boolean bool1 = true;

		while(bool1) {
			try {
				int num1;
				int num2;
				//割る数を入力
				System.out.print("the first integer＞");
				num1 = sc.nextInt();
				//割られる数を入力
				System.out.print("the second integer(other than '0')＞");
				num2 = sc.nextInt();
				
				//割る数が「0」でないか（例外を投げる）
				if(num2 == 0) {
					throw new IllegalArgumentException
					("Please enter a non-zero integer.");
				}

				//計算結果をコンソールに出力
				System.out.println( num1 + "/"  + num2 + "=" + num1 / num2);
				//計算ログを書き込む
				log.CalcFileWriter(num1,num2);

				//エラーの検出	 
				//整数値であるか 
			}catch(InputMismatchException e) {
				System.out.println("An error has occurred:" + e.getMessage());
				//エラーログ出力
				log.InputMismatchFileWriter();

				//割る数が「0」(IllegalArgumentException)でないか
			}catch(IllegalArgumentException e) {
				System.out.println("error:"+ e.getMessage());
				//エラーログ出力
				log.IllegalArgumentFileWriter();

			}finally{

				//計算を続けるかの確認
				boolean bool2 = true; 
				sc.nextLine();

				while(bool2) {
					System.out.println("continue the calculation?[y / n]＞");
					String s = sc.nextLine();

					if(s.equals("n")) {
						bool1 = false;
						bool2 = false;
						log.ExitFileWriter();
					}else if(s.equals("y")) {
						bool2 = false;
					}else {
						System.out.println("The input value is invalid.");

					}

				}
			}
		}
	}
}



