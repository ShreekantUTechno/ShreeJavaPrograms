package shreekant;

import java.util.Arrays;
import java.util.*;
public class Assignment95ReplaceWord {

	void getArrReplaceWithWordArray(String []input,String str,String str1){
		for(int i=0; i<input.length; i++){
			if(str.equals(input[i])){
				input[i]=str1;
			}
		}
		System.out.println("Output By using Array: "+Arrays.toString(input));
	}

	void getArrReplaceWithWordCollection(String []input,String str,String str1){
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(input));
		if(al.contains(str)){
			while(al.contains(str)){
				int index= al.indexOf(str);
				al.set(index,str1);
			}
		}else{
			System.out.println(str +" is  not present in list.");   
		}
		System.out.println("Output by using Collection: "+al);
	}

	public static void main(String[] args) {
		String []input={"Maulik", "Techno", "Credits","Hi", "Hello", "Maulik", "Pune"};
		String str="Maulik";
		String str1="Techno";
		//By using Array
		Assignment95ReplaceWord assign95=new Assignment95ReplaceWord();
		assign95.getArrReplaceWithWordArray(input,str,str1);

		//By using collection
		String []input2={"Maulik", "Techno", "Credits","Hi", "Hello", "Maulik", "Pune"};
		assign95.getArrReplaceWithWordCollection(input2,str,str1);
	}
}
/*
Assignment - 95 : 3nd Aug'2024

Replace all "Maulik" with "Techno" from given Array.

input : {"Maulik", "Techno", "Credits","Hi", "Hello", "Maulik", "Pune"}
output : {"Techno", "Techno", "Credits","Hi", "Hello", "Techno", "Pune" }
 */