package shreekant;

public class Assignment25 {
	
	
	int vowel(String name) {
		int vCount=0;
		for(int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if(ch=='a'|| ch=='i'|| ch=='e'|| ch=='u' ||ch=='o') {
				vCount++;
			}	
		}
		//System.out.println(vCount);
		return vCount;
	}
	
	void printDisplay() {
		int totalSum=0;
		String value1="technocredits";
		int aCount=vowel(value1);
		System.out.println(value1 +" having vowel count-> "+ aCount);
		totalSum=totalSum+aCount;
		String value2="aakanksha";
		int bCount=vowel(value2);
		System.out.println(value2 +" having vowel count -> "+ bCount);
		totalSum=totalSum+bCount;
		String value3="pune";
		int cCount=vowel(value3);
		System.out.println(value3 +" having vowel count-> "+ cCount);
		System.out.println("Total vowel count is "+ (totalSum=totalSum+cCount));
	}
	
	public static void main(String[] args) {
		Assignment25 assign25=new Assignment25() ;
		assign25.printDisplay();	
	}
}

/*Print vowel count in each string, print total vowel count get from all 3 strings.

input : technocredits.
        aakanksha.
        pune.	

output : technocredits -> 4
         aakanksha -> 4
         pune -> 2
		 total vowel count : 10 */
