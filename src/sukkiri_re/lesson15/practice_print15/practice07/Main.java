package sukkiri_re.lesson15.practice_print15.practice07;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	
//	問７　LocalDateクラスとPeriodクラスを使用して、年月日を入力し、今日との差を表示してください。
//	実行結果例
//	年月日を入力してください（yyyy/m/d形式）：2002/1/3
//	今日との差：21年0か月9日


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("年月日を入力してください（yyyy/m/d形式）：");
		String str = sc.nextLine();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/M/d");
		
		//入力
		LocalDate d1 = LocalDate.parse(str,dtf);
		
		
		//今日 2024-09-05
		LocalDate d2 = LocalDate.now();
		
		//Period
		Period p = Period.between(d1, d2);
	
		System.out.printf("%d年%d月%d日",p.getYears(),p.getMonths(),p.getDays());
		
		
		//実行結果
//		年月日を入力してください
//		2002/1/3
//		今日との差：22年8か月2日
		

	}

}
