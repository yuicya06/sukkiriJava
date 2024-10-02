package sukkiri_re.lesson05.practice_print05.practice04;

public class Main {

	//問4　 メソッド名： printArea
	//引数： double height, double width
	//戻り値：なし
	//処理の内容： 高さが height, 横幅が width の長方形の面積を出力する
	//ヒント：長方形の面積の求め方　高さ×横幅

	public static void printArea(double height, double width) {
		
		 double area = height * width;
		 System.out.println(area);

	}

	public static void main(String[] args) {
		printArea(2.5, 3.4);

	}

}
