package shreekant;

class Division{
	void div(int stRange,int endRange){
		for(int num=stRange;num<=endRange;num++){
			if (num%5==0 && num%3==0){
				System.out.println("Output : divisible by 5 and 3, Numbers are: "+num);
			}
		}
	}
	
	public static void main(String[] args){
		Division division=new Division();
		division.div(5,40);	
	}
}

/*Assignment - 11 : 2nd Jun'2024 [12- 15 mins]
1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30*/