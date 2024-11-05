package shreekant;

import java.util.Arrays;

class Assignment66IntersectionOfTwoArray {

	void getIntersectionOfArray(int[] arr,int[] arr1){
		String output="";    
		for(int index=0; index<arr.length; index++){
			for(int innerIndex=0; innerIndex<arr1.length; innerIndex++){
				if(arr[index]==arr1[innerIndex]){
					output=output+arr[index]+"-";
				}
			}
		}
		String[] newArr=output.split("-");
		int[] output1=new int[newArr.length];
		for(int i=0; i<newArr.length; i++){
			output1[i]=Integer.parseInt(newArr[i]);
		}
		System.out.println(Arrays.toString(output1));
	}

	public static void main(String[] args) {
		int[] input={10,33,24,55,109};
		int[] input1={4,109,33,12,100};
		Assignment66IntersectionOfTwoArray assignment66IntersectionOfTwoArray=new Assignment66IntersectionOfTwoArray();
		assignment66IntersectionOfTwoArray.getIntersectionOfArray(input,input1);
	}
}
/*
	Assignment - 66 : 13th July'2024
	return intersecition of 2 array.

	input : {10,33,24,55,109}
	        {4,109,33,12,100}	
	output : {33,109,0,0,0}
 */
