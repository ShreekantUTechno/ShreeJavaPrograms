package shreekant;

public class Assignment60 {
  
	void getNonRepCharFreq(String name){
		while(name.length()!=0){
			char ch=name.charAt(0); 
			int total=name.length();
			name=name.replace(String.valueOf(ch),"");
			int count=total-name.length();
			if (count==1){
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		String input="aakanksha";
		Assignment60 assignment60=new Assignment60();
		assignment60.getNonRepCharFreq(input);
	}
}
/*Assignment - 60 : 5th July'2024 [IMP]
	Print non repeatative characters from given String.

	input : aakanksha
	output : nsh
	NOte : Use while loop

 */


