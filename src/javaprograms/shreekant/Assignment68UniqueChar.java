package shreekant;

import java.util.Arrays;

public class Assignment68UniqueChar{

	void getUniqueCharFromArr(String[] arr){
		String[] output=new String[arr.length];
		for(int index=0; index<arr.length; index++){
			//iterate Element
			String element=arr[index];
			String str="";
			for(int inner=0; inner<element.length(); inner++){
				//Iterate for each character
				char ch=element.charAt(inner);
				if (element.indexOf(ch)==element.lastIndexOf(ch)){
					str=str+ch;
				}
			}
			output[index]=str;
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args){
		String[] input={"aakanksha","techno","rutuja"};
		Assignment68UniqueChar assignment68UniqueChar=new Assignment68UniqueChar();
		assignment68UniqueChar.getUniqueCharFromArr(input);
	}
}
/*
Assignment - 68 : 15th July'2024

return uniquely present characters from given string array.

input : {aakanksha, techno, rutuja }
output : {nh, techno, rtja}

 */
