package shreekant;

public class Assignment52 {

	int getCharFreq(String name,char ch){
		int count=0;
		for(int index=0; index<name.length(); index++){
			if (ch==name.charAt(index)){
				count++;
			}
		}
		return count;
	}

	void getCharFreq(String name){
		for(int index=0; index<name.length();index++){
			//String vowels="aeiouAEIOU";
			char ch=name.charAt(index); 
			String newString="";
			if(index==name.indexOf(ch)){
				int count=getCharFreq(name,ch);
				System.out.print(ch);               
			}
		}
	}

	public static void main(String[] args) {
		String name="aakanksha";
		Assignment52 assignment52 =new Assignment52();
		assignment52.getCharFreq(name);
	}

}/*Assignment - 52 : 5th July'2024 [IMP]
Print all characters uniquely from given string.

input : aakanksha
output : aknsh*/
