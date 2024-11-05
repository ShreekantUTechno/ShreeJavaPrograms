package shreekant;

public class Assignment29 {
	String process (String name){
        String value="";
        for (int index =0;index<name.length();index++){
            char ch=name.charAt(index);
            if (!Character.isDigit(ch)){
                value =value+ch;
            }
        }
        return value;
    }
    public static void main(String[] args) {
        Assignment29 assign29=new Assignment29();
        System.out.println(assign29.process("te9ch1noc3re4dits"));
    }
}

/*Assignment - 29 : 15th Jun'2024 [15 mins]

Return a given string by excludings digits.

input : te9ch1noc3re4dits
output : technocredits 
*/
