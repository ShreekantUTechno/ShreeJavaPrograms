package shreekant.comparatorAssignment;

public class Employee implements Comparable<Employee> {
	int id,salary,joiningYear;
	String name,department;
	
	public Employee(int id, int salary, int joiningYear, String name, String department) {
		super();
		this.id = id;
		this.salary = salary;
		this.joiningYear = joiningYear;
		this.name = name;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", joiningYear=" + joiningYear + ", name=" + name
				+ ", department=" + department + "]";
	}

	@Override
	public int compareTo(Employee obj) {
		return this.name.compareTo(obj.name);
	}
}
