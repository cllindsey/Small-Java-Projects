
public class Student {
	
		public int studentNumber = 0;
		public static int number = 0;
		protected String studentName;
		protected int numberOfCoursesTaken;
	
		public Student (String studentName, int numberOfCoursesTaken){
			
			this.studentName = studentName;
			this.numberOfCoursesTaken = numberOfCoursesTaken;
			this.studentNumber = ++number;
			
		}
		
		public Student (String studentName){
			
			this.studentName = studentName;
			numberOfCoursesTaken = 5;
			this.studentNumber = ++number;

		}
		
		public double computeFees(){
			
			int fees = 0;
			if (numberOfCoursesTaken >= 4)
				fees = 800;
			else
				fees = numberOfCoursesTaken * 200;
		
			return fees;
		}
		
		protected String findCountry(){
			return "Canada";
		}
		
		public String toString(){
			return "Student #:" + studentNumber + ", Name:" + studentName + " is from " + findCountry() + "; pays fees $" + computeFees();
		}
		
		public boolean lessThan (Student anotherStudent){
			
			if (anotherStudent.findCountry() != "Canada" || anotherStudent.computeFees() == 50.0 || studentName.compareTo(anotherStudent.studentName) > 0 )
				return false;
			else
				return true;
		}

}

