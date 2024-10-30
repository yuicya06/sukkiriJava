package comparator.practice02;

import java.util.ArrayList;
import java.util.Collections;

	//2段階比較
	//まずは「成績」で比較し、その差がなければ「年齢」で比較、という流れ
public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Alice", 85, 20));
		list.add(new Student("Bob", 92, 22));
		list.add(new Student("Charlie", 78, 21));
		
		StudentComparator stc = new StudentComparator();
		Collections.sort(list, stc);
		
		for(Student stu :list) {
			System.out.println(stu);
			
		}
		
		System.out.println("-------------");
		
		list.add(new Student("Ray", 78, 19));
		Collections.sort(list, stc);
		
		for(Student stu :list) {
			System.out.println(stu);
			
		}
		
		System.out.println("-------------");
		Collections.reverse(list);
		
		for(Student stu :list) {
			System.out.println(stu);
			
		}

	}

}
