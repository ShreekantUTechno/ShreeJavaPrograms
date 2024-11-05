package shreekant;


 public class Assignment50FreqOfEachChar {
	 /* int getCharFreq(String name,char ch){
	       int count=0;
	       for(int index=0; index<name.length(); index++){
	            if (ch==name.charAt(index)){
	                count++;
	            }
	        }
	        return count;
	    }*/
	    
	    void getCharFreq(String name){
	        for(int index=0; index<name.length();index++){
	            //String vowels="aeiouAEIOU";
	            char ch=name.charAt(index);
	            int count=0;
	            if(index==name.indexOf(ch)){
	            	for(int inner=0; inner<name.length();inner++) {
	                	if (ch==name.charAt(inner)) {
	                		count++;
	                	}
	                }System.out.println(ch+" -> "+count);
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	       String name="aakanksha";
	       Assignment50FreqOfEachChar assignment50 =new Assignment50FreqOfEachChar();
	       assignment50.getCharFreq(name);
	    }   
 }	   