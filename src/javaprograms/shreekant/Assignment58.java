package shreekant;

public class Assignment58 {

	void getVowelFrq(String input){
		int index=0;
		while(input.length()!=0){
			char ch=input.charAt(index);
			int total=input.length();
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
				input=input.replace(String.valueOf(ch),"");
				int count=total-input.length();
				System.out.println(ch +" -> "+count);
			}
			else{
				input=input.replace(String.valueOf(ch),"");
			}
		}
	}

	public static void main(String[] args) {
		String input="technocredits";
		Assignment58 hello=new Assignment58();
		hello.getVowelFrq(input);
	}
}

	/*Assignment - 58 : 5th July'2024 [IMP]
	 Print frequency of each vowel character in a given string.
	 
	 input : technocredits
	 output : e -> 2
	          o -> 1
	          i -> 1 	
	NOte : Use while loop*/


