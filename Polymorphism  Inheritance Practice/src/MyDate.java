/*
 * Assignment03 - MyDate Class
 * Christopher Lindsey
 * 104384505
 * 2016-10-01
 */

// Importing StringTokenizer utility
import java.util.StringTokenizer;

// Creating the MyDate Class
public class MyDate {
	
	// The integer instance variables for day, month, and year
	private int day;
	private int month;
	private int year;
	
	// Constructor
	public MyDate (String a){
		
		// Creating the stringTokenizer
		StringTokenizer st = new StringTokenizer(a,"/");
		
		// Creating local variables out of the instance variables
		this.day = Integer.parseInt(st.nextToken());
		this.month = Integer.parseInt(st.nextToken());
		this.year = Integer.parseInt(st.nextToken());

	}
	
	// Copy Constructor
	public MyDate (MyDate copy){
		
		// Three integer copy variables
		day = copy.day; // Day of the week
		month = copy.month; // Month of the year
		year = copy.year; // Year

	}
	
	// toString method that formats the date into a new string and returns it
	public String toString(){
		
		// Variables for properly formatted month and year
		String monthString = "";
		String yearString = Integer.toString(year);
		
		// Switch Case for the month
		switch (this.month){
		
			// Cases for every possible month
			case 1: monthString = "January";
				break;
			case 2: monthString = "February";
				break;
			case 3: monthString = "March";
				break;
			case 4: monthString = "April";
				break;
			case 5: monthString = "May";
				break;
			case 6: monthString = "June";
				break;
			case 7: monthString = "July";
			    break;
			case 8: monthString = "August";
				break;
			case 9: monthString = "September";
				break;
			case 10: monthString = "October";
				break;
			case 11: monthString = "November";
				break;
			case 12: monthString = "December";
				break;
		}
		
		// Returns the formated date 
		return(monthString + " " + day + ", '" + yearString.substring(2));
	}
	
	// lessThan method to check if the local date is less then the copy date
	public boolean lessThan (MyDate copy){
		
		if (this.year < copy.year) // Copy year is bigger
			return true;
		
		else if (this.year > copy.year) // Copy year is smaller
			return false;
		
		else if (this.year == copy.year && this.month < copy.month) // Copy month is bigger
			return true;
		
		else if (this.year == copy.year && this.month > copy.month) // Copy month is smaller
			return false;
		
		else if (this.year == copy.year && this.month == copy.month && this.day < copy.day) // Copy day is bigger
			return true;
		
		else if (this.year == copy.year && this.month == copy.month && this.day > copy.day) // Copy day is smaller
			return false;

		else // Returns false for not being less then the copy
			return false;
	}

	// equals method to check if the local date matches the copy date
	public boolean equals (MyDate copy){
		
		return (this.year == copy.year && this.month == copy.month && this.day == copy.day);
//			return true;
//
	//	else
		//	return false;
	}
}
