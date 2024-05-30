// Date: 5.29.24

/* Question 2 Switch Statements:
 * Write a Java program to display the name of a day based on the given
 * number (1 for Sunday, 2 for Monday, etc.). Prompt the user to enter a 
 * number representing a day of the week, then use a switch statement to 
 * determine and print the corresponding day's name.
 * 
 * Expected Output:
 * Enter a number (1-7): 3
 * Wednesday
 */

import java.util.Scanner;

public class FlowControl5{
	public static void main(String[] args) {
		
		// user input
		Scanner sc = new Scanner(System.in);
		
		// prompt user in the console
		System.out.print("Enter a number (1-7): ");
		int days = sc.nextInt();
		
		// Switch statement
		switch(days) {
		case 1:
			System.out.print("Sunday");
			break;
		case 2:
			System.out.print("Monday");
		    break;
		case 3:
			System.out.print("Tuesday");
		    break;
		case 4:
			System.out.print("Wednsday");
		    break;
		case 5:
			System.out.print("Thurday");
		    break;
		case 6:
			System.out.print("Friday");
		    break;
		case 7:
			System.out.print("Saturday");
			break;
		}
		
		
		
	}
}