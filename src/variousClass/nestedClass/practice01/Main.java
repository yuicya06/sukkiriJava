package variousClass.nestedClass.practice01;

import variousClass.nestedClass.practice01.Person.PersonBuilder;

public class Main {
	public static void main(String[] args) {

		PersonBuilder pb = Person.builder();
		pb.name("Alice");
		pb.age(30);
		Person person = pb.build();

		System.out.println(person.getName());
		System.out.println(person.getAge());
		
		//メソッドチェーン
		Person p = Person.builder()
				.name("Bob") //戻り値 PersonBuilder型
				.age(35)//戻り値 PersonBuilder型
				.build();

		System.out.println(p.getName());
		System.out.println(p.getAge());

	}

}
