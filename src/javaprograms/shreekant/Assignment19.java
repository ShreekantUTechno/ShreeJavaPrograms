package shreekant;
	
public class Assignment19 {
	void display(String name,char var){
		int count=0;
		for(int index =0;index<name.length();index++) {
			char ch=name.charAt(index);
			if (ch==var) {
				count++;
			}
		}
		System.out.println("output : "+ count);
	}
	public static void main(String[] args) {
		Assignment19 assign19=new Assignment19();
		assign19.display("pune india techno credits",' ');
		assign19.display("sheetal kadam",'a');
	}
}
/*Assign=19 10th Jun'2024 [12-15 mins]

Print the freqency of given character from given input.
input : "sheetal kadam" , 'a'
output : 3
 
input : "pune india techno credits", ' '
output : 3*/