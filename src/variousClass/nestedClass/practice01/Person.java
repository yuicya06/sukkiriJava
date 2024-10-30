package variousClass.nestedClass.practice01;

public class Person {
	private String name;
	private int age;

	/*constructor*/
	private Person() {

	}

	/*getter/setter*/
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static PersonBuilder builder() {
		return new PersonBuilder();

	}

	/*inner class*/
	static class PersonBuilder {
		/*fields*/
		private String name;
		private int age;

		public PersonBuilder name(String name) {
			this.name = name;

			return this;

		}

		public PersonBuilder age(int age) {
			this.age = age;

			return this;

		}

		Person build() {

			Person person = new Person();
			person.name = this.name;
			person.age = this.age;

			return person;

		}

	}

}
