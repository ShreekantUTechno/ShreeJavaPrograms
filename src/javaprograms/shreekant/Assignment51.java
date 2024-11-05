package shreekant;

public class Assignment51 {
    
    int getCharFreq(String name,char ch){
       int count=0;
       for(int index=0; index<name.length(); index++){
            if (ch==name.charAt(index)){
                count++;
            }
        }
        return count;
    }
    
    void getCharFreq(String name){
        for(int index=0; index<name.length();index++){
            //String vowels="aeiouAEIOU";
            char ch=name.charAt(index);
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='u' || ch=='o'){    
                if(index==name.indexOf(ch)){
                    int count=getCharFreq(name,ch);
                        System.out.println(ch+" -> "+count);
                }
            }
            
        }
    }
    
    public static void main(String[] args) {
       String name="technocredits";
       Assignment51 assignment51 =new Assignment51();
       assignment51.getCharFreq(name);
    }
}

/*ssignment - 51 : 5th July'2024 [IMP]
 Print frequency of each vowel character in a given string.
 
 input : technocredits
 output : e -> 2
          o -> 1
          i -> 1 	
      */
