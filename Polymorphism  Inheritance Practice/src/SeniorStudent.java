
public class SeniorStudent extends Student {

	private double pension;
	
	public SeniorStudent(String studentName, int numberOfCoursesTaken, double pension){
		
		super(studentName, numberOfCoursesTaken);
		this.pension = pension;
		
	}
	
	public double computeFees(){
		
		return 50.0;
		
	}

	public String toString(){
		
		return "Student #:" + studentNumber + ", Name:" + studentName + " is from " + findCountry() + "; pays fees $" + computeFees() + " senior citizen who gets pension $" + pension;

	}
	
	public boolean lessThan(Student anotherStudent){
		if (anotherStudent.computeFees() == 50.0 && studentName.compareToIgnoreCase(anotherStudent.studentName) > 0)
			return false;
		else
			return true;
	}
}
