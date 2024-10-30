package comparable.practice03;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Alice", 50000));
		list.add(new Employee("Bob", 60000));
		list.add(new Employee("Charlie", 55000));

		NameComparator nc = new NameComparator();
		Collections.sort(list, nc);

		for (Employee e : list) {

			System.out.println(e);

		}

		System.out.println("--------------------------------------------");

		SalaryComparator sc = new SalaryComparator();
		Collections.sort(list, sc);

		for (Employee e : list) {

			System.out.println(e);

		}

		System.out.println("--------------------------------------------");

		Collections.sort(list, nc);

		Collections.reverse(list);

		for (Employee e : list) {

			System.out.println(e);

		}

		System.out.println("--------------------------------------------");

		Collections.sort(list, sc);
		Collections.reverse(list);

		for (Employee e : list) {

			System.out.println(e);

		}

	}

}
