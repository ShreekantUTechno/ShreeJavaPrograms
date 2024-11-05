package shreekant;

public class Assignment59whileLoop {
	
	void getCharFreq(String name){
		String newString="";
		while(name.length()!=0){
			char ch=name.charAt(0);
			int total=name.length();
			name=name.replace(String.valueOf(ch),"");
			newString=newString+ch;
		}System.out.println(newString);
	}

	public static void main(String[] args) {
		String input="aakanksha";
		Assignment59whileLoop assignment59whileLoop=new Assignment59whileLoop();
		assignment59whileLoop.getCharFreq(input);
	}
}

	/*Assignment - 59 : 5th July'2024 [IMP]
	Print all characters uniquely from given string.
	 
	 input : aakanksha
	 output : aknsh

	NOte : Use while loop*/

