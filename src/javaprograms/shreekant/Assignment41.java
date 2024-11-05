package shreekant;

import java.util.Arrays;
class Assignment41{
		
	int getcountOfArray(int[] value){
		int index,count=0;
		for(index=0; index<value.length; index++){
			if(value[index]<0){
				count++;
			}
		}return count;
	}
		
	int[] getarrayOfNegativeNo(int[] arr,int count){
		int[] negativeValueArray=new int[count];
		int index,newIndex=0;
		for(index=0; index<arr.length; index++){
			if(arr[index]<0){
				negativeValueArray[newIndex]=arr[index];
				newIndex++;
			}
		}		
		return negativeValueArray;
	}

	public static void main(String[] ags){
		int[] value={-10,33,44,-55,-2,-23,56,0,78};
		Assignment41 assign41=new Assignment41();
		int count=assign41.getcountOfArray(value);
		int[] onlynegativeValueArray=assign41.getarrayOfNegativeNo(value,count);
		//int index;
		/*for(index=0; index<onlynegativeValueArray.length; index++){
				System.out.println(onlynegativeValueArray[index]);
			}*/
		System.out.println(Arrays.toString(onlynegativeValueArray));
	}
}
/* Assignment - 41 : 2nd July'2024

	Return the array of only negative numbers from given array.

	input : {-10,33,44,-55,-2,-23,56,0,78}
	output : {-10,-55,-2,-23}*/	

