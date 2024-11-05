package shreekant;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
public class Assignment105FindNthMaxNumFromArr {

	void findNthMaxNumFreq(Integer[] arr,int nth){
		Set<Integer>set=new TreeSet<>(Arrays.asList(arr));
		if(set.size()>nth) {
			int length=set.size();
			int count=0;
			for(Integer value:set) {
				if(count==length-nth) {
					System.out.println(value + " is the "+ nth + " maximum value from the array.");
				}
				count++;
			}
		}else{
			System.out.println("Your array does not have element more than your input");
		}
	}

	void getNthMaxFreqOfNum(Integer [] arr){
		int max=0;
		int secondMax=0;
		for(int index=0; index<arr.length;index++) {
			if(arr[index]>max) {
				secondMax=max;
				max=arr[index];
			}else if(arr[index]>secondMax && arr[index]<max){
				secondMax=arr[index];
			}
		}
		//System.out.println("Maximum number : "+max);
		System.out.println("Second Max number : "+secondMax);
	}

	public static void main(String[] args) {
		Integer[] arr = {55,23,78,99,12,100,77,100};
		System.out.println("Input : "+Arrays.toString(arr));
		Assignment105FindNthMaxNumFromArr assign105=new Assignment105FindNthMaxNumFromArr();
		assign105.findNthMaxNumFreq(arr,3);
		assign105.findNthMaxNumFreq(arr,2);
		System.out.println("******Output without Collection*******");
		assign105.getNthMaxFreqOfNum(arr); 
	}
}
/*
	Assignment - 105 : 6th Aug'2024 [imp]
	find the 3rd max number from given array.
	int[] arr = {55,23,78,99,12,100,77,100};
	output : 78
 */


