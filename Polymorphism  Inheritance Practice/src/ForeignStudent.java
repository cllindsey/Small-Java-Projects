
public class ForeignStudent extends Student{
	
	private String countryOfOrigin;
	public static int numberOfForeignStudents;
	private MyDate dateOfEntryToCanada;

	public ForeignStudent(String studentName, int numberOfCoursesTaken, String countryOfOrigin, MyDate dateOfEntryToCanada){
		
		super(studentName, numberOfCoursesTaken);
		this.countryOfOrigin = countryOfOrigin;
		this.dateOfEntryToCanada = dateOfEntryToCanada;
		numberOfForeignStudents++;
		
	}

	public static int getNumberOfForeignStudents(){
		return numberOfForeignStudents;
	}
	
	public double computeFees(){
		return numberOfCoursesTaken * 1000.00;
	}
	
	public String findCountry(){
		return countryOfOrigin;
	}
	
	public boolean livingInCanadaSpecifiedDate (MyDate latestDateOfEntry){
		if (dateOfEntryToCanada.lessThan(latestDateOfEntry))
			return true;
		else
			return false;
				
	}
	
	public boolean lessThan(Student anotherStudent){
		
		if (anotherStudent.computeFees() == 50.0 || ((studentName.compareTo(anotherStudent.studentName) > 0) && (findCountry() != "Canada")))
			return false;
		else
			return true;
	}
}
