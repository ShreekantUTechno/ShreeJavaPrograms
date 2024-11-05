package shreekant;

public class Assignment27 {
	int specialChar(String name) {
		int count=0;
		for(int index=0;index<name.length();index++) {
			char ch =name.charAt(index);
			if (!Character.isDigit(ch) && !Character.isLetter(ch)&& ch !=' ') {
				count++;
			}
		}
		return count;
	}
	
	void processData() {
		int Total=0;
		String value1="d1i_sh3a4";
		int spec1=specialChar(value1);
		System.out.println(value1 +"-> "+ spec1);
		Total=Total+spec1;
		String value2="a1n_ku!r";
		int spec2=specialChar(value2);
		System.out.println(value2 +"-> "+ spec2);
		Total=Total+spec2;
		String value3="te,1j_a_3_s";
		int spec3=specialChar(value3);
		System.out.println(value3 +"-> "+ spec3);
		System.out.println(Total=Total+spec3);
	}
	
	public static void main(String[] args) {
		Assignment27 assign27=new Assignment27();
		assign27.processData();
	}

}/*Print special character count in each string, print total special character count get from all 3 strings.

input : d1i_sh3a4
        a1n_ku!r
        te,1j_a_3_s	

output : d1i_sh3a4 -> 1
         a1n_ku!r -> 2
         te,1j_a_3_s -> 4		 
		 total special character count : 7*/
