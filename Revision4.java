/*
 *  Date: 20.6.2024
 * Author: Chirwa Alex Joshua
 * do-while loop question
 * 
 * Write a Java program that prompts the user to enter  
 * integers repeatedly until they enter a negative number. 
 * The program should then print the sum of all the entered 
 * positive integers.
 * 
 *  Expected Output:
 *  Enter an integer: 5
 *  Enter an integer: 10
 *  Enter an integer: -1
 *  Sum of entered positive integers: 15
 */

package exercises;

import java.util.Scanner;

public class Revision4 {
	public static void main(String[] args) {
		// prompt user to Enter an integer
		Scanner in = new Scanner(System.in);
		//System.out.println("Enter an integer: ");
		
		// create variables
		int enterNumber;
		int sum = 0; // is like int sum;
		// sum of the positive numbers
		do { 
			System.out.print("Enter an integer: ");
			enterNumber = in.nextInt();
			if(enterNumber >= 0) {
				sum = sum + enterNumber;
			}
		}
		while (enterNumber >= 0);
		
		System.out.print("Sum of entered positive integers: " + sum);
		in.close(); // Close Scanner
	}

}
