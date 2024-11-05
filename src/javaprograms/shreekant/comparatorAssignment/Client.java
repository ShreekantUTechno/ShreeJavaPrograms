package shreekant.comparatorAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	void processData() {
		Employee emp1=new Employee(6,42000,2010,"Shashikant","HR");
		Employee emp2=new Employee(2,65000,2015,"Shreekant","Testing");
		Employee emp3=new Employee(10,30000,2010,"Sachin","Finance");
		Employee emp4=new Employee(11,30000,2004,"Ajinkya","HR");
		Employee emp5=new Employee(52,20000,2019,"Ravi","Development");
		
		ArrayList<Employee>list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		Collections.sort(list); //copilation error if didnt implements Comparable
		System.out.println("#########Sorting based on name");
		System.out.println(list);
		Collections.sort(list,new EmployeeIdComparator());
		System.out.println("#########Sorting based on ID");
		System.out.println(list);
		Collections.sort(list,new EmployeeSalaryComparator());
		System.out.println("#########Sorting based on salary and if salary is Same,then Sorting based on name");
		System.out.println(list);
		Collections.sort(list,new EmployeeJoiningYearComparator());
		System.out.println("##########Sorting based on JoiningYear and if JoiningYear is Same,then Sorting based on name");
		System.out.println(list);
		Collections.sort(list,new EmployeedepartmentComparator());
		System.out.println("##########Sorting based on department and if department is Same,then Sorting based on name");
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		new Client().processData();

	}

}
