package shreekant;

import java.util.*;
class Assignment97FreqOfEachCharCollection {

	void getFreqOfEachChar(String str){
		char[] arr=str.toCharArray();
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for(char ch: arr){
			if(map.containsKey(ch)){
				int index= map.get(ch);
				map.put(ch,index+1);
			}else{
				map.put(ch,1);
			}
		}
		System.out.println("Output : "+map);
	}

	public static void main(String[] args) {
		String input="technocredits";
		Assignment97FreqOfEachCharCollection assign97=new Assignment97FreqOfEachCharCollection();
		assign97.getFreqOfEachChar(input);
	}
}
/*
Assignment - 97 : 4th Aug
Find the freq of each character in given word.

input : "technocredits";
output : {c=2, d=1, e=2, h=1, i=1, n=1, o=1, r=1, s=1, t=2}
 */