package shreekant;

public class Assignment22Character {
	void display(String name) {
		int uppCount=0,digCount=0,lowCount=0,specCount=0,spaceCount=0;
		for (int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if (Character.isLowerCase(ch)) {
				lowCount++;
			}else if (Character.isDigit(ch)) {
				digCount++;
			}else if(Character.isUpperCase(ch)) {
				uppCount++;
			}else if(ch==' ') {
				spaceCount++;
			}else {
				specCount++;
			}
		}
		System.out.println("The count of lowercase character is "+ lowCount);
		System.out.println("The count of uppercase character is "+ uppCount);
		System.out.println("The count of digit character is "+ digCount);
		System.out.println("The count of space is "+ spaceCount);
		System.out.println("The count of special character is "+ specCount);
	}
	
	public static void main (String[]args) {
		Assignment22Character assign22=new Assignment22Character();
		assign22.display("Te4c_hnoCredi3ts ");
	}
}
/*Assignment - 22 : 11th Jun'2024

Print count of uppercase, lowercase, digit and special characters in given input string. [20 mins]

input : "Te4c_hnoCredi3ts"
output : uppercase -> 2
         lowercase -> 11
		 digit -> 2
		 special char -> 1*/