package shreekant;

public class Assignment69UniqueCharFByDigit{

	void getUniqueCharFollowedByDigit1(String str){
		for(int index=0; index<str.length()-1; index++){
			char ch=str.charAt(index);
			int count=0;
			if(index==str.indexOf(ch)){
				for(int inner=0; inner<str.length(); inner++){
					if(ch==str.charAt(inner)){
						count++;
					}
				}	
			}
			if (count==1 && (Character.isDigit(str.charAt(index+1)))){
				System.out.print(ch);
			}
		}
	}

	void getUniqueCharFollowedByDigit(String str){
		for(int index=0; index<str.length()-1; index++){
			char ch=str.charAt(index);
			if ((str.indexOf(ch)==str.lastIndexOf(ch)) && Character.isDigit(str.charAt(index+1))){
				System.out.print(ch);
			}
		}
	}	

	public static void main(String[] args){
		Assignment69UniqueCharFByDigit assign69=new Assignment69UniqueCharFByDigit();
		assign69.getUniqueCharFollowedByDigit("aakan1ksh44t"); //Method 1 
		System.out.println();
		assign69.getUniqueCharFollowedByDigit1("aakan1ksh44t");// Method 2
	}
}/*
Assignment - 69 : 15th July'2024

return uniquely present letters followed by digit(s) from given string.

input : aakan1ksh44a
output : nh

 */
