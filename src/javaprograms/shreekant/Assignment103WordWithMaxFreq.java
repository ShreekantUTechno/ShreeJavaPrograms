package shreekant;

public class Assignment103WordWithMaxFreq {

	int getCountOfWord(String value,String[] arr) {
		int count=0;
		for(int index=0;index<arr.length;index++) {
			if(value.equals(arr[index])) {
				count++;
			}
		}return count;
	}

	void getWordWithMaxFreq(String str){
		String[]arr=str.split(" ");
		int maxFreq=0;
		String output="";
		for(String name:arr) {
			int count=getCountOfWord(name,arr);
			if(count>maxFreq) {
				maxFreq=count;
				output=name;
			}
		}
		System.out.println("output : "+output+" -> "+ maxFreq);
	}

	public static void main(String[] args) {
		String input = "Hi Hi Hello India Pune Pune Pune";
		System.out.println("Input : "+input);
		Assignment103WordWithMaxFreq assign103=new Assignment103WordWithMaxFreq();
		assign103.getWordWithMaxFreq(input);
	}
}
/*
 Assignment - 103 : 5th Aug'2024

find the word having maximum frequency, without Collections framework. 
String input = "Hi Hi Hello India Pune Pune Pune";
output : Pune -> 3 

 */


