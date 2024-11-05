package shreekant;

public class Assignment83FibonacciSeries{

	void getFibonacciSeries(int nth){
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.print(num1+" "+num2);
		for(int index=2; index<nth; index++){
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}

	public static void main(String[] args){
		Assignment83FibonacciSeries assign83=new Assignment83FibonacciSeries();
		assign83.getFibonacciSeries(8);
	}
}

/*
Assignment - 83 : 30th July'2024
print the fibonnaci series first nth number.

input : 8
output : 0,1,1,2,3,5,8,13

 */
