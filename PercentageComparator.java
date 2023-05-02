package comparatorinterface;

import java.util.Comparator;

import com.test.collection.Student;

public class PercentageComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		if(obj1.getPerc()<obj2.getPerc())
			return 1;
		else if (obj1.getPerc()<obj2.getPerc())
		return -1;
		else
		return 0;
	}
	

}
