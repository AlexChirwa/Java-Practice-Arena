
import java.util.Scanner;

public class TypeCasting{
	public static void main(String[] args) {
		
		       // Exercise of type casting;
		
				/* Question 1: 
				 * Write a Java program to demonstrate explicit type casting from double to int. 
				 * Prompt the user to enter a double value, perform type casting to convert it to an integer, 
				 * and display the result.
				 * 
				 * Expected Output:
				 * Enter a double value: 12.34
				 * Double value: 12.34
				 * Int value: 12
				 */
				
				//import java.util.Scanner;
				
				Scanner in = new Scanner(System.in);
				
				// prompt the user to input a double in the console
				System.out.print("Enter a double value: ");
				double myDouble = in.nextDouble();
				
				// print the variable in the console 
				System.out.println("Double value: " + myDouble);
				
				// Narrowing casting from double to in
				int myInt = (int) myDouble;
				System.out.println("Int value: " + myInt);
				
				
				
				/* Question 2:
				 * Write a Java program to calculate the average of three integers.
				 * Prompt the user to enter three integers, calculate their average as a double, 
				 * and then cast the result to an int to display the average as a whole number.
				 * 
				 * Expected Output:
				 * Enter three integers:
				 * 10
				 * 15
				 * 20
				 * Average: 15
				 */
				
				//Scanner in = new Scanner(System.in);
				
				// Prompt the user to enter three integers
				System.out.println("Enter three integers: ");
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				int num3 = in.nextInt();
				
				// sum of the values
				int sum = num1 + num2 + num3;
				
				// Calculate their average as a double.
				double d = (double)sum / 3;
				
				// Print the Average in data type int
				int average = (int) d;
				System.out.println("Average: " + average);
				
				
				
				
				/* Question 3:
				 * Write a Java program to convert a character to its corresponding ASCII value. 
				 * Prompt the user to enter a character, convert it to an int using type casting, 
				 * and display the ASCII value.
				 * 
				 * Expected Output:
				 * Enter a character: A
				 * ASCII value of A: 65
				 */
				
				//Scanner sc = new Scanner(System.in);
				
				// Prompt the user to enter a character
				System.out.print("Enter a character: ");
				char myChar = in.next().charAt(0);
				
				// Convert it to an int type
				int num = (int) myChar;
				System.out.println("ASCII vale of A: " + num);
				

	}
}