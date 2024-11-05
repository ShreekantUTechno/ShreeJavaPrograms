package shreekant;

public class Assignment20 {
	void display(String name) {
		int count=0;
		for(int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if(ch=='a' || ch=='e'||ch=='i' || ch=='o'||ch=='u'||ch=='A' || ch=='E'||ch=='I' || ch=='O'||ch=='U') {
				count++;
			}
;		}
		System.out.println("Output : "+count);
	}
	
	public static void main(String[] args) {
		Assignment20 assign20=new Assignment20();
		assign20.display("sheetal kadam");
		assign20.display("aakansha dharmadhikari");
	}
}
/*Assignment - 20 : 10th Jun'2024 [15 mins]

Print the freqency of vowel characters from given input.

input : "sheetal kadam"
output : 5

input : "aakansha dharmadhikari"
output : 9*/
