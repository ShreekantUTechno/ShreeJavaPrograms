package shreekant;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
class  Assignment104FindMaxFreqWordUsinfCollection{
	void getMaxFreqOfword(String str){
		String[] arr=str.split(" "); 
		Map<String,Integer>map=new LinkedHashMap<String,Integer>();
		for(String key:arr){
			if(map.containsKey(key)){
				int count=map.get(key);
				map.put(key,count+1);
			}else{
				map.put(key,1);
			}
		}
		Set<String>set=map.keySet();
		int max=0;
		String maxStr="";
		for(String keyS:set){
			int count=map.get(keyS);
			if(count>max){
				max=count;
				maxStr=keyS;
			}
		}System.out.println("Maximum word freq : "+maxStr+" -> "+max);
	}

	public static void main(String[] args) {
		String input = "Hi Hi Hello India Pune Pune Pune";
		Assignment104FindMaxFreqWordUsinfCollection assign104=new Assignment104FindMaxFreqWordUsinfCollection();
		assign104.getMaxFreqOfword(input);
	}
}
/*
Assignment - 104 : 5th Aug'2024
find the word having maximum frequency, with Collections framework. 
String input = "Hi Hi Hello India Pune Pune Pune";
output : Pune -> 3
 */
