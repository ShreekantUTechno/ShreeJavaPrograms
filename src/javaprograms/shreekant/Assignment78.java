package shreekant;

public class Assignment78{

	boolean getPrimeOrNot(int num){
		for(int index=2; index<num; index++){
			if (num%index==0){
				return false;
			}
		}return true;
	}

	void getPrimeSeries(int num){
		int sum=0;
		int count=0;
		for(int index=2; ;index++){
			boolean flag=getPrimeOrNot(index);
			if (flag==true){
				sum=sum+index;
				count++;
				if(sum>num){
					break;
				}
			}
		}System.out.println(" Output : Minm "+count+" Prime Numbers req to generate sum50.");
	}

	public static void main(String[] args){
		Assignment78 assign78=new Assignment78();
		assign78.getPrimeSeries(50);
	}
}
/*
Assignment - 78 : 28th July'2024
find minimum required prime numbers to generate sum 50. 

output : minimum 7 prime numbers are required to generate sum 50.   
Hint : 2 + 3 + 5 + 7 + 11 + 13 + 17 */
