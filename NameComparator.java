package comparatorinterface;

import java.util.Comparator;

import com.test.collection.Student;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.getName().compareTo(obj2.getName());
		
		
	}
	

}
