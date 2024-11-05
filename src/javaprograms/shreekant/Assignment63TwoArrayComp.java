package shreekant;

import java.util.Arrays;  

public class Assignment63TwoArrayComp {
 
    void getMaxArray(int[] input,int[] input1){
        int[] arr=new int[input.length];
        for(int index=0;index<input.length; index++){
            if (input[index]>input1[index]) {
                arr[index]=input[index];
            }else{
                arr[index]=input1[index];
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int[] input={10,33,24,55,109};
        int[] input1={4,55,67,12,100};  
        Assignment63TwoArrayComp assignment63TwoArrayComp=new Assignment63TwoArrayComp();
        assignment63TwoArrayComp.getMaxArray(input,input1);
    }
}/*
Assignment - 63 : 13th July'2024

return array having maximum numbers from two input array.

input : {10,33,24,55,109}
        {4,55,67,12,100}
		
output : [10, 55, 67, 55, 109]
*/
