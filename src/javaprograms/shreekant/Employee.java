package shreekant;

class Employee {
	void m1(){
		System.out.println(" Employee.m1");
	}
	
	void m2(int num){
		if (num>12){
			System.out.println("Employee.m2");
		}
	}
	
	public static void main(String[] args){
		Employee1 employee1=new Employee1();
		employee1.m3();
	}
}