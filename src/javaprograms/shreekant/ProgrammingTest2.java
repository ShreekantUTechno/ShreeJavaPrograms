package shreekant;

class ProgrammingTest2{

	int getFirstNegativeValue(int[] name){
		for(int index=0; index<name.length;index++){
			if(name[index]<0){
				return name[index];
			}			
		}return 0;		
	}

	void getNegativeNo1(int[] name){
		int max=getFirstNegativeValue(name);

		if (max<0){
			for(int index=0; index<name.length;index++){
				if(name[index]<0){
					if(name[index]>max){
						max=name[index];
					}				
				}
			}System.out.println(max);
		}else{
			System.out.println("Dont have any negative numbers in array");	
		}		
	}

	public static void main(String[] args){
		//int[] value= {-44,-35,-99,22,55};
		int[] value= {44,-35,99,22,55};
		ProgrammingTest2 test2=new ProgrammingTest2();
		test2.getNegativeNo1(value);
	}
}
/*2. find the biggest negative number from given array. 

input : {-44,-35,-99,22,55}
output : -35*/
