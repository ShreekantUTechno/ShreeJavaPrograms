package shreekant;

class SumNo{
	void display(int stRange,int endRange){
		int sum=0;
		for(int num=stRange;num<=endRange;num++){
			if (num%5==0 && num%10==0){
				sum=sum+num;
			}
		}
		System.out.println("Output : In the range "+stRange +" to "+endRange +" calculated sum is "+sum);
	}
	
	public static void main(String[] args){
		SumNo sumno=new SumNo();
		sumno.display(10,50);
		//sumno.display(1,10);
	}
}


/*Assignment - 14 : 21st Jan'2024 [10 - 15 mins]
On user defined range print sum of all the number which is divisible by 5 & 10.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 50 
Output : In the range 10 to 50, calculated sum is 150*/