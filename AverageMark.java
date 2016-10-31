/*
 * Christopher Lindsey
 * 2016-09-26
 */

// Importing Utilities
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.*;

// Creating the class
public class Assignment02_Part_1 {

		// Scanner for input
		private static Scanner userIn;

		// Main Method
		public static void main(String a[]){
			
			// Double Variables
			double totalSum = 0; // The total sum of the marks entered
			double counter = 0; // The number of marks entered
			
			// String Variables
			String newString = ""; // String in first tokenizer
			String newString2 = ""; // String in second tokenizer
			String newString3 = ""; // String in third tokenizer
			
			// Initializing input variable
			userIn = new Scanner(System.in);
			
			// Asking the user for their input (marks)
			System.out.println("Please type in your marks for this class\nFORMAT EXAMPLE: (91);(23/25);80;21/25\n");
			String marks = userIn.nextLine();
			
			// First string tokenizer to eliminate "("
			StringTokenizer st = new StringTokenizer(marks, "(");
			while (st.hasMoreElements()){
				String currentString = (String) st.nextElement(); // Stores the current token in a string variable
				newString += currentString; // Creating the new string
				
			}
			// Second string tokenizer to eliminate ")"
			StringTokenizer st2 = new StringTokenizer(newString, ")");
			while (st2.hasMoreElements()){
				String currentString2 = (String) st2.nextElement();
				newString2 += currentString2; 
			}		
			// Third string tokenizer to eliminate "/"
			StringTokenizer st4 = new StringTokenizer(newString2, "/");
			while (st4.hasMoreTokens()){
				String currentString3 = (String) st4.nextElement();
				newString3 += currentString3;

			}
			// Fourth string tokenizer to eliminate ;
			StringTokenizer st3 = new StringTokenizer(newString3, ";");
			while (st3.hasMoreElements()){
				String currentNum = (String) st3.nextElement();

				// If statement to check if the token is 2 digits (length 2)
				if (currentNum.length() == 2){
					totalSum += ((Double.parseDouble(currentNum)/100)); // Adds the number to the total sum
					counter++; // Increases the number of marks inputed counter by 1
				}
				// Checks if the number is 4 digits long (this means the number was a ratio of (2 digits / 2 digits))
				else if (currentNum.matches("([0-9][0-9][0-9][0-9])")){
					totalSum += (Double.parseDouble(currentNum.substring(0,2))/ Double.parseDouble(currentNum.substring(2)));
					counter ++;
				}
				// Checks if the number was a perfect score out of 100
				else if (currentNum.matches("[1][0][0][1][0][0]|[1][0][0]")){
					totalSum += 1;
					counter ++;
				}
				
			}
			// Calculates the average by dividing the total sum by the number of marks entered and expresses it as a percent
			double average = totalSum / counter *100;
			System.out.print("Your average for the " + counter + " marks you entered is: "+ average + "%");
		}
}
