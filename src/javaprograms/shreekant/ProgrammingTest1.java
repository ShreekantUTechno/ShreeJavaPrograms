package shreekant;

public class ProgrammingTest1 {
	
		int getAgeDiff(int[] value){
			int max=0,min=value[0]; // 
			int index;
			for(index=0;index<value.length;index++){
				if(value[index]> max){
					max=value[index];
				}
				if(value[index]<min){
					min=value[index];
				}
			}
			return (max-min);
		}
		
		public static void main(String[] args){
			int[] age={10,3,35,30,65,60};
			ProgrammingTest1 test1=new ProgrammingTest1();
			System.out.println(test1.getAgeDiff(age));
		}	
}/* programming Test 1. find the difference between youngest and oldest member of the family. 

Consider age of the family member is presented as int array.

input : {10,3,35,30,65,60}
output : 62

hint : 65-3 = 62*/
