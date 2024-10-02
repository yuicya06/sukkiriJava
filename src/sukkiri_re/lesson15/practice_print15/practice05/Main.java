package sukkiri_re.lesson15.practice_print15.practice05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
//	５　Calendarクラスを使用して現在の日時を実行結果の形式で表示してください。
//	実行結果例
//	2023年01月09日（月） 09時05分03秒


	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		Date d = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日（E） hh時mm分ss秒");
			
		System.out.println(sdf.format(d));
		
		

	}

}
