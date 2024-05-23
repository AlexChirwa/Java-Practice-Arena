// Date 5.23.2024

/* Question 3
 * Write a program to find maximum between three numbers
 */

import java.util.Scanner;

public class ConditionalStatements3{
	public static void main(String[] args) {
		
		// user input
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number 1 : ");
		int num1 = in.nextInt();
		
		System.out.print("Enter number 2 : ");
		int num2 = in.nextInt();
		
		System.out.print("Enter number 3 :");
		int num3 = in.nextInt();
		
		// find maximum between three numbers 
		int result = ((num1 > num2) ? (num1 > num3) ? num1 : num3 : (num2 > num3) ? num2 : num3);
		System.out.println("Maximum number: " + result);
		
	}
}