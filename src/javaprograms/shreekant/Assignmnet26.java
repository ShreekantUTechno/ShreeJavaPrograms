package shreekant;

public class Assignmnet26 {
	int digitCount(String name) {
		int count=0;
		for (int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	void processData() {
		int total=0;
		String value1="d1ish3a4";
		int cVowel1 =digitCount(value1);
		System.out.println(value1+ " -> "+cVowel1);
		total=total+cVowel1;
		String value2="a1nkur";
		int cVowel2 =digitCount(value2);
		System.out.println(value2+ " -> "+cVowel2);
		total=total+cVowel2;
		String value3="te1ja3s";
		int cVowel3 =digitCount(value3);
		System.out.println(value3+ " -> "+cVowel3);
		total=total+cVowel3;
		System.out.println(total);
	}
	public static void main(String[] args) {
		Assignmnet26 assign26=new Assignmnet26();
		assign26.processData();
	}
}

/*Assignment - 26 : 14th Jun '2024

Print digit count in each string, print total digit count get from all 3 strings.

input : d1ish3a4
        a1nkur
        te1ja3s	

output : d1ish3a4 -> 3
         a1nkur -> 1
         te1ja3s -> 2		 
		 total digits : 6*/
