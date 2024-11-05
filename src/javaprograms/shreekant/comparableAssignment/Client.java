package shreekant.comparableAssignment;

import java.util.Set;
import java.util.TreeSet;

public class Client {
	
	void processData() {
		Builder build1=new Builder("A.K.Builder",25 ,40,200000);
		Builder build2=new Builder("Keystone Construction",20 ,25,230000);
		Builder build3=new Builder("Blueprint Builders",13 ,56,100000);
		Builder build4=new Builder("Forge & Frame",9,10,300000);
		Builder build5=new Builder("Zenith Development",40 ,126,400000);
		
		//if I am trying to print ref then it will print Memory Adress.Beacause 
		//toString FromObjectClass called And it Prints MA.
		//To print all values like in String ,it is also a ref but still prints 
		//value,because String class overriding the toString,and providing implementation of toString method inStrig class.
		Set<Builder>set=new TreeSet<Builder>();
		set.add(build1);
		set.add(build2);
		set.add(build3);
		set.add(build4);
		set.add(build5);
		//If you print directly set reference variable it will throw a classCastException./
		//to avoid that we need to implements Comparable Interface.
		System.out.println(set);
	}
	
	public static void main(String[] args) {
		new Client().processData();
	}
}
