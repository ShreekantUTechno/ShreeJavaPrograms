package shreekant;

public class Assignment88Repeating{

	void getReapeatingValue(int[] arr){
		for(int index=0; index<arr.length-1; index++){
			int value=arr[index];
			int count=1;
			for(int inner=index+1; inner<arr.length; inner++){
				if(value==arr[inner]){
					count++;
					index=inner;
				}else{
					break;
				}
			}
			if(count>=2){
				System.out.println(+ arr[index]+" -> "+ count);
			}
		}
	}

	public static void main(String[] args){
		int[] arr={10,20,30,30,40,40,40,40,50};
		int[] arr1={10,20,30,30,30,30,30,30,30};
		Assignment88Repeating assign88=new Assignment88Repeating();
		System.out.println("input1 answer");
		assign88.getReapeatingValue(arr);
		System.out.println("input2 answer ");
		assign88.getReapeatingValue(arr1);
	}
}


/*
Assignment - 88 : 31st July'2024
Find the frequency of number which is repeating in sequence.
input : {10,20,30,30,40,40,40,40,50}

output : 30 -> 2
         40 -> 4

input : {10,20,30,30,30,30,30,30,30}
output : 30 -> 7

 */