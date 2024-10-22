package file_operation.practice.practice_print06;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
	public static void main(String[] args) {
		
		Date date = new Date();
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		date = calendar.getTime();
		System.out.println(date);
//		TimeZone tz = TimeZone.getTimeZone();
		
//		ZoneDateTime zdt = ZoneDateTime.now();
		
		//System.out.println(tz);
		
		//SimpleDateFormat  fmt = new SimpleDateFormat();
		//ZoneDateTime zdt = new ZoneDateTime("GMT");
		
		
		
		
		System.out.println(TimeZone.getTimeZone("GMT+9").getID());
//		
//		Date date = new Date();
//		
//		System.out.println("now：" + date);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM d HH:mm:ss yyyy");
		
		Date now = new Date();
		
		System.out.println(sdf.format(now));
		
		
		
		
		//date1 = calendar.getTime(); sc = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		//割られる数字を受付
		System.out.println("the first integer＞");
		int first_num = sc.nextInt();
		//割る数字を受付
		System.out.println("the second integer(other than '0')＞");
		int second_num = sc.nextInt();
		//Divisionメソッドを呼び出し、結果を表示
		Calculation c = new Calculation(first_num,second_num);
		String ans = c.div();
		System.out.println(ans);
		//ログメソッドを呼び出しファイルを書き込み
		Log.log_write(ans);
		
		
		
	}

}
