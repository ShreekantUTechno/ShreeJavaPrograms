package shreekant;


public class Assignment86Fibonacci{

	void getFibonacci(int sRange,int endRange){
		int num1=0;
		int num2=1;
		int num3=0;
		while(num3<=endRange){
			num3=num1+num2;
			if(num3>=sRange && num3<=endRange){
				System.out.println(" "+num3);	
			}
			num1=num2;
			num2=num3;
		}
	}

	public static void main(String[] args){
		Assignment86Fibonacci assign86=new Assignment86Fibonacci();
		assign86.getFibonacci(100,500);
	}
}
/*Assignment - 86 : 30th July'2024
print the fibonnaci series from range 100 to 500.
 */
