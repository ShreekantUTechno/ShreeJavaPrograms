package shreekant.comparableAssignment;

public class Builder implements Comparable<Builder>{
	int yearsOFExp,projectCompleted,revenue;
	String name;
	Builder(String name,int yearsOFExp,int projectCompleted,int revenue){
		this.name=name;
		this.yearsOFExp=yearsOFExp;
		this.projectCompleted=projectCompleted;
		this.revenue=revenue;
	}
	
	public String toString(){
		return name+" -> "+yearsOFExp+ " -> "+projectCompleted+" -> "+revenue;
	}
	
	@Override
	public int compareTo(Builder obj) {
		return this.yearsOFExp-obj.yearsOFExp;
	}
}

	
/*

Assignment - 106 : 9th Aug'2024

Create class Builder having name, yearsOfExp, projectComplete, revenue attribute. 
Sort Builder object based on yearsOfExp.
To validate sorting create Client class.
 */
