package sukkiri.lesson06.practice.comment;

public class Kouhan {

	public static void  callDeae() {
		System.out.println("えぇい、こしゃくな。くせ者だ！であえい");

	}

	public static void  showMondokoro() throws Exception {
		System.out.println("飛車さん、角さん。もういいでしょう！");
		System.out.println("この紋所が目にはいらぬか！");
		
		//3s(秒) = 3000ms
		Thread.sleep(10000);
		Zenhan.doTogame(); //もう一度、とがめる
	
	}


}
