// Date: 5.29.24

/* Question:
 * Write a Java program to check whether a given number is even or odd.
 * Prompt the user to enter a number, then use an if-else statement to 
 * determine if the number is even or odd. Print an appropriate message 
 * indicating the result.
 * 
 * Expected Output:
 * Enter a number: 5
 * 5 is odd.
 */

import java.util.Scanner;

public class FlowControl4{
	public static void main(String[] args) {
		
		// user input
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		
		// if else statement 
		if(num % 2 == 0) {
			System.out.print(num + " is even");
		}else {
			System.out.print(num + " is odd");
		}
		
		
	}
}