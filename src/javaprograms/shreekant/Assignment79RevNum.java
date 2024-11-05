package shreekant;


public class Assignment79RevNum{

	void getRevNum(int num){
		String revString="";
		int digit=0;
		while(num>0){
			digit=num%10;
			revString=revString+digit;
			num=num/10;
		}
		int rev=Integer.parseInt(revString);
		System.out.println(rev);
	}

	public static void main(String[] args){
		Assignment79RevNum assign79=new Assignment79RevNum();
		assign79.getRevNum(15243);
	}
}
/*
Assignment - 79 : 28th July'2024
write a method which accept number and return the reverse number (use String : charAt & Integer.ParseInt).

input :  15243
output : 34251*/
