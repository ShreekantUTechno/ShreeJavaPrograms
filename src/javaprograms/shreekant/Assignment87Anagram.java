package shreekant;

import java .util.Arrays;
public class Assignment87Anagram{

	void getAnagramOrNot1(String str1,String str2){
		String newStr1=str1,newStr2=str2;
		if (str1.length()!= str2.length()){
			System.out.println(newStr1 + " and "+newStr2 +" are not the anagrams.");
		}else{
			boolean flag =true;
			while(str1.length()>0){
				char ch=str1.charAt(0);
				str1=str1.replace(String.valueOf(ch),"");
				str2=str2.replace(String.valueOf(ch),"");
				if (str1.length()!=str2.length()){
					flag=false;
					break;
				}
			}
			if (flag==true){
				System.out.println(newStr1 + " and "+newStr2 +" are the anagrams.");
			}else{
				System.out.println(newStr1 + " and "+newStr2 +" are not the anagrams.");
			}

		}
	}

	void getAnagramOrNot2(String str1, String str2){
		if (str1.length()!= str2.length()){
			System.out.println(str1 + " and "+str2 +" are not the anagrams.");
		}else{
			char[] ch1=str1.toCharArray(); 	
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean flag=true;
			for(int index=0; index<ch1.length; index++){
				if(ch1[index]!=ch2[index]){
					flag=false;
					break;
				}
			}
			if(flag==true){
				System.out.println(str1 + " and "+str2 +" are the anagrams.");
			}else{
				System.out.println(str1 + " and "+str2 +" are not the anagrams.");
			}
		}
	}

	public static void main(String[] args){
		Assignment87Anagram assign87=new Assignment87Anagram();
		assign87.getAnagramOrNot1("listen","silent");
		assign87.getAnagramOrNot1("techno","echtoo");
		assign87.getAnagramOrNot2("listen","silent");
		assign87.getAnagramOrNot2("techno","echtoo");
	}
}

/*
Assignment - 87 : 30th July'2024
print a method to find whether given Strings are anagram.
write solution one with sorting another without sorting.

input : listen, silent
output : Anagram

input : techno, echtoo
output : Not an angram
 */
