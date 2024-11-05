package shreekant;

class Display2{
	void process (int stRange,int endRange){
		int sum=0;
		int count =1;
		int avg=0;
		for(int num=stRange;num<=endRange;num++){
			if(num%5==0 && num%7==0){
				System.out.println("Output : Numbers are, "+ num);
				sum=sum+num;
				avg=sum/count;
				if(count==3){
					break;
				}
				count++;
			}
		}
		System.out.println("Average is "+ avg);
		System.out.println("Sum is "+sum);
	}
	
	public static void main (String[] args){
		Display2 display=new Display2(); 
		display.process(1,110);
	}
}


/*Assignment - 16 : 21st Jan'2024 [20 to 30 mins]
On user defined range print sum and average of numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 110
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70*/