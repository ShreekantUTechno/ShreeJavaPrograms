package shreekant;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment100 {

	boolean getDigitPresentOrNot(String str) {
		for(int index=0;index<str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) {
				return true;
			}
		}return false;
	}

	void getFreqOfEachWordWithDigit(String str){
		String[] arr=str.split(" ");
		Map<String ,Integer> map =new LinkedHashMap<>();
		for(String value:arr) {
			boolean flag=getDigitPresentOrNot(value);
			if(flag) {
				if(map.containsKey(value)) {
					int count=map.get(value);
					map.put(value, count+1);
				}else {
					map.put(value,1);
				}
			}
		}
		System.out.println("Output : "+map);
	}

	public static void main(String[] args) {
		String input = "H1i H1i Hello Ind3ia Pune Pune Pune";
		System.out.println("Find the freq of each word having atleast one digit.");
		System.out.println();
		System.out.println("Input : "+input);
		Assignment100 assign100=new Assignment100();
		assign100.getFreqOfEachWordWithDigit(input);

	}
}
/*
 Assignment - 100 : 4th Aug
Find the freq of each word having atleast one digit.

String input = "H1i H1i Hello Ind3ia Pune Pune Pune";
output : H1i -> 2
         Ind3ia -> 1
 */

