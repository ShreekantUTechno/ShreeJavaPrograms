package shreekant;

import java.util.Arrays;
class Assignment64DiffArrComp{

	int getMaxLenArr(int[] arr,int[] arr1){
		int maxLen;
		if(arr.length>=arr1.length){
			maxLen=0;
		}else{
			maxLen=1;
		}return maxLen;
	}

	void  getMaxArray(int[] arr,int[] arr1){
		int maxLen=getMaxLenArr(arr,arr1);
		if(maxLen==0){
			for(int i=0; i<arr1.length; i++){
				if(arr[i]>arr1[i]){
					arr[i]=arr[i];
				} else{
					arr[i]=arr1[i];
				}
			}
			System.out.println(Arrays.toString(arr));
		}else if(maxLen==1){
			for(int j=0; j<arr.length; j++){
				if(arr1[j]>arr[j]){
					arr1[j]=arr1[j];
				} else{
					arr1[j]=arr[j];
				}
			}System.out.println(Arrays.toString(arr1));
		}
	}

	public static void main(String[] args) {
		int [] input={10,33,24,55,109};
		int [] input1={4,55,67,12,100,4,23,39};
		Assignment64DiffArrComp assign64=new Assignment64DiffArrComp();
		assign64.getMaxArray(input,input1);
	}
}/*
Assignment - 64 : 13th July'2024

return array having maximum numbers from two input array, if array length is not same, add all extra elements of bigger array at the end..

input : {10,33,24,55,109}
        {4,55,67,12,100,4,23,39}

output : [10, 55, 67, 55, 109, 4, 23, 39]

 */


