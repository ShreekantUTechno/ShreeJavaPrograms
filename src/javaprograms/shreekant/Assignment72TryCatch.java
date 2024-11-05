package shreekant;

public class Assignment72TryCatch {

	void getAdditionFromString(String str){
		String arr[]=str.split(" ");
		int sum=0;
		for(int index=0; index<str.length(); index++){
			try {
				sum=sum+Integer.parseInt(arr[index]);
			}catch(Exception e) {
				
			}
		}System.out.println("Output : "+sum);
	}
	
	public static void main(String[] args) {
		String str="I have 12 years and 3 motnhs of Experience";
		Assignment72TryCatch assign72=new Assignment72TryCatch();
		System.out.println("Input : " + str);
		assign72.getAdditionFromString(str);
	}

}
