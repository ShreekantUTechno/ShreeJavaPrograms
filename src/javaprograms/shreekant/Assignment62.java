package shreekant;

class Assignment62 {
	
	int getCharFreq(String input,char ch){
		int count=0;
		for(int index=0; index<input.length(); index++){
			if(ch==input.charAt(index)){
				count++;
			}
		}
		return count;
	}

	void getVowelOfMaxFreq(String input){
		String loweredString=input.toLowerCase();
		int maxCount=0;
		char maxChar =' ';
		for(int index=0; index<loweredString.length(); index++){
			String vowel = "aeiuo";
			char ch=loweredString.charAt(index);
			if(vowel.contains(String.valueOf(ch))){
				if(index==loweredString.indexOf(ch)){
					//System.out.println(maxChar); 
					int count=getCharFreq(loweredString,ch);
					if(maxCount<count){
						maxCount=count;
						maxChar=ch;
					}
				}
			}
		}System.out.println(input +" : " +maxChar+" -> "+maxCount);		
	} 

	public static void main(String[] args) {
		String input="Deharmadhikari";
		String input1="Entertainment";
		String input2="Persistent";
		Assignment62 assignment62=new Assignment62();
		assignment62.getVowelOfMaxFreq(input);
		assignment62.getVowelOfMaxFreq(input1);
		assignment62.getVowelOfMaxFreq(input2);
	}
}/*
Assignment - 62 : 11th July'2024

Find the vowel having max frequency.

input : Deharmadhikari : a -> 3
Entertainment : e -> 3
Persistent : e -> 2
*/

