package shreekant;

public class Assignment84FibonacciSum{

	void getFibonacciSeriesTillSum(int input){
		int num1=0,num2=1,num3=0;
		int sum=num1+num2;
		int count=2;
		//System.out.print(num1+" "+num2);
		while(sum<=input){
			num3=num1+num2;
			sum=sum+num3;
			num1=num2;
			num2=num3;
			count++;
		}
		System.out.println("Input : "+input);
		System.out.println("output : "+count);
	}

	public static void main(String[] args){
		Assignment84FibonacciSum assign84=new Assignment84FibonacciSum();
		assign84.getFibonacciSeriesTillSum(50);
	}
}

/*
Assignment - 84 : 30th July'2024
how many minimum numbers are required to generate sum 50 in the fibonnaci series.
0 1 1 2 3 5 8 13 21 
input : 50
output : 9
 */
