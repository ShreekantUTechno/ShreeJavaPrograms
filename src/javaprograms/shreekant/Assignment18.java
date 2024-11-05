package shreekant;

public class Assignment18 {
	void display(String name) {
		for(int index=name.length()-1;index>=0;index--) {
			char ch=name.charAt(index);
			System.out.print(ch);
		}
	}
	
	public static void main (String[] args) {
		Assignment18 assign18=new Assignment18();
		assign18.display("techno");
	}
}/*Assignment - 18 : 10th Jun'2024 [8-10 mins]

Print the input in reverse order.

input : techno
output : onhcet 
*/
