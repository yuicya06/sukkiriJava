package sukkiri_re.lesson15.practice_print15.practice04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

//	問４　Dateクラスを使用して現在の日時を実行結果の形式で表示してください。
//	実行結果例
//	2023年01月09日（月） 09時05分03秒

	
	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日");
		String dd = sdf.format(d);
		System.out.println(dd);

	}

}
