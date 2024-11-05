package shreekant;

class  Assignment48getcharfreq{
    
    void getEachCharFrq(String name){
        for(int index=0; index<name.length(); index++){
            char ch=name.charAt(index);
            int count=0;
            for(int i=0; i<name.length(); i++){
                if (ch==name.charAt(i)){
                    count++;
                }
            }
            System.out.println(ch + "--->" + count);
        }
    }
    
    public static void main(String[] args) {
    	Assignment48getcharfreq hello=new Assignment48getcharfreq();
        hello.getEachCharFrq("aakanksha");
    }
}
/*Assignment - 48 : 5th July'2024
 Print frequency of each character in a given string.
 
 input : aakanksha
 output : a -> 4
          a -> 4
		  k -> 2
          a -> 4
          n -> 1
          k -> 2
          s -> 1
          h -> 1
          a -> 4
*/
