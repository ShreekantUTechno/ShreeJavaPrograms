package shreekant;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment101DuplicateValuesFromArr {

	void getDuplicateNumfromArr(Integer[] arr){
		Set<Integer>set=new LinkedHashSet<>();
		for(Integer num:arr) {
			boolean flag=set.add(num);
			if(!flag){
				System.out.println(" -> "+num +" is a duplicate value.");
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,20,40,11,10,11,55,66,66};
		System.out.println("input : "+Arrays.toString(arr));
		Assignment101DuplicateValuesFromArr assign101=new Assignment101DuplicateValuesFromArr();
		assign101.getDuplicateNumfromArr(arr);
	}
}
/*
 Assignment - 101 : 4th Aug'2024

Print the duplicate values from array using HashSet. 

Integer[] arr = {10,20,40,11,10,11,55,66,66}
output : 10 is duplicate 
         11 is duplicate
         66 is duplicate

Hint : use return type of add method.  	
*/
