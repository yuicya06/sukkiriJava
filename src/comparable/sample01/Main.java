package comparable.sample01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));
		// オブジェクトのリストをソート
		Collections.sort(people); // 昇順
		//Collections.reverse(people); // 降順
		for (Person person : people) { // ソートされたリストを出力
			System.out.printf("%-7s:%3d years old\n",
					person.getName(), person.getAge());
		}

	}
}

	//比較したいクラスに実装する
	//compareメソッド
	class Person implements Comparable<Person> {

		private String name;
		private int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return this.name;
		}

		public int getAge() {
			return this.age;
		}

		@Override
		public int compareTo(Person otherPerson) {
			return this.age - otherPerson.age; // 例: 年齢を比較する場合
		}

	}
