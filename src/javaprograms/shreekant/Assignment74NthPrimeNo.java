package shreekant;

public class Assignment74NthPrimeNo{

	boolean getPrime(int num){
		boolean flag=true;
		for(int index=2; index<num; index++){
			if(num%index==0){
				flag=false;
			}
		}
		return flag;		
	}

	void getPrimeNthNum(int startRange,int endRange,int nth){
		int count=0;
		for(int index=startRange; index<=endRange; index++){
			boolean flag=getPrime(index);
			if (flag){
				count++;
				if(count == nth){
					System.out.println(index+" is the " + nth + " th prime number from the range.");
					break;
				}
			}
		}	
	}

	public static void main(String[] args){
		Assignment74NthPrimeNo assign74=new Assignment74NthPrimeNo();
		assign74.getPrimeNthNum(100,500,7);
	}
}

/*
Assignment - 74 : 28th July'2024
Find the nth prime number from given range. 

input : 100, 500, 7
output : 
 */
