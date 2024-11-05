package shreekant;

public class Assignment54 {
   
	int getCharFreq(String name,char ch){
		int count=0;
		for(int index=0; index<name.length(); index++){
			if (ch==name.charAt(index)){
				count++;
			}
		}return count;
	}

	void getCharFreq(String name){
		for(int index=0; index<name.length(); index++){
			char ch=name.charAt(index);
			if (index==name.indexOf(ch)){    
				int count =getCharFreq(name,ch);
				if (count>1){
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		String name="aakanksha";
		Assignment54 assignment54=new Assignment54();
		assignment54.getCharFreq(name);
	}
}	

	/*ssignment - 54 : 5th July'2024 [IMP]
	Print repeatative characters from given String.
	 
	input : aakanksha
	output : ak
	*/


