package shreekant;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment99FindEachNumfreq {

	void getEachNumFreq(int[]arr){
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(int num: arr) {
			if(map.containsKey(num)){
				int count=map.get(num);
				map.put(num, count+1);
			}else {
				map.put(num,1);
			}
		}System.out.println("Output : "+  map);
	}

	public static void main(String[] args) {
		int[] arr = {10,10,20,30,30,30,30,40,40,50};
		System.out.println("Input : "+Arrays.toString(arr));
		Assignment99FindEachNumfreq assgn99=new Assignment99FindEachNumfreq();
		assgn99.getEachNumFreq(arr);
	}
}
/*
Assignment - 99 : 4th Aug
Find the freq of each num from given array.
int[] arr = {10,10,20,30,30,30,30,40,40,50};
output : {10=2,20=1,30=4,40=2,50=1}
 */