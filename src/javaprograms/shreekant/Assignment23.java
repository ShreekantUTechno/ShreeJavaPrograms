package shreekant;

public class Assignment23 {
	int count=0;
	
	int noSum(int stRange,int endRange) {
		int sum=0;
		for (int index =stRange;index<=endRange;index++) {
			sum=sum+index;
			count++;
		}
		return sum;
	}
	
	int noAvg(int sum) {
		//System.out.println(count);
		int avg =sum/count;
		return avg;
	}
	
	public static void main(String[] args) {
		Assignment23 assign23=new Assignment23();
		int stRange=1,endRange=10;
		System.out.println("Average of sum of "+ stRange +" to "+endRange+" numbers is "+assign23.noAvg(assign23.noSum(1,10)));
	}
}/**/
 