package shreekant;

import java.util.Arrays;
import java.util.ArrayList;
public class Assignment96ReplaceWordExceptFirst {
	//ByUsing array
	void getArrayReplacedWithWord(String[]input,String str,String str1){
		int count=0;
		for(int i=0; i<input.length; i++){
			if(str.equals(input[i])){
				count++;
				if(count!=1){
					input[i]=str1;
				}
			}
		} 
		System.out.println("Output By using Array: "+Arrays.toString(input));
	}
	//by using collection
	void getArrayReplacedWithWordCollection(String[]input,String str,String str1){
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(input));
		if (al.contains(str)){
			while(al.indexOf(str)!=al.lastIndexOf(str)){
				int index=al.lastIndexOf(str);
				al.set(index,str1);
			}    
		}else{
			System.out.println(str +" is  not present in list so Printing same list."); 
		}
		System.out.println("Output by using collection : "+al);
	}

	public static void main(String[] args) {
		String[] input={"Maulik", "Techno", "Credits","Hi", "Hello", "Maulik", "Pune"};
		String str="Maulik";
		String replace="Techno";
		Assignment96ReplaceWordExceptFirst assign96=new Assignment96ReplaceWordExceptFirst();
		//By using Array 
		assign96.getArrayReplacedWithWord(input,str,replace);

		String[] input2={"Maulik", "Techno", "Credits","Hi", "Hello", "Maulik", "Pune"};
		//By using Collection
		assign96.getArrayReplacedWithWordCollection(input2,str,replace);
	}
}
/*
Assignment - 96 : 3nd Aug'2024

Replace all "Maulik" except first occurance with "Techno" from given Array.

input : {"Maulik", "Techno", "Maulik","Hi", "Hello", "Maulik", "Pune"}
output : {"Maulik", "Techno", "Techno","Hi", "Hello", "Techno", "Pune" }
 */