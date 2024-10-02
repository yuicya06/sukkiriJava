package sukkiri_re.lesson15.practice_print15.practice06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	
//	問６　LocalDateTimeクラスを使用して現在の日時を実行結果の形式で表示してください。
//	実行結果例
//	2023年01月09日（月） 09時05分03秒


	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日（E） hh時mm分ss秒");
		
		//String str = dtf.toString(ldt);
		String str = dtf.format(ldt);
		System.out.println(str);

	}

}
