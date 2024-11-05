package shreekant;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Assignment93Usingcollection{

	List<String> removeDuplicateFromeArray(String[] input,String str){
		List<String> list=Arrays.asList(input);
		List<String> al=new ArrayList<String>(list);
		int count=0;
		if(al.contains(str)){
			while(al.indexOf(str)!=al.lastIndexOf(str)){
				count=al.lastIndexOf(str);
				al.remove(count);
			}	
			return al;
		}else{
			System.out.println(str +" is not present in list so Returning same ArrayList.");
			return al;
		}

	}

	public static void main(String[] args){
		String []input={"Priya", "Umesh", "Krutika","Prabhakar" ,"Disha", "Umesh", "Saurabh", "Umesh", "Vishakha"};
		String str="Umesh";
		String str2="Akshay";
		Assignment93Usingcollection assign93=new Assignment93Usingcollection();
		System.out.println("output : "+assign93.removeDuplicateFromeArray(input,str));
		System.out.println();
		System.out.println("output : "+assign93.removeDuplicateFromeArray(input,str2));	
	}
}
/*
Assignment - 93 : 2nd Aug'2024
Remove all duplicate given name from given Array, if that name is not present, print the appropiate message.

input : {"Priya", "Umesh", "Krutika","Prabhakar" ,"Disha", "Umesh", "Saurabh", "Umesh", "Vishakha"}, "Umesh"
output : ["Priya", "Umesh", "Krutika","Prabhakar", "Disha", "Saurabh", "Vishakha"]

input : {"Priya", "Umesh", "Krutika","Prabhakar" ,"Disha", "Umesh", "Saurabh", "Umesh", "Vishakha"}, "Akshay"
output : Akshay is not present at all.

 */