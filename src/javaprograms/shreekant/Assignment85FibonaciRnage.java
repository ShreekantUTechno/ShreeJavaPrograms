package shreekant;

public class Assignment85FibonaciRnage{

	void getFibonacciFromRange(int sRange,int endRange){
		int num1=sRange;
		int num2=sRange +1;
		System.out.println(num1);
		System.out.println(num2);
		int num3=0;
		while(num3<=endRange){	
			num3=num1+num2;
			if(num3<=endRange){
				System.out.println(num3);
			}
			num1=num2;
			num2=num3;
		}

	}

	public static void main(String[] ref){
		Assignment85FibonaciRnage assign85=new Assignment85FibonaciRnage();
		assign85.getFibonacciFromRange(0,100);		
	}
}

/*
Assignment - 85 : 30th July'2024
print the fibonnaci series from range 0 to 100.
 */
