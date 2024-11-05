package shreekant;

import java.util.Arrays;
class Assignment42{
	
	int getcountOfNumbersDiv(int[] arr){
		int count=0,index;
		for(index =0; index<arr.length;index++){
			if (arr[index]!=0 && arr[index]%3==0 && arr[index]%5==0) {
				count++;
			}
		}
		return count ;
	}
	
	int[] getArrayOfNumberDiv(int[] arr,int count){
		int[] newArray=new int[count];
		int newIndex=0;
		for(int index=0; index<arr.length;index++){
			 if(arr[index]!=0 && arr[index]%3==0 && arr[index]%5==0){
				newArray[newIndex]=arr[index];
				newIndex++;
			}
		}return newArray;
	}
	
	public static void main (String[] args){
		int[] value={10,33,30,44,60,2,23,56,0,78};
		Assignment42 assign42=new Assignment42();
		int count =assign42.getcountOfNumbersDiv(value);
		int[] DivisibleNumber=assign42.getArrayOfNumberDiv(value,count);
		System.out.println(Arrays.toString(DivisibleNumber));
		//for(int index=0; index<DivisibleNumber.length;index++){
		//	System.out.println(DivisibleNumber[index]);
		//}
	}
}
/*Assignment - 42 : 2nd July'2024

Return the array of only numbers which is div by 3 and 5.

input : {10,33,30,44,60,2,23,56,0,78}
output : {30,60}

NOTE : to print array you can use System.out.println(Arrays.toString(outputArr));*/
