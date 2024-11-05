package shreekant;

public class Assingment81PalindromeNum{

	void getNumPalindromeOrNot(int num){
		int original=num;
		int digit=0;
		int rev=0;
		while(num>0){
			digit=num%10;
			rev=rev*10 +digit;
			num=num/10;
		}
		if(original==rev){
			System.out.println(original + " is a palindrome number.");
		}else{
			System.out.println(original + " is not a palindrome number.");
		}
	}

	public static void main(String[] args){
		Assingment81PalindromeNum assign81=new Assingment81PalindromeNum();
		assign81.getNumPalindromeOrNot(12321);
		assign81.getNumPalindromeOrNot(123123);
	}
}

/*Assignment - 81 : 28th July'2024
write a method to find if number is palindrom.

input : 12321
output : 12321 is a palindrom number.

input : 123123
output : 123123 is not a palindrom number.
 */