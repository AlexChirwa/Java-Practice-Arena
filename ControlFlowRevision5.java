/* Date: 6.24.2024
 * Author: Chirwa Alex Joshua
 * 
 * Question: For-Loop
 * Write a Java program that prompts the user to enter a positive integer `n`. 
 * The program should then print the first 'n' numbers in the Fibonacci sequence.
 * 
 * Expected Output:
 * 
 * Enter a positive integer: 7
 * 0
 * 1
 * 1
 * 2
 * 3
 * 5
 * 8
 * 
 */

package exercises;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// Prompt user to enter a positive integer
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		
		int num = in.nextInt();
		int a = 0, b = 1, c, i;		
		
		// Print the first two Fibonacci numbers
		System.out.printf(a + "\n" +  b + "\n");
		
		// Start the loop from the 3rd position (i = 2)
		for(i = 2; i < num ; ++i) {
			// Calculate the next Fibonacci number
			c = a + b;
			// Print the next Fibonacci number
			System.out.println(c);
			// Update the variables for the next iteration
			a = b;
			b = c;
		}
		// Close the scanner
		in.close();
	}
}
