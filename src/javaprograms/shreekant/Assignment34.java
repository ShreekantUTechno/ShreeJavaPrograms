package shreekant;

public class Assignment34 {
	
	void getAdditionOfDigit(String name) {
		int total=0;
		int count=0;
		for(int index=0;index<name.length();index++){
			char ch =name.charAt(index);
			if (Character.isDigit(ch)) {
				total=total+Character.getNumericValue(ch);
				count++;
			}
		}
		if(count >0) {
			System.out.println("The addition of digit present in the given string "+ name+" is "+total);
		}else{
			System.out.println("no digit present in the string "+ name);
		}	
	}
	
	void processData(String value1) {
		getAdditionOfDigit(value1);
	}
	
	public static void main(String[] args) {
		Assignment34 assignment34=new Assignment34();
		assignment34.processData("t1ech2no");
		assignment34.processData("credits");
		assignment34.processData("1234");
	}
}
/*Assignment - 34 : 29th Jun'2024
From the given string find sum of all the digits present. 
input : t1ech2no
output : 3
input : credits
output : no digit present in the string
input : 1234
output : 10 */
