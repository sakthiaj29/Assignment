package assignment.arraylist.sortscustomobjects;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

	public int compare(Student o1, Student o2) {
		return Long.compare(o1.getId(), o2.getId());
	}
}
