package shreekant;

public class Client1 {

	public static void main(String[] args) {
		System.out.println("Case1 ");
		System.out.println("Parent p=new Parent()");
		System.out.println("**********************");
		Parent p=new Parent (); // Static polymorphism 
		/*created object of parent class and reference type is also of parent class.
		Means reference type will take guaranty of parent class at compile time ,,means all variables and 
		methods present in parent will be accessible but you cannot access child class variable and methods....
		methods are behavior of the object So in this case Object is also of parent  */
		p.setData();/* it will call the parent class setData method as the bahavior is not changing from compile time to
		run time because object is of parent class */
		System.out.println(p.num); // 99  As there is only single num variable so no confusion.
		System.out.println(p.rNo); /* 1 is the Ans--- As reference type is taking guaranty from  parent class 
		and also variables are property of the object */
		p.displayData();// There is no confusion as there only a single method
		/*System.out.println(p.num2);    Compilation Error --- You cannot access the variable from child class as the 
		reference type taking taking guaranty from parent only*/
		//p.printData(); Compilation Error---Only parent class variables and methods are accessible
	}

}
