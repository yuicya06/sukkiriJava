package sukkiri_re.lesson05.practice_print05.practice10;

import java.util.Scanner;

public class Main {
	
//	次のプログラムの ３つ領域 （キー入力部分、処理部分、表示部分）をそれぞれメソッド化し、
//	これらのメソッドを使ったプログラムに書き直してください。キー入力部分、処理部分、表示部分のメソッド名は、
//	それぞれ、inputNumber、numberToMessage、showMessage とします。
	
	
	//キー入力部分
	public static int inputNumber() {
		int  inNumber ;
		Scanner sc = new Scanner( System.in );
		System.out.print(" Input no. : ");
		inNumber = sc.nextInt();
		return inNumber;
	}
	
	
	//処理部分
	public static String numberToMessage(int inNumber) {
		String msg = "" ;
		switch( inNumber ){
			case 1 :
				msg = "Good Morning" ; 
				break ;
			case 2 :
				msg = "Good Afternoon" ; 
				break ;
			case 3 : 
				msg = "Good Evening" ; 
		}

		
		
		return msg;
		
	}

	//表示部分
	public static void showMessage(String msg) {
		System.out.println(msg);
	}
	
	

	public static void main(String[] args) {
		
		
		showMessage(numberToMessage(inputNumber()));

	}

}
