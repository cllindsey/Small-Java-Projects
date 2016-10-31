/*
 * Christopher Lindsey
 * 2016-09-26
 */

// Importing Utilities
import java.util.Scanner;
import java.util.regex.*;

// Creating the class
public class Assignment02_Part_2 {
	
	// Main Method
	public static void main(String a[]){
		
		// Scanning in user input
		Scanner userIn = new Scanner(System.in);
		System.out.print("Please type in the date formatted like DD/MM/YY or DD-MM-YY \n\n");
		String date = userIn.nextLine();
		
		// Regular Expression to check if the inputed date was valid or not
		if(date.matches("([0-2][0-9]|[3][0-1])(/|-)([0][1-9]|[1][0-2])(/|-)([0][0-9]|[1][0-4])")){
			System.out.print("The date: " + date + " is valid"); // Prints the valid date
		}
		else{
			System.out.print("The date entered is invalid"); // Prints that the date was invalid
		}
	}
}
