package shreekant;

import java.util.Arrays;
class Assignment43RevArray {
    
    String[] getReverseArrayOfString(String[] arr){
        String[] newArray=new String[arr.length];
        for(int index=0,j=arr.length-1; index<arr.length; index++,j--){
            newArray[j]=arr[index];
        }
        return newArray;
    }
    
    int[] getReverseArrayOfInt(int[] arr ){
       int[] newArray=new int [arr.length];
       for(int index=0, j=arr.length-1; index<arr.length; index++,j--){
           newArray[j]=arr[index];
       }
       return newArray;
    }
    
    char[] getReverseArrayOfChar(char[] arr){
        char[] newArray=new char[arr.length];
        for(int index=0,j=arr.length-1; index<arr.length; index++,j--){
			newArray[j]=arr[index];
        }
        return newArray;
    }
    
    public static void main(String[] args) {
        String [] names={"Prajakta", "Bhairavi", "Chaitanya", "Vishakha", "Pooja"};
        int[] intArray={10,33,11,9};
        char [] charArray={'t', 'o', 'c', 'k', 'l'};
        Assignment43RevArray assign43 =new Assignment43RevArray();
        String [] newArray=assign43.getReverseArrayOfString(names);
        System.out.println(Arrays.toString(newArray));
        int [] newIntArray=assign43.getReverseArrayOfInt(intArray);
        System.out.println(Arrays.toString(newIntArray));
        char[] charNewArray=assign43.getReverseArrayOfChar(charArray);
        System.out.println(Arrays.toString(charNewArray));
    }
}
/*ssignment - 43 : 3 July'2024

Program 1 : Reverse index order from given Array, write a method to accept an array and return new array by reversing index order.

input : {"Prajakta", "Bhairavi", "Chaitanya", "Vishakha", "Pooja"}
output : {"Pooja", "Vishakha", "Chaitanya", "Bhairavi", "Prajakta"}

Program 2 : Same program as program 1 but on character.

input : {'t', 'o', 'c', 'k', 'l'}
output : {'l', 'k', 'c','o','t'}

Program 3 : 

input : {10,33,11,9}
output : {9,11,33,10}

----------------------------------*/
