package shreekant;

public class Assignment35 {

	int getAsciiValue(char a) {
		return a;
	}
	
	char getCharacter(int value) {
		return (char)value;
	}
	
	public static void main(String[] args) {
		Assignment35 assign35=new Assignment35();
		System.out.println(assign35.getAsciiValue('g'));
		System.out.println(assign35.getCharacter(98));
	}
}


/*Assignment - 35 : 30th Jun'2024 [8-10 mins]

Write a method to return ascii value of given character.
Write a method to return character of given ascill value.
*/