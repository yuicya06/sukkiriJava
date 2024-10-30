package variousClass.localClass.practice01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	static void arrayAlphabeticalOrder(List<String> list) {

		class AlphabeticalOrderComparator implements Comparator<String> {

			@Override
			public int compare(String o1, String o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o1.compareTo(o2);
			}

		}

		AlphabeticalOrderComparator ao = new AlphabeticalOrderComparator();
		Collections.sort(list, ao);

	}

	static void arrayLengthOrder(List<String> list) {

		class LengthOrderComparator implements Comparator<String> {

			@Override
			public int compare(String o1, String o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o1.length() - o2.length();
			}

		}

		LengthOrderComparator lo = new LengthOrderComparator();
		Collections.sort(list, lo);

	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Alice");
		list.add("David");
		list.add("Charlie");
		list.add("Bob");

		arrayAlphabeticalOrder(list);

		for (String s : list) {
			System.out.println(s);
		}

		System.out.println("------------");

		arrayLengthOrder(list);
		for (String s : list) {
			System.out.println(s);
		}

	}

}
