
//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class MathExercise{
	public static void main(String[] args) {
		
		// Declare object and initialize it with the predefined standard input object
		Scanner in = new Scanner(System.in);
		
		 
		System.out.print("input value: "); // prompt user to input three numbers to the console
		int num1 = in.nextInt(); // use hasNextXYZ to read the values in the console
		
		System.out.print("Input value: ");
		int num2 = in.nextInt();
		
		System.out.print("input value: ");
		int num3 = in.nextInt();
			
		
		// Calculate the average and print result 
		int average = num1 + num2 + num3  / 3;
		
		System.out.println("Average = " + average);
		
	}
}