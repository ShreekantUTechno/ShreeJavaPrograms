package shreekant;

public class Assignment36Array{
	
	void getpositiveAndNegativeNum(int[] arr){
		int pCount=0,nCount=0;
		for (int index=0;index<arr.length;index++){
			int value=arr[index];
			if (value<0){
				nCount++;
			}else{
				pCount++;
			}
		}
		System.out.println(pCount+" positive numbers and "+ nCount+" negative numbers from given array");
	}
	
	public static void main(String[]args){
		int[] num={10,-12,4,56,77};
		Assignment36Array assign36=new Assignment36Array();
		assign36.getpositiveAndNegativeNum(num);
	}
}
/*Assignment - 36 : 30th Jun'2024 [8 mins]

print count of negative and positive numbers from given array.

int[] num = {10,-12,4,56,77};
output : 4 positive numbers and 1 negative number in given array.*/