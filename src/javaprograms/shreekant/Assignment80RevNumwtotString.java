package shreekant;

public class Assignment80RevNumwtotString{

	void getRevNum(int num){
		int rev=0;
		int digit=0;
		while(num>0){
			digit=num%10;
			rev=(rev*10)+digit;
			num=num/10;
		}
		System.out.println(rev);
	}


	public static void main(String[] args){
		Assignment80RevNumwtotString assign80=new Assignment80RevNumwtotString();
		assign80.getRevNum(15243);
	}
}

/*Assignment - 80 : 28th July'2024
write a method which accept number and return the reverse number (without using String).

input :  15243
output : 34251*/
