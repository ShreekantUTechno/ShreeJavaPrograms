package shreekant.comparatorAssignment;

import java.util.Comparator;

public class EmployeeJoiningYearComparator implements Comparator<Employee>{
	public int compare(Employee obj1,Employee obj2) {
		if(obj1.joiningYear-obj2.joiningYear ==0) {
			return obj1.name.compareTo(obj2.name);
		}else {
			return obj1.joiningYear-obj2.joiningYear;
		}
	}
}
