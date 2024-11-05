package shreekant;

public class Aissgnment70UniqueVowelFbyDigit{

	void getVowelFbyDigit(String str1){
		String str=str1.toLowerCase();
		for(int index=0; index<str.length()-1; index++){
			String vowel="aeiou";
			char ch=str.charAt(index);
			if (vowel.contains(String.valueOf(ch))){
				if (str.indexOf(ch)==str.lastIndexOf(ch) && Character.isDigit(str.charAt(index+1))){
					System.out.print(ch);
					break;
				}
			}	
		}
	}

	public static void main(String[] args){
		Aissgnment70UniqueVowelFbyDigit assign70=new Aissgnment70UniqueVowelFbyDigit();
		assign70.getVowelFbyDigit("aakan1ksi44au3p");
	}
}
/*
Assignment - 70 : 15th July'2024
return uniquely present first volwel letter followed by digit(s) from given string.

input : aakan1ksi44au3p
output : i 
 */
