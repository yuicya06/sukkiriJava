package comparable.practice03ans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add( new Employee( "Alice", 50000 ) );
		list.add( new Employee( "Bob", 60000 ) );
		list.add( new Employee( "Charlie", 55000 ) );
		
		NameComparator nc = new NameComparator();
		Collections.sort(list, nc);
		
		
		System.out.println("名前でソート：");
		for( Employee e : list) {
			System.out.print(e);
		}
		
		
		System.out.println("---------------------------------");
		SalaryComparator sc = new SalaryComparator();
		Collections.sort(list, sc);
		System.out.println("給与でソート：");
		for( Employee e : list) {
			System.out.print(e);
		}
		
		
		System.out.println("---------------------------------");
		Collections.sort(list, Collections.reverseOrder(nc));
		System.out.println("名前で降順ソート：");
		for( Employee e : list) {
			System.out.print(e);
		}
		
		
		System.out.println("---------------------------------");
		Collections.sort(list, Collections.reverseOrder(sc));
		System.out.println("給与で降順ソート：");
		for( Employee e : list) {
			System.out.print(e);
		}
		
		/**/		
		
		
	}

}
