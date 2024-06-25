/* Date: 6.25.2024
 * Author: Chirwa Alex Joshua 
 * 
 * Question: Nested loops
 * Write a Java program that prompts the user to enter a positive integer n.
 * The program should then print a right-angled triangle 
 * pattern of asterisks (*) with n rows.
 * 
 * Expected Output:
 * Enter a positive integer: 5
 * *
 * **
 * ***
 * ****
 * *****
 */

package exercises;

import java.util.Scanner;

public class Revision6 {
	public static void main(String[] args) {
		// prompt the user to enter a positive integer n
		Scanner in = new Scanner(System.in);
		// print the positive integer
		System.out.print("Enter a positive integer: ");
		
		// initialize variables
		int n = in.nextInt();
		int t, j;
		
		// outer-for loop
		for(t = 0; t < n; t++) {
			// inner-for loop
			for(j = 0; j <= t; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
   
}
