package comparator.practice02;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		if (o1.getScore() - o2.getScore() > 0) {
			return 1;
		} else if (o1.getScore() - o2.getScore() < 0) {
			return -1;
		} else {
			return o1.getAge() - o2.getAge();
		}

	}

}
