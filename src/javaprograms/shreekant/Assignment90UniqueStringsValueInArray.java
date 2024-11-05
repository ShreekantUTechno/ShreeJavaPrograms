package shreekant;

import java.util.Arrays;
public class Assignment90UniqueStringsValueInArray{

	int getCount(String[] arr){
		int totalCount=0;
		for(String element: arr){
			int count=0;
			for(int index=0; index<arr.length; index++){
				if(element.equals(arr[index])){
					if(count>2){
						break;
					}
					count++;
				}
			}
			if(count==1){
				totalCount++;
			}
		}
		return totalCount;
	}

	boolean getUniqueValuesFromArr(String name,String[] arr){
		int count=0;
		for(int index=0; index<arr.length; index++){
			if(name.equals(arr[index])){
				count++;
			}
		}
		if(count>1){
			return false;
		}else{
			return true;
		}
	}

	String[] getUniqueValuesFromArray(String[] arr){
		int count=getCount(arr);
		String[] outputArr=new String[count];
		int outIndex=0;
		for(String value : arr){
			boolean flag=getUniqueValuesFromArr(value,arr);
			if(flag==true){
				outputArr[outIndex]=value;
				outIndex++;
			}	
		}
		return outputArr;
	}

	public static void main(String[] args){
		String[]input={"techno", "credits", "techno", "india", "pune", "pune"};
		Assignment90UniqueStringsValueInArray assign90=new Assignment90UniqueStringsValueInArray();
		String output[]=assign90.getUniqueValuesFromArray(input);
		System.out.println("Output : "+ Arrays.toString(output));
	}
}
/*
Assignment - 90 : 1st Aug'2024
Print the name which is uniquely present using Array.

input : {"techno", "credits", "techno", "india", "pune", "pune"}
output : [credits, india];
 */