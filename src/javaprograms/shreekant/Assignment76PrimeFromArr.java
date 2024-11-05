package shreekant;

import java.util.Arrays;
public class Assignment76PrimeFromArr{

	boolean getNumPrimeOrNot(int num){
		boolean flag=true;
		for(int index=2; index<num; index++){
			if(num%index==0){
				flag=false;
				break;
			}
		}
		return flag;
	}

	boolean getUniuePrimeNum(int[]output, int num){
		boolean flag =false;
		for(int index=0; index<output.length; index++){
			if(num==output[index]){
				flag=true;
			}				
		}return flag;
	}	

	void getPrimeNum(int[] arr){
		int[] output=new int[arr.length];
		int range=0;
		for(int index=0; index<arr.length; index++){
			boolean flag=getNumPrimeOrNot(arr[index]);
			if(flag){
				boolean flag1=getUniuePrimeNum(output,arr[index]);
				if(!flag1){
					output[range]=arr[index];
					range++;
				}
			}
		}
		output=Arrays.copyOf(output,range);
		Arrays.sort(output);
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args){
		int[] arr={10, 13, 55, 44, 17, 11, 18 , 11, 55};
		Assignment76PrimeFromArr assign76=new Assignment76PrimeFromArr();
		assign76.getPrimeNum(arr);
	}
}

/*
Assignment - 76 : 28th July'2024

print all prime number from given array in ascending order.
input : { 10, 13, 55, 44, 17, 11, 18 , 11, 55};
output : 11
         13
         17 	
 */