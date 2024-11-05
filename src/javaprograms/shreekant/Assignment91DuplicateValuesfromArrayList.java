package shreekant;

import java.util.Arrays;
import java.util.*;
public class Assignment91DuplicateValuesfromArrayList{

	void getDuplecatesFromArrayList(ArrayList<String> arrlist){
		ArrayList<String> output=new ArrayList<String>();
		for(int index=0; index<arrlist.size(); index++){
			if(index==arrlist.indexOf(arrlist.get(index))){
				if(arrlist.indexOf(arrlist.get(index))!=arrlist.lastIndexOf(arrlist.get(index))){
					output.add(arrlist.get(index));
				}
			}
		}	
		System.out.println("output :"+output);
	}

	public static void main(String[] args){
		String[]input={"techno", "credits", "techno", "india", "pune", "pune"};
		System.out.println("Input : "+Arrays.toString(input));
		List<String> list=Arrays.asList(input);
		ArrayList<String> al=new ArrayList<String>(list);
		Assignment91DuplicateValuesfromArrayList assign91=new Assignment91DuplicateValuesfromArrayList();
		assign91.getDuplecatesFromArrayList(al);
	}	
}

/*Assignment - 91 : 1st Aug'2024
Print the name which is uniquely present using ArrayList.

input : {"techno", "credits", "techno", "india", "pune", "pune"}
output : [credits, india]

 */