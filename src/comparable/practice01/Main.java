package comparable.practice01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Number> list = new ArrayList<>();
		list.add(new Number(5));
		list.add(new Number(2));
		list.add(new Number(8));

		StringBuilder sb = new StringBuilder();
		Collections.sort(list);

		for (Number n : list) {
			sb.append(n.getValue());
			System.out.println("Value: " + n.getValue());
		}
				
		//reverseメソッドは逆にするだけなので、
		//はじめにつかうと、降順にならない
		//先に昇順にしてから、reverseメソッドを使う
		Collections.reverse(list);

		for (Number n : list) {
			sb.append(n.getValue());
			System.out.println("Value: " + n.getValue());
		}

		String str = sb.toString();
		System.out.println(str);

	}

}
