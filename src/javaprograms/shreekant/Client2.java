package shreekant;

public class Client2 {

	public static void main(String[] args) {
		System.out.println( "Case2 ");
		System.out.println( "Child child=new Child();" );
		System.out.println("***************************");
		Child child=new Child();// Static polymorphism
		/*So all the variables and methods which is present in child class will be easily accessible
		  but as we have created a parent and child class relationship, So the methods and variables 
		  which are present in parent class are also accessible by reference type. Only the difference 
		  is when the variable and method name is exact same in both the classes. at run time , as we have created 
		  object of the child class, so at run time child class methods and variables will run */
		
		System.out.println(child.num2); //1999 
		
		System.out.println(child.rNo);  /*25 ---Now this variable is common betn both the class. 
		But at the run time object will be created of child class so it will print child class variable*/
		
		child.printData(); //it is the only method present between two classes. no confusion
		
		child.setData();   /* Now  Again this is the common method between the two classes
		but as you have created object of child class so it will print child class method*/
		
		System.out.println(child.num); // 99 Ans---As we have created relationship we  can access variables from parent class
		
		child.displayData();  /*Parent class methods easily accessible by creating object of 
		child class as we have created relationship */
	}
}
