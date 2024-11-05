package shreekant;

public class Assignment17 {
	void display(String name) {
		for(int index=0;index <name.length();index++) {
			char ch=name.charAt(index);
			System.out.println(ch);
		}
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17=new Assignment17();
		assignment17.display("techno");
	}
}
/*Assignment - 17 : 10th Jun'2024 [8-10 mins]
print each character in new line from given input.

input : techno
output : t
         e
         c
         h
         n
         o	*/