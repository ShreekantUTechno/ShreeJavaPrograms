package shreekant;

class  Example19{
	int num=100;
	
	void process (int rNo){
		if (rNo<=5){
			if (rNo==1){
				System.out.println("Deepa");
			}else if(rNo==2){
				System.out.println("Tejas");
			}else{
				System.out.println("TechnoCredits");
			}
		}else {
			if (rNo>=10){
				System.out.println("Techno");
			}else{
				System.out.println(num=num+rNo);
			}
		}
		System.out.println(num);
	}
	
	public static void main (String[] args ){
		Example19 example19=new Example19();
		example19.process(8);
	}
}