package shreekant;

public class Assignment73PrimeNumber{

	void getPrimeNumFromRange(int startRange, int endRange){
		int count=0,sum=0;
		for(int index=startRange; index<=endRange; index++){
			boolean flag=false;
			for(int i=2; i<index; i++){
				if (index % i ==0){
					flag=true;
					break;
				}
			}
			if(!flag){
				count++;
				sum=sum+index;
				System.out.print(index+ " ");
			}
		}
		System.out.println();
		System.out.println("Total no of prime numbers bet range is "+ count);
		System.out.println("Sum of all prime numbers from the range is "+ sum);
		System.out.println("Avrage of all prime numbers sum "+ sum/count);
	}	

	public static void main (String[] args){
		Assignment73PrimeNumber assign73=new Assignment73PrimeNumber();
		assign73.getPrimeNumFromRange(100,200);
	}
}

/*
Assignment - 73 : 28th July'2024

Print all the prime numbers from given range, print count, sum and average of the available prime numbers in a range.

input : start range 100, end range 200
output : all prime number 
		count of prime number
		sum of all prime number
		avg of all prime number
 */