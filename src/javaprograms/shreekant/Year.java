package shreekant;

class Year{
	void mini(int num1,int num2){
		if (num1<num2){
			System.out.println("output : "+num1+" is smaller number between "+ num1 + " and "+ num2+"." );
		}else{
			System.out.println("output : "+num2+" is smaller number between "+ num1 + " and "+ num2+"." );
		}
	}
	
	void max(int num1,int num2){
		if (num1 > num2){
			System.out.println("output: "+num1+ " is bigger number between "+ num1 + " and "+ num2+"." );
		}else{
			System.out.println("output: "+num2+ " is bigger number between "+ num1 + " and "+ num2+"." );
		}
	}
	
	public static void main (String[] args){
		Year year=new Year();
		year.mini(10,17);
		year.max(10,17);
	}
} 
/*Assignment no 8
Write 2 methods, one method to find maximum number from 2 numbers, other to find minimum number from given 2 numbers.

sample input :
num1 : 10
num2 : 17
output : 10 is smaller between 10 and 17.

sample input :
num1 : 10
num2 : 17
output : 17 is bigger between 10 and 17.*/