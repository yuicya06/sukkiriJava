package comparater.sample01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 30));
		people.add(new Person("Bob", 25));
		people.add(new Person("Charlie", 35));
		// 比較基準のインスタンスを生成し、ソートする
		AgeComparator ageComparator = new AgeComparator();
		//（リストと比較基準を渡す）peopleをageComparatorの点で並び替える
		//Collections.sort(people, ageComparator); // 昇順
		Collections.sort(people, Collections.reverseOrder(ageComparator)); // 降順
		for (Person person : people) { // ソートされたリストを出力
			System.out.printf("%-7s:%3d years old\n", person.getName(), person.getAge());
		}
	}
}

	class Person {

		private String name;
		private int age;
		private int income;

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
	}

	//比較基準を決める（Ageの比較）

	class AgeComparator implements Comparator<Person> {
		@Override
		public int compare(Person person1, Person person2) {
			// 例: 年齢を比較する場合
			return person1.getAge() - person2.getAge();
		}
	}
	
	class IntComparator implements Comparator<Person> {
		@Override
		public int compare(Person person1, Person person2) {
			// 例: 年齢を比較する場合
			return person1.getAge() - person2.getAge();
		}
	}

