package shreekant;

import java.util.ArrayList;
public class Assignment89PrimeNoFromArrayList{

	boolean getNoPrimeOrNot(int num){
		boolean flag=true;
		for(int index=2; index<num; index++){
			if(num%index==0){
				flag=false;
				break;
			}
		}
		return flag;
	}

	void getPrimeNumbersfromArrayList(int[] arr){
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for(int element: arr){
			boolean flag=getNoPrimeOrNot(element);
			if(flag){
				arrayList.add(element);
			}
		}
		System.out.println("output : "+ arrayList);
	}

	public static void main(String [] args){
		int arr[]={13,17,66,55,44,23};
		Assignment89PrimeNoFromArrayList assign89=new Assignment89PrimeNoFromArrayList();
		assign89.getPrimeNumbersfromArrayList(arr);
	}
}

/*
Assignment - 89 : 31st July'2024

Return the ArrayList of all the prime numbers from given ArrayList.

input : [13,17,66,55,44,23]
output : [13, 17, 23]
 */