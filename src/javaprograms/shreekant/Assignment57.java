package shreekant;

public class Assignment57 {
	
	void getCharFreq(String name){
		while(name.length()!=0){
			char ch=name.charAt(0);
			int total= name.length();
			//System.out.println(total);
			name=name.replace(String.valueOf(ch),"");
			//System.out.println(name.length());
			int count=total-name.length();
			System.out.println(ch+" -> "+count);
		}
	}

	public static void main(String[] args) {
		String name="aakanksha";
		Assignment57 assignment57= new Assignment57();
		assignment57.getCharFreq(name);
	}
}
	/* Assignment - 57 : 5th July'2024 [IMP]
	 Print frequency of each character in a given string.
	 
	 input : aakanksha
	 output : a -> 4
	          k -> 2
	          n -> 1
	          s -> 1
	          h -> 1
	 
	 NOte : Use while loop*?
	 
	 */

