package shreekant;

public class Assignment56 {    
	
	void printNo(int stRange,int endRange){
		int no=stRange;
		while(no<=endRange){
			if(no%5==0 && no%7==0){
				System.out.println(no);
			} 
			no++;
		}
	}

	public static void main(String[] args) {
		Assignment56 hello=new Assignment56();
		hello.printNo(10,50);
	}
}
	/*Assignment - 56 : 

	Print all the numbers between startRange to endRange which is div by 5 and 7.

	void printNum(int startRange, int endRange){
		
	}

	NOte : Use while loop

	*/
