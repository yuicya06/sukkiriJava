package method_reference.sample01;

import java.util.function.Function;
//ストリーム
public class Main {
	public static void main(String[] args) {
		// 静的メソッドの参照
		Function<String, Integer> function = Main::stringLength;
		// 静的メソッドを呼gび出し
		int length = function.apply("Hello");
		System.out.println("Length of string: " + length);
	}

	public static int stringLength(String str) {
		return str.length();
	}
}