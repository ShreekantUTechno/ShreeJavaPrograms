package shreekant;

class Student{
	void procssData(int score){
		if (score > 90 && score <=100){
			System.out.println("You got A+ Grade");
		}else if (score > 80 && score <= 90){
			System.out.println("You got A Grade");
		}else if (score > 70 && score <= 80){
			System.out.println("You got B+ Grade");
		}else if (score >60 && score <= 70){
			System.out.println("You got B Grade");
		}else if (score >=50 && score <= 60){
			System.out.println("You got c Grade");
		}else if (score >=0 && score < 50){
			System.out.println("work harder");	
		}else if (score < 0 || score > 100){
			System.out.println("Invalid score");
		}
	}
	
	public static void main(String[] args){
		Student student=new Student();
		student.procssData(92);
		student.procssData(76);
		student.procssData(23);
		student.procssData(-19);
		student.procssData(102);
	}
}
/*Assignment - 7 : 31st May'2024
Print student grade based on obtain score.
If score is between 90 (excluding) to 100 (including) -> "A+"
If score is between 80 (excluding) to 90 (including) -> "A"
If score is between 70 (excluding) to 80 (including) -> "B+"
If score is between 60 (excluding) to 70 (including) -> "B"
If score is between 50 (including) to 60 (including) -> "C"
If score is between 50 (excluding) to 0 (including) -> "work harder"
Any other score should be considered as Invalid score.

input : 92
output : A+

input : 76
output : B+

input : 23
output : work harder

input : -19
output : Invalid score

input : 102
output : Invalid score*/