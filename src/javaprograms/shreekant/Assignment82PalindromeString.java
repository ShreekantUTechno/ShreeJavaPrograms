package shreekant;

public class Assignment82PalindromeString{

	void getStringPalindromeOrNot(String str){
		String original=str,rev="";
		for(int index=str.length()-1; index>=0; index--){
			char ch=str.charAt(index);
			rev=rev+ch;
		}
		if(original.equals(rev)){
			System.out.println(original+" is a palindrome number.");
		}else{
			System.out.println(original+" is not a palindrome number.");
		}
	}

	public static void main(String[] args){
		Assignment82PalindromeString assign82=new Assignment82PalindromeString();
		assign82.getStringPalindromeOrNot("12321");
		assign82.getStringPalindromeOrNot("12331");
	}
}
/*
Assignment - 82 : 28th July'2024
write a method to find if String is palindrom.

input : 12321
output : 12321 is a palindrom number.

input : 12331
output : 12331 is not a palindrom number.

 */
