package shreekant.comparatorAssignment;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.salary - o2.salary !=0) {
			return o1.salary-o2.salary;
		}else {
			return o1.name.compareTo(o2.name);
		}
	}
}
