
// accepting user input to find the Absolute value using the Math.abs() method

import java.util.Scanner;

public class MathAbs{
	public static void main(String[] args) {
		
		// Using Scanner method to accept user input 
		Scanner in = new Scanner(System.in);
		
		// Prompt user to enter value and use hasNextXYZ()
		System.out.print("Enter a negative value: ");
		
		// using the type double for a wide variation 
		double myDouble = in.nextDouble();
		
		// finding the absolute value
		System.out.println("Find the absolute value of: " + myDouble + " \nThe absolute value is: " + Math.abs(myDouble));
		
	}
}