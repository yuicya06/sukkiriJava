package comparable.practice03ans;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{
	
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return  Double.compare(o1.getSalary(), o2.getSalary()) ;
	}
	
	/*
	@Override
	public int compare(Employee o1, Employee o2) {
		double sub = o1.getSalary() - o2.getSalary();
		
		if(sub < 0) {
			return -1;
		} else if(sub > 0) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
	*/
}
