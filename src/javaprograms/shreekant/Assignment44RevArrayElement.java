package shreekant;

import java.util.Arrays;
class Assignment44RevArrayElement{
	
	String[] getRevEachElement(String[] arr){
        //String [] newArray=new String[arr.length];
        int index;
        for(index=0;index<arr.length;index++){
            String value1=arr[index];
            String name="";
            for(int j=value1.length()-1; j>=0; j--){
                name=name+value1.charAt(j);
                //System.out.println(name);
            }
            arr[index]=name;
        }
        return arr;
    }
   
    public static void main(String[] args) {
        String[] arr={"techno","credits","pune"};
        Assignment44RevArrayElement hello=new Assignment44RevArrayElement();
        String[] newArray=hello.getRevEachElement(arr);
        System.out.println(Arrays.toString(newArray));
    }
}
/*Assignment - 44 : 3rd july'2024 [IMP]

input : {"techno", "credits", "pune"}
output : {"onhcet", "stiderc", "enup"}
*/
