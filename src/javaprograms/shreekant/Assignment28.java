package shreekant;

public class Assignment28 {
	boolean isDigit(String name) {
		for (int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if( Character.isDigit(ch)){
				return true;
			}
		}
		return false;
	}
	
	void print (boolean status,String values) {
		if (status == false) {
			System.out.println(values +" doesnt contain any Digit.");
		}
	}
	
	void processData() {
		String value1="Tirth";
		boolean status1=isDigit(value1);
		String value2="Anvit";
		boolean status2=isDigit(value2);
		String value3="Mau3lik";
		boolean status3=isDigit(value3);	
		print(status1,value1);
		print(status2,value2);
		print(status3,value3);
	}
	
	public static void main(String[] args) {
		Assignment28 assign28=new Assignment28();
		assign28.processData();

	}
}/*Assignment - 28 : 14th Jun'2024
Print the string if no digit found in that string.

input : Tirth
        Anvit
		Mau3lik

output : Tirth doesnt contain any digit
         Anvit doesnt contain any digit*/
