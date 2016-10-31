public class University{
	
	private Student[] listOfStudents;
	private int maximumNumberOfStudents;
		
	public University(int maximumNumberOfStudents){
		
		this.maximumNumberOfStudents = maximumNumberOfStudents;
		this.listOfStudents = new Student[maximumNumberOfStudents];
	}
	
	public boolean insertStudent(Student aStudent){
		
			if (aStudent.studentNumber <= maximumNumberOfStudents){
				listOfStudents[aStudent.studentNumber -1] = aStudent;
				return true;
			}
			else
				return false;
	}
	
	public int numberOfStudents(String nameOfCountry){
		int num = 0;
		for (int i =0; i < maximumNumberOfStudents; i++){
			if (listOfStudents[i] != null){

				if (listOfStudents[i].findCountry().equals(nameOfCountry)){
					num++;
				}
			}
		}
		return num;
	}	
	
	public int numberOfForeignStudentLivingInCanadaSince2010(){
		int num = 0;
		MyDate date = new MyDate("01/01/2010");
		for (int i = 0; i < maximumNumberOfStudents; i++){
			if (listOfStudents[i] != null){
				if (listOfStudents[i] instanceof ForeignStudent){
					if (((ForeignStudent)listOfStudents[i]).livingInCanadaSpecifiedDate(date)){
						num++;
					}
				}
			}
		}
		return num;
	}
	
	public Student findLeastStudent(){
		
		Student least = listOfStudents[0];
		for (int i = 1; i < maximumNumberOfStudents; i++){
			if (listOfStudents[i] != null){
				if (least.lessThan(listOfStudents[i]) == false){
					least = listOfStudents[i];
				}
			}
			
		}
		return least;
	}
	
	public String toString(){
		String s="";
		for (int i = 0; i < maximumNumberOfStudents; i++){
			if (listOfStudents[i] != null){
				s += listOfStudents[i].toString() + "\n";
			}
		}
		return "Number of students in University = " + maximumNumberOfStudents + "\n" + s;
	}
		
}
