package variousClass.annonymousClass.practice02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class nameList {
	String name;

	public nameList() {

	}

	public class Main {
		public static void main(String[] args) {

			List<String> list = new ArrayList<>();
			list.add("Alice");
			list.add("David");
			list.add("Charlie");
			list.add("Bob");

			Collections.sort(list, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO 自動生成されたメソッド・スタブ
					return o1.compareTo(o2);
				}

			});

			for (String s : list) {
				System.out.println(s);
			}

			Collections.sort(list, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO 自動生成されたメソッド・スタブ
					return o1.length() - o2.length();
				}

			});

			for (String s : list) {
				System.out.println(s);
			}

		}

	}
}
