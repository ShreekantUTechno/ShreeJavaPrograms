package shreekant;

import java.util.Map;
import java.util.TreeMap;

public class Assignment98EachWordFreq {

	void getEachWordfreq(String str) {
		String[] arr=str.split(" ");
		Map<String,Integer> map=new TreeMap<String,Integer>();
		for(String name: arr ) {
			if(map.containsKey(name)) {
				int count=map.get(name);
				map.put(name,count+1);
			}else {
				map.put(name, 1);
			}
		}
		System.out.println("Output : "+map);
	}

	public static void main(String[] args) {
		String input= "Hi Hi Hello India Pune Pune Pune";
		System.out.println("input : " + input);
		Assignment98EachWordFreq assign98=new Assignment98EachWordFreq();
		assign98.getEachWordfreq(input);
	}
}

/*
Assignment - 98 : 4th Aug
Find the freq of each word from given String.
String input = "Hi Hi Hello India Pune Pune Pune";
output : {Hello=1, Hi=2, India=1, Pune=3}
 */

