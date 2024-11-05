package shreekant;

class Assignment40{
	
	void getDigitCount(String[] value){
		int index,digitTotal=0;
		for (index=0;index<value.length;index++){
			String eachString=value[index];
			for(int index2=0;index2<eachString.length();index2++){
				char ch=eachString.charAt(index2);
				if (Character.isDigit(ch)){
					//digitTotal++;
					digitTotal=digitTotal+Character.getNumericValue(ch);
				}
			}
		}
		//System.out.println("total number of digits in array is "+ digitTotal);
		System.out.println("total addition of digits in array is "+ digitTotal);
	}
	
	public static void main(String[] args){
		String[] value={"tec1hn3o","cr1e1d1i1t1s","india","pune1","A22nvit","tirth"};
		Assignment40 assign40=new Assignment40();
		assign40.getDigitCount(value);
	}
}

/*Assignment - 40 : 30th Jun'2024 [40 mins]
find total number of digits in array.

input : {"tec1hn3o","cr1e1d1i1t1s","india","pune1","A22nvit","tirth"}
output : 14*/