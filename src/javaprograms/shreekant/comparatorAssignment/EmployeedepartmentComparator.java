package shreekant.comparatorAssignment;

import java.util.Comparator;

public class EmployeedepartmentComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.department.compareTo(o2.department) != 0) {	
			return o1.department.compareTo(o2.department);
		}else{
			return o1.name.compareTo(o2.name);
		}
	}
	
}
