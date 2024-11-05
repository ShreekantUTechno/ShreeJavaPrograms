package shreekant;

import java.util.Arrays;

public class Assignment46getVowelOfEachElement {

	String getVowelString(String value){
		String vowel="";
		for(int index=0; index<value.length(); index++){
			char ch= value.charAt(index);
			char ch1=Character.toLowerCase(ch);
			if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u'){
				vowel=vowel+ch1;				
			}
		}return vowel;	
	}
	
	void getVowels(String [] arr){
		for(int index=0; index<arr.length; index++){
			String value=arr[index];
			String vowelString=getVowelString(value);
			arr[index]=vowelString;
		}
	}
	
	public static void main(String[] args){
		String [] input={"techno", "credits", "puneee"};
		Assignment46getVowelOfEachElement assign46=new Assignment46getVowelOfEachElement();
		assign46.getVowels(input);
		System.out.println(Arrays.toString(input));
	}

}
