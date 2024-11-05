package shreekant;

public class Assignment38{
	
	void getAddiOfLength(String [] values){
		int totalSum=0;
		int index;
		for(index=0;index<values.length;index++){
			String eachValue=values[index];
			totalSum=totalSum+eachValue.length();
		}
		System.out.println("addition of length of all characters present in String is "+totalSum);
	}
	
	public static void main(String[] args){
		String[] name= {"Maulik", "Technocredits", "Hi"};
		Assignment38 assign38=new Assignment38();
		assign38.getAddiOfLength(name);
	}
}
/*Assignment - 38 : 30th Jun'2024 [12-15 mins]

write a method which takes one parameter as String array, and return sum of length of the all the elements.

input : {"Maulik", "Technocredits", "Hi"}
output : 21*/
