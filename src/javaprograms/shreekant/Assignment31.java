package shreekant;

public class Assignment31 {
	String process (String name){
        String upperCase="",lowerCase="",digits="";
        for (int index=0;index<name.length();index++){
            char ch=name.charAt(index);
            if (Character.isUpperCase(ch)){
                upperCase=upperCase+ch;
            }else if (Character.isLowerCase(ch)){
                lowerCase=lowerCase+ch;
            }else if (Character.isDigit(ch)){
                digits=digits+ch;
            }
        }
        return (upperCase+lowerCase+digits);
    }
    
    public static void main(String[] args) {
       Assignment31 assign31=new Assignment31();
       System.out.println(assign31.process("tEChn1oCreDIT7s3"));
    }
}

/*Assignment - 31 : 15th Jun'2024 [20 mins]

Return the formatted String where combination should be followed as uppercase + lowercase + digits.

input : "tEChn1oCreDIT7s3"
output : ECCDITthnores173*/