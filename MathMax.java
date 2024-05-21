
// accepting user input to find the maximum number using the Math.max() method

import java.util.Scanner;

public class MathMax{
	public static void main(String [] args) {
		
		// Scanner method to accept user input in the console 
		Scanner in = new Scanner(System.in);
		
		// prompt the user to input two values of the data type int (whole numbers)and use hasNextXYZ()
		System.out.print("Enter value: ");
		int num1 = in.nextInt();
		
		System.out.print("Enter value: ");
		int num2 = in.nextInt();
		
		// finding the maximum value 
		System.out.println("Maximum value: " + Math.max(num1, num2));
		
	}
}