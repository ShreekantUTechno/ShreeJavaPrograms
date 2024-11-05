package shreekant;

class display1{
	void process(int stRange,int endRange){
	    int count=1;
		for(int num=stRange;num<=endRange;num++){
			if (num%3==0 && num%4==0){
			System.out.println("Output : First 3 numbers divisible by 3 and 4 is : "+ num);
				if (count==3){
					break;
				}
			    count++;
			}
		}
	}
	
	public static void main (String[] args){
		display1 display=new display1();
		display.process(10,500);
	}
}

/*Assignment - 15 : 21st Jan'2024 [30-40 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36*/