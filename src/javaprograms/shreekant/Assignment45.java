package shreekant;

import java.util.Arrays;
public class Assignment45{
	
	String getRevString(String name){
		String revString="";
		for(int index=name.length()-1;index>=0;index--){
			char ch=name.charAt(index);
			revString=revString+ch;
		}//System.out.println(revString);
		return revString;
	}
	
	String[] getRevArray(String [] arr){
		String[] newArray=new String[arr.length];
		for(int index=0,j=arr.length-1;index<arr.length;index++,j--){
			String newString=getRevString(arr[index]);
			newArray[j]=newString;
		}
		return newArray;
	}
	
	public static void main(String[] args){
		String[] input={"techno", "credits", "pune"};
		Assignment45 assign45=new Assignment45();
		System.out.println(Arrays.toString(assign45.getRevArray(input)));
	}
}

/*Assignment - 45 : 3rd july'2024 [VIMP]

input : {"techno", "credits", "pune"}
output : {"enup", "stiderc", "onhcet"}

main -> getProcessArr -> getRevString


----------------------------------------------------*/
