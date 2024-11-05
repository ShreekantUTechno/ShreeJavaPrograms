package shreekant;

public class Assignment75RangePrimeNum{

	boolean getNumPrimeOrNot(int num){
		boolean flag=true;
		for(int index=2; index<num; index++){
			if(num % index ==0){
				flag=false;
			}
		}return flag;
	}	

	void getPrimeNumFromRange(int startRange,int endRange,int sNth,int eNth){
		int count=0;
		for(int index=startRange; index<=endRange; index++){
			boolean flag=getNumPrimeOrNot(index);
			if(flag){
				count++;
				if(count>=5 && count<=8){
					System.out.print(index+ " ");
				}
				if (count>8){
					break;
				}
			}	
		}
	}

	public static void main(String[] args){
		Assignment75RangePrimeNum assign75=new Assignment75RangePrimeNum();
		assign75.getPrimeNumFromRange(100,1000,5,8);
	}
}
/*
Assignment - 75 : 28th July'2024

Find the 5th to 8th prime number from given range. 

input : 100 (startRange), 1000 (endRange), 5 (nthStartPrimeNum), 8 (nthEndPrimeNum)
output : 

 */
