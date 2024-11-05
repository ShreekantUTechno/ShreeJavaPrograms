package shreekant;

import java.util.Arrays;

public class Assignment65 {
	
	int[] getNewUniounArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			output[i] = arr1[i];
		}
		int i = arr1.length;
		for (int index = 0; index < arr2.length; index++) {
			output[i] = arr2[index];
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 33, 24, 55, 109 };
		int[] input1 = { 4, 55, 67, 12, 100 };
		Assignment65 assignment65 = new Assignment65();
		int[] output = assignment65.getNewUniounArray(input, input1);
		System.out.println(Arrays.toString(output));
	}
}
/*
Assignment - 65 : 13th July'2024
return union of 2 array.

input : {10,33,24,55,109}
        {4,55,67,12,100}	
output : {10, 33, 24, 55, 109, 4, 55, 67, 12, 100}
 */
