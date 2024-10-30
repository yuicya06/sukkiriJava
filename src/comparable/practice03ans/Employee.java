
package comparable.practice03ans;


public class Employee {
	/*field*/
	private String name;
	private double salary;
	
	/*constructor*/
	public Employee(String name, double salary ) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		String format = "Employee: name=%-10s    salary=%-10f\n";
		String str = String.format(format, this.name, this.salary);
		return str;
	}
	/*getter, setter*/
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
