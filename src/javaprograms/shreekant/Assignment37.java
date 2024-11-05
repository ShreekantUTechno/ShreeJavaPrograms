package shreekant;

class Assignment37{
	
	void getLengthOfString(String[] name){
		int index;
		for (index=0;index<name.length;index++){
			String value=name[index];
			System.out.println(value+"=>"+value.length());
		}
	}
	
	public static void main(String[] args){
		String[] name={"Maulik", "Technocredits", "Hi"};
		Assignment37 assign37=new Assignment37();
		assign37.getLengthOfString(name);
	}
}
/* Assignment - 37 : 30th Jun'2024 [12-15 mins]

write a method which takes one parameter as String array, and print all the elements with its length.

input : {"Maulik", "Technocredits", "Hi"}
output : Maulik -> 6
		 Technocredits -> 13
		 Hi -> 2*/
