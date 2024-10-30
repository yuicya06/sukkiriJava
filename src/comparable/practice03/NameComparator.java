package comparable.practice03;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {

		if (o1.getName().compareTo(o2.getName()) < 0) {
			return -1;
		} else if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		} else {
			return 0;

		}

	}
	
	
	
	

}
