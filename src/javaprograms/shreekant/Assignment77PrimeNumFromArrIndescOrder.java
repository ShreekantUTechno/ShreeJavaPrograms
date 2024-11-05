package shreekant;

import java.util.Arrays;
public class Assignment77PrimeNumFromArrIndescOrder{

	boolean getPrimeOrNot(int num){
		boolean flag=true;
		for(int index=2; index<num; index++){
			if(num%index==0){
				flag=false;
				break;
			}
		}return flag;
	}

	boolean getUniqueNum(int[] arr,int num){
		boolean flag=true;
		for(int index=0; index<arr.length; index++){
			if(num==arr[index]){
				flag=false;
			}
		}return flag;
	}

	void getArrayPrimeNum(int[] arr){
		int[] output=new int[arr.length];
		int count=0;
		for(int index=0;index<arr.length; index++){
			boolean flag=getPrimeOrNot(arr[index]);
			if (flag){
				boolean flag1=getUniqueNum(output,arr[index]);
				if(flag1){
					output[count]=arr[index];
					count++;
				}
			}
		}
		output=Arrays.copyOf(output,count);
		Arrays.sort(output);
		for(int index=output.length-1; index>=0; index--){
			System.out.println(output[index]);
		}
	}

	public static void main(String [] args){
		int input[]={ 10, 13, 55, 44, 17, 11, 18 , 11, 55};
		Assignment77PrimeNumFromArrIndescOrder assign77=new Assignment77PrimeNumFromArrIndescOrder();
		assign77.getArrayPrimeNum(input);
	}
}
/* Assignment - 77 : 28th July'2024
print all unique prime number from given array in desc order.
input : { 10, 13, 55, 44, 17, 11, 18 , 11, 55};

output : 
       17
	   13
	   11
 */