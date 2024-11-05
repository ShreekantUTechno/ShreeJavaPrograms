package shreekant;

public class Client3 {

	public static void main(String[] args) {
		System.out.println("Case3");
		System.out.println("Parent parent=new Child();");
		System.out.println("***************************");
		Parent parent=new Child(); //This shows Dynamic Polymorphism.
		/*Parent parent=new Child(); -- This line will get compilation error if we do not create 
		 relationship between parent child class by using extend keyword.
		 In this case, reference type is of the parent class.So Reference 
		 type will take the guaranty of the parent class at compile time so all the variables and methods present
		 in parent class will be visible to access so variables present in child class will not be accessible by this reference variable
		 and for the method if the method which is present in parent class is exactly similar to the 
		 child class then at the run time methods behaviour will change and it will run the child class 
		 method as we have created the object of child class . at compile time it will consider parent method 
		 and at the run time it will consider the child class method. so this phenomenon is known as Dynamic polymorphism */
		System.out.println(parent.num); /* vaiables are property of the class ..it will consider the parent num variable*/
	
		/*System.out.println(parent.num2); /* Compilation error --reference type is of parent so only parent variables and methods
		r accessible.*/
		System.out.println(parent.rNo); // 1
		
		parent.setData(); /*now the reference type takes the guaranty of parent class at compile time,but methods 
		are behaviour of the object so at the run time methods changes its behaviour as the object is of the child class so child class 
		setData method will be called.So this is the Dynamic Polymorphism*/
		
		/* parent.printData();   compilation error -----*/
		
		parent.displayData();
		
	}
}
