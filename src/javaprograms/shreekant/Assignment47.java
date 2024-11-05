package shreekant;

import java.util.Arrays;

public class Assignment47 {

	int getDigitValue(String value){
		String newString="";
		for(int index=0; index<value.length(); index++){
			char ch=value.charAt(index);
			if(Character.isDigit(ch)){
				newString=newString+ch;
			}
		}
		return (Integer.parseInt(newString));
	}
	
	int[] getDigitNo(String[] arr){
		int[] newArr=new int[arr.length];
		for (int index =0; index<arr.length; index++){
			String element=arr[index];
			int numbers=getDigitValue(element);
			//System.out.println(numbers);
			newArr[index]=numbers;
		}
		return newArr;
	}
	
	public static void main(String[] args){
		String [] input={"te1ch3no", "cr5edit7s7", "6pun6eee2"};
		Assignment47 assign47=new Assignment47();
		System.out.println(Arrays.toString(assign47.getDigitNo(input)));
	}
}
