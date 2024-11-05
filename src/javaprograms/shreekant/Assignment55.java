package shreekant;

public class Assignment55 {

	int getCharFreq(String name,char ch){
		int count=0;
		for(int index=0; index<name.length(); index++){
			if (ch==name.charAt(index)){
				count++;
			}
		}return count;
	}

	void getCharFreq(String name){
		for(int index=name.length()-1; index>=0; index--){
			char ch=name.charAt(index);
			if (index==name.indexOf(ch)){    
				int count =getCharFreq(name,ch);
				if(count>1){
					System.out.print(ch);
				}
			}
		}
	}

	public static void main(String[] args) {
		String name="aakanksha";
		Assignment55 assignment55=new Assignment55();
		assignment55.getCharFreq(name);
	}
}

	/*Assignment - 55 : 5th July'2024 [IMP]
	Print repeatative characters from given String in reverse order.
	 
	input : aakanksh
	output : ka
	*/
