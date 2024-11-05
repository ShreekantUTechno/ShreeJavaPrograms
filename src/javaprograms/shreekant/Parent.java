package shreekant;

public class Parent {
	
	int num=99;
	int rNo=1;    //This is the common variable in both classes.
	
	void setData() {
		//This is the common method bet two classes
		System.out.println("Parent set Data");
	}
	
    void displayData() {
		System.out.println("Parent Display Method");
	}
}
