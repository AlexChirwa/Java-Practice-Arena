/* Date: 8.6.2024
 * author: Alex Joshua Chirwa
 * Revision of Control Flow in Java 
 * (if..else, switch, while loops, do-while loops, for-loops and for-each loops)
 */

package exercises;

import java.util.Scanner;

public class Revision3 {
	public static void main(String[] args) {
		
		/* Question 3: While Loop
		 * Write a java program that prompts the user to enter a positive integer.
		 * The program should then print all the even numbers from 0 up to (and including)
		 * that number.
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		
		int maxNum = in.nextInt();
		int evenNum = 0;
		
		while(evenNum <= maxNum) {
			if(evenNum%2 == 0){
			    System.out.println(evenNum);
			}
			evenNum++;
		}
		in.close(); // Close the Scanner
	}
}
