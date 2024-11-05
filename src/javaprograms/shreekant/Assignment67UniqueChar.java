package shreekant;

public class Assignment67UniqueChar{

	void getUniqueChar1(String str){
		while(str.length()!=0){
			char ch=str.charAt(0);
			int total=str.length();
			str=str.replace(String.valueOf(ch),"");
			int count=total-str.length();
			if(count==1){
				System.out.print(ch);
			}	
		}
	}

	void getUniqueChar(String str){
		for(int index=0; index<str.length(); index++){
			char ch=str.charAt(index);
			if(index==str.indexOf(ch)){
				int count=0;
				for(int inner=0; inner<str.length(); inner++){
					if(ch==str.charAt(inner)){
						count++;
					}
				}
				if (count==1){
					System.out.print(ch);
				}	
			}
		}
	}

	void getUniqueChar2(String str){
		for(int index=0; index<str.length(); index++){
			char ch=str.charAt(index);
			if (str.indexOf(ch)==str.lastIndexOf(ch)){
				System.out.print(ch);
			}
		}
	}	

	public static void main(String[] args){
		Assignment67UniqueChar assignment67UniqueChar=new Assignment67UniqueChar();
		assignment67UniqueChar.getUniqueChar("aakanksha");//method 1 to find unique char
		System.out.println("");
		assignment67UniqueChar.getUniqueChar1("aakanksha");//method 2 to find unique char
		System.out.println("");
		assignment67UniqueChar.getUniqueChar2("aakanksha");// method 3 to find unique char
	}
}

/*
Assignment - 67 : 15th July'2024 [IMP]

return uniquely present characters from given string.

input : aakanksha
output : nsh
 */
