package comparable.practice03;

public class Employee {

	private String name;
	private double salary;

	public Employee(String name, double salary) {

		setName(name);
		setSalary(salary);

	}

	@Override
	public String toString() {
		return "Employee: name=" + getName() + "    salary=" + getSalary();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
