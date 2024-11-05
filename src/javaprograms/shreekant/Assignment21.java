package shreekant;

public class Assignment21 {
	void display(String name) {
		int aCount=0,iCount=0,eCount=0,oCount=0,uCount=0;
		for (int index =0;index<name.length();index++) {
			char ch=name.charAt(index);
			if(ch=='a') {
				aCount++;
			}else if(ch=='i') {
				iCount++;
			}else if(ch=='e') {
				eCount++;
			}else if(ch=='o') {
				oCount++;
			}else if(ch=='u') {
				uCount++;
			}
		}
		System.out.println(" Freq of char a is "+ aCount);
		System.out.println(" Freq of char i is "+ iCount);
		System.out.println(" Freq of char e is "+ eCount);
		System.out.println(" Freq of char o is "+ oCount);
		System.out.println(" Freq of char u is "+ uCount);
	}
	
	public static void main(String[] args) {
		Assignment21 assign21 =new Assignment21();
		assign21.display("aakansha dharmadhikari");
		//System.out.println(" ");
		//assign21.display("shreekant umagol");
	}
}
/*Assignment - 21 : 10th Jun'2024 [20 mins]

Print the frequency of each vowel character from given input.

input : "aakansha dharmadhikari"
output : Freq of char a is 7
         Freq of char e is 0
         Freq of char i is 2
         Freq of char o is 0
		 Freq of char u is 0  	*/
