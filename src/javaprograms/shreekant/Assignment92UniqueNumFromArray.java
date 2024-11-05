package shreekant;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Assignment92UniqueNumFromArray{
	
	void getUniqueNumbers(ArrayList<Integer> arrlist){
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int index=0; index<arrlist.size(); index++){
			if(index==arrlist.indexOf(arrlist.get(index))){
				output.add(arrlist.get(index));
			}
		}
		System.out.println("output : "+output);
	}
	
	public static void main(String[] args){
		Integer[] arr={10,20,93,10,30,40,50,50,20};
		List<Integer> list=Arrays.asList(arr);                           // read only cannot use modification methods.
		ArrayList<Integer> arrlist=new ArrayList<Integer>(list);        // For practice I am converting to arraylist
		Assignment92UniqueNumFromArray assign92=new Assignment92UniqueNumFromArray();
		assign92.getUniqueNumbers(arrlist);
	}
}

/*
Assignment - 92 : 2nd Aug'2024
Return the list of all the elements uniquely.

int[] num = {10,20,93,10,30,40,50,50,20}
output : {10, 20, 93, 30, 40, 50}
*/