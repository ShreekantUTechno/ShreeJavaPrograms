package shreekant;

public class Assignment61 {
	    
	void getRepeatativeChar(String input){
		while(input.length()!=0){
			char ch=input.charAt(0);
			int total =input.length();
			input=input.replace(String.valueOf(ch),"");
			int count =total - input.length();
			if(count>1){
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		String input="aakanksha";
		Assignment61 assignment61 =new Assignment61();
		assignment61.getRepeatativeChar(input);
	}
}

/*
	Assignment - 54 : 5th July'2024 [IMP]
	Print repeatative characters from given String.

	input : aakanksha
	output : ak
	NOte : Use while loop
 */

