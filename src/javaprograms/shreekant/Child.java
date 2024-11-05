package shreekant;

public class Child extends Parent{
	
	int num2=1999;
	int rNo=25;   //This is the common variable in both classes.
	
	void setData() {  
		//This is the common method bet two classes
		System.out.println("Child Set Data");
	}
	
	void printData(){
		System.out.println("Child Print Data");
	}
}
