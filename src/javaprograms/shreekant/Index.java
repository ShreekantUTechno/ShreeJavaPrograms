package shreekant;

class Index{
	void processIndex(int monthIndex){
		if (monthIndex >=1 && monthIndex<=3){
			if (monthIndex==1){
				System.out.println("Month index "+ monthIndex+ " is in Q1 & its January month");
			}else if(monthIndex==2){
				System.out.println("Month index "+ monthIndex+ " is in Q1 & its February month");
			}else if(monthIndex==3){
				System.out.println("Month index "+ monthIndex+ " is in Q1 & its March month");
			}		
		}else if(monthIndex >=4 && monthIndex<=6){
			if (monthIndex==4){
				System.out.println("Month index "+ monthIndex+ " is in Q2 & its April month");
			}else if (monthIndex==5){
				System.out.println("Month index "+ monthIndex+ " is in Q2 & its May month");
			}else if (monthIndex==6){
				System.out.println("Month index "+ monthIndex+ " is in Q2 & its June month");
			}
		}else if (monthIndex >=7 && monthIndex<=9){
			if (monthIndex==7){
				System.out.println("Month index "+ monthIndex+ " is in Q3 & its July month");
			}else if (monthIndex==8){
				System.out.println("Month index "+ monthIndex+ " is in Q3 & its August month");
			}else if(monthIndex==9){
				System.out.println("Month index "+ monthIndex+ " is in Q3 & its September month");
			}
		}else if (monthIndex >=10 && monthIndex<=12){
			if (monthIndex==10){
				System.out.println("Month index "+ monthIndex+ " is in Q4 & its October month");
			}else if (monthIndex==11){
				System.out.println("Month index "+ monthIndex+ " is in Q4 & its November month");
			}else if(monthIndex==12){
				System.out.println("Month index "+ monthIndex+ " is in Q4 & its december month");
			}
		}else{
			System.out.println("invalid month index, it can't be greater than 12 and It cant be negative.");
		}
	}
	
	public static void main (String [] args){
		Index index=new Index();
		index.processIndex(5);
		index.processIndex(2);
		index.processIndex(-3);
		index.processIndex(12);
	}
}
/*Assignment - 9 : 31st May'2024 

Please use nested if else for below requirement.
Based on month index, print quarter and name of the month. 

1 to 3 -> Q1
4 to 6 -> Q2
7 to 9 -> Q3
10 to 12 -> Q4 

input : 5
output : Month index 5 is in Q2, its May.

input : 2
output : Month index 2 is in Q1, its Febuary.

input : -3 
output: invalid month index, it can't be negative. 

input : 12 
output: invalid month index, it can't be greater than 12.*/