package shreekant;
import java.util.*;
public class Assignment94UnionArrayWDuplicate{

	void getUnionOfArray(Integer[] arr1,Integer[] arr2){
		List<Integer> list1=Arrays.asList(arr1);
		List<Integer> list2=Arrays.asList(arr2);

		ArrayList<Integer> al1=new ArrayList<Integer>(list1);
		ArrayList<Integer> al2=new ArrayList<Integer>(list2);

		al1.addAll(al2);
		Set<Integer>set=new LinkedHashSet<Integer>(al1);
		System.out.println("Output : "+set);
	}
	
	public static void main(String[] args){
		Integer[] arr1 = {10,13,15,10,15,17,19,17};
		Integer[] arr2 = {55,23,55,10,15,19};
		Assignment94UnionArrayWDuplicate assign94=new Assignment94UnionArrayWDuplicate();
		assign94.getUnionOfArray(arr1,arr2);
	}
}

/*

Assignment - 94 : 2nd Aug'2024

Union of 2 arrays having all the numbers present uniquely.

int[] arr1 = {10,13,15,10,15,17,19,17};
int[] arr2 = {55,23,55,10,15,19};

output : [10, 13, 15, 17, 19, 55, 23]

 */