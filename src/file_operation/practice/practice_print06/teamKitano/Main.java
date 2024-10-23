package file_operation.practice.practice_print06.teamKitano;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			//割る数と割られる数をそれぞれ初期化.
			int firstInteger = 0;
			int secondInteger = 1;
			//selectを初期化
			String select = null;
			//Scannerクラスのインスタンスを生成
			Scanner sc  =new Scanner(System.in);
			//パスの指定
			String filepath = "/pleiades/2023-12/workspace/sukkiri/group_work/app.log";
			//書き込みをするクラスのインスタンス化
			FileLog filelog = new FileLog(filepath);
			
			
			//ログファイルの更新をおこなうかの判定
			//判定の初期化
			String update = null;
			
			do {
				// y または n の入力
				System.out.print("Update file？[y / n]＞");
				update = sc.nextLine();
				
				//入力値がy または n と合致しない場合の処理
				if(!(update.equals("n") || update.equals("y") 
						|| update.equals("ｎ") || update.equals("ｙ"))) {
					System.out.println("The input value is invalid.");
				}	
			} while( !(update.equals("n") || update.equals("y") 
						|| update.equals("ｎ") || update.equals("ｙ")) );
					//入力値がy または n と合致するまで繰り返す
			
			// y 入力時の処理
			if( update.equals("y") || update.equals("ｙ") ) {

				//ファイルの更新
				filelog.FileUpdate();
			}
			
			
			//プログラム開始時ログファイル書き込み
			filelog.log("***App has started.***");
			
			do {
				try {
					//一つ目の数字を入力
					System.out.print("the first integer＞");
					String firstString = sc.nextLine();
				
					//文字列をint型に変換
					firstInteger = Integer.parseInt(firstString);
					
					//二つ目の数字を入力
					System.out.print("the second integer(other than '0')＞ ");
					String secondString = sc.nextLine();
					
					//文字列をint型に変換
					secondInteger = Integer.parseInt(secondString);
					
					//入力値が０の時の処理
					if( secondInteger == 0 ) {
						//エラーメッセージの表示
						String error = "error: Please enter a non-zero integer.";
						System.out.println(error);
						//ログファイル書き込み
						filelog.log(error);

					} else {
						//割り算処理 一つ目の数字と二つ目の数字を引数に渡して結果を受け取る
						int answer = Division(firstInteger, secondInteger);
						//結果をフォーマットに合わせて表示
						String result = String.format("%d / %d = %d",firstInteger, secondInteger, answer);
						System.out.println(result);

						//ログファイル書き込み
						filelog.log(result);

						}

					} catch (Exception e) {//入力値が数字でない場合の処理
						//エラーメッセージの表示
						String error = "An error has occurred: null";
						System.out.println(error);
						//ログファイル書き込み
						filelog.log(error);

					}
				

				
				do {
					//終了の確認
					System.out.print("continue the calculation?[y / n]＞");
					select = sc.nextLine();
					
					//入力値がy または n と合致しない場合の処理
					if( !(select.equals("n") || select.equals("y") 
							|| select.equals("ｎ") || select.equals("ｙ")) ) {
						System.out.println("The input value is invalid.");
					}
				} while ( !(select.equals("n") || select.equals("y") 
							|| select.equals("ｎ") || select.equals("ｙ")) );
							//入力値がy または n と合致するまで繰り返す

			} while ( select.equals("y") || select.equals("ｙ") );
					//入力値がyの間繰り返し処理

			
			//終了後ログファイル書き込み
			filelog.log("***App will exit.***");

		}
	
	
		//割り算を行うメソッド
		public static int Division(int firstFigure, int secondFigure) {
			int answer = firstFigure / secondFigure;
			return answer;
		}
		
}