package shreekant;

public class Assignment30 {
	 String process (String name){
	        String total="";
	        for (int index =name.length()-1;index>=0;index-- ){
	            char ch=name.charAt(index);
	            if (!Character.isDigit(ch)){
	                total=total+ch;
	            }
	        }
	        return total;
	    }
	    
	    public static void main(String[] args) {
	       Assignment30 assign30=new Assignment30();
	       System.out.println(assign30.process("1tec2hn3o"));
	    }
}

/*Assignment - 30 : 15th Jun'2024 [25 mins]

Return a reverse string by excludings digits.

input : 1tec2hn3o
output : onhcet*/
