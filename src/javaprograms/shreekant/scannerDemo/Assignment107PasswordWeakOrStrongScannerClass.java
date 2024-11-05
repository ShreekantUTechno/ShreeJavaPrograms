package shreekant.scannerDemo;

import java.util.Scanner;

public class Assignment107PasswordWeakOrStrongScannerClass {
	boolean isDigitPresent(String str) {
		for(int index=0; index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) {
				return true;
			}
		}return false;
	}
	
	boolean isUpperCasePresent(String str) {
		for(int index=0; index<str.length(); index++) {
			if(Character.isUpperCase(str.charAt(index))) {
				return true;
			}
		}return false;
	}
	
	boolean isLowerCasePresent(String str) {
		for(int index=0; index<str.length(); index++) {
			if(Character.isLowerCase(str.charAt(index))) {
				return true;
			}
		}return false;
	}
	
	boolean isReqLengthPresent(String str) {
		if(str.length()>8) {	
			return true;
		}return false;
	}
	
	boolean isSpecialCharPresent(String str) {
		String specialChar="@#$%^&*";
		for(int index=0; index<str.length(); index++) {
			if(specialChar.contains(String.valueOf(str.charAt(index))) ) {
				return true;
			}
		}return false;
	}
	
	void getStrongPassFromUser(){
		Scanner sc=new Scanner(System.in);
		int count=0,total=5;
		int strong=0;
		while(strong<1) {
			System.out.println("Please enter a password :");
			String password=sc.nextLine();
			if(isSpecialCharPresent(password) && isReqLengthPresent(password) && isLowerCasePresent(password) && isUpperCasePresent(password) && isDigitPresent(password)) {
				System.out.println("Password have been Successfully set,Thank you.");
				strong++;
			}else {
				count++;
				if(count>=5) {
					System.out.println("You have Exceeded the limit to set the Password, Contact your Administrator for further process");
					break;
				}
				System.out.println("Weak password, Please enter valid password and you remaining with only "+(total-count)+ " chance.");
			}
			
		}
	}
	
	public static void main(String[] args) {
		Assignment107PasswordWeakOrStrongScannerClass assign108=new Assignment107PasswordWeakOrStrongScannerClass();
		assign108.getStrongPassFromUser();     //if User passes Strong passowrd,then check output
		System.out.println();		
		System.out.println("Method is called for 2nd time to check weather it"
				+ " works or not for wrong password and if he crosses his limit of setting password");
		assign108.getStrongPassFromUser(); 	   /*if User passes wrong password, then it should show 
		                                         the chances remaining with and ask for valid password*/
	}
}


