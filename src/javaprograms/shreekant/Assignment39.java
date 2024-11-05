package shreekant;

class Assignment39{
	
	int getMaxValue(int[] values){
		int index,max=0;
		for(index=0;index<values.length;index++){
			if (values[index]>max){
				max=values[index];
			}
		}return max;
	}
	
	int getMinValue(int[] values){
		int index,min=0;
		for(index=0;index<values.length;index++){
			if(values[index]<min){
				min=values[index];
			}
		}return min;
	}
	
	public static void main (String[] args){
		int[] value={11,-33,22,44,56,23};
		Assignment39 assign39=new Assignment39();
		System.out.println(assign39.getMaxValue(value)+" is the max number from given array");
		System.out.println(assign39.getMinValue(value)+ " is the min number from given array");
	}
}
/*Assignment - 39 : 30th Jun'2024 [20 mins]

write a method to return max number from given array.
write an another method to return min number from given array.

input : {11,-33,22,44,56,23}
output :  56 is max number from given array
          -33 is the mininum num from given array.	*/
