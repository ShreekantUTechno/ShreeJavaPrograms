package shreekant;

class EvenNo{
	void even(int startRange,int endRange){
		for (int num=startRange;num<=endRange;num++){
			if (num%2==0){
				System.out.println("output : "+num);
			}
		}
	}
	
	public static void main(String[] args){
		EvenNo EvenNo=new EvenNo();
		EvenNo.even(10,15);
	}
}


/*Assignment - 10 : 2nd Jun'2024 [12-15 mins]
Write only one program having the following methods.

1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.

Input : Range -> 10 to 15
Output : Even numbers are:
10
12
14

printEvenNum(int startRange, int endRange){
        for(int num=startRange; num<=endRange; num++){
                
        }        
}

printEvenNum(int startRange, int endRange){
        for(; startRange<=endRange; startRange++){
                
        }        
}*/