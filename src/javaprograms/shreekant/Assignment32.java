package shreekant;

public class Assignment32 {
	void getHishestValue(String name) {
		int dCount=0,uCount=0,lCount=0;
		for (int index=0;index<name.length();index++) {
			char ch=name.charAt(index);
			if (Character.isDigit(ch)) {
				dCount++;
			}else if (Character.isUpperCase(ch)){
				uCount++;
			}else if (Character.isLowerCase(ch)){
				lCount++;
			}
		}
		if (dCount>uCount && dCount>lCount) {
			System.out.println("techno");
		}else if (uCount>dCount && uCount >lCount) {
			System.out.println("credits");
		}else if (lCount>uCount && lCount>dCount){
			System.out.println("Pune");
		}else if (lCount==uCount && dCount==uCount) {
			System.out.println("india");
		}
	}
	
	void process (String value1,String value2,String value3,String value4) {
		getHishestValue(value1);
		getHishestValue(value2);
		getHishestValue(value3);
		getHishestValue(value4);
	}
	
	public static void main (String[] args) {
		Assignment32 assign32=new Assignment32();
		assign32.process("Sh1iv2aYogi2323232145","MAUliK12","M1AU2li3k","technocreDits");
	}
}


/*Return "techno" if given Stirng contains more digits,
if uppercases are more return "credits", 
return "pune" if lowercases are more, 
return "india" if its a balance string.

input : Sh1iv2aYogi2323232145
output : techno

input : MAUliK12
output : credits

input : M1AU2li3k
output : india

input : technocreDits
output : pune*/