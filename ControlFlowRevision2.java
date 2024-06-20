package exercises;

/* Date: 18.6.2024
 * author: Alex Joshua Chirwa
 * Revision of Control Flow in Java 
 * (if..else, switch, while loops, do-while loops, for-loops and for-each loops)
 */

import java.util.Scanner;

public class Revision2{
	public static void main(String[] args) {
		
		/* Question 2: Switch Statement
		 * Write a java program that prompts the user to enter a number between
		 * 1 and 7. The program should print the corresponding day of the week
		 * (1 for Monday, 2 for Tuesday, .., 7 for Sunday). If the user enters a number 
		 * outside this range, print "Invalid input".
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 7: ");
		
		int days = sc.nextInt();
		//System.out.println("Enter a number between 1 and 7: " + days);
		
		switch(days) {
		case 1:
			System.out.println("Monday");
		    break;
		case 2:
			System.out.println("Tuesday");
		    break;
		case 3:
			System.out.println("Wednsday");
		    break;
		case 4:
			System.out.println("Thursday");
		    break;
		case 5:
			System.out.println("Friday");
		    break;
		case 6:
			System.out.println("Saturday");
		    break;
		case 7:
			System.out.println("Sunday");
		    break;
		default:
			System.out.println("Invalid");
		}
	}
}
