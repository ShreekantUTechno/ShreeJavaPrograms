package shreekant;

public class Assignment24 {
	int sum;        

    int add (int x, int y){     
        return x+y;
    }
     
    int sub(int x, int y){
        return x-y;
    }
     
    int multi(int x, int y){
        return x*y;
    }
     
    int div(int x, int y){
        return x/y;
    }
     
    int processData(){
    	int sum=0;
        sum =sum+add(10,2);
        sum =sum+sub(14,2);
        sum=sum+multi(25,2) ;
        sum=sum+div(50,10);
        return sum;
    }
     
    public static void main(String[] args){
    	Assignment24 returntype=new Assignment24 ();
        System.out.println("Final out put is "+ returntype.processData());
    }
}
