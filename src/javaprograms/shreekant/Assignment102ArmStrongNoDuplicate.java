package shreekant;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment102ArmStrongNoDuplicate {

	boolean getArmStrongOrNot(int num){
		int digit=0,sum=0,original=num;
		while(num!=0) {
			digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}if(original==sum) {
			return true;
		}
		return false;
	}

	void getPrimeNumWhichIsDuplicate(Integer[]arr){
		Set<Integer>set=new LinkedHashSet<Integer>();
		for(int num:arr) {
			boolean flag=getArmStrongOrNot(num);
			if(flag){
				boolean value=set.add(num);
				if(!value) {
					System.out.println(" -> "+num+" is duplicate Armstrong number.");
				}
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = {10,20,40,153,11,10,153,370,371,371,11,55,66,66};
		System.out.println("Input : "+ Arrays.toString(arr));
		Assignment102ArmStrongNoDuplicate assign102=new Assignment102ArmStrongNoDuplicate();
		assign102.getPrimeNumWhichIsDuplicate(arr);
	}
}
/*
Assignment - 102 : 4th August 2024

Print the duplicate Armstrong values from array using HashSet. 

Integer[] arr = {10,20,40,153,11,10,153,370,371,371,11,55,66,66}
output : 153 is duplicate Armstrong number 
         371 is duplicate Armstrong number
 */