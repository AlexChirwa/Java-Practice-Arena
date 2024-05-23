// Date 5.23.2024

/* Question 2
 * Write a program to find maximum between two numbers.
 */

import java.util.Scanner;

public class ConditionalStatements2{
	public static void main(String[] args) {
		
		// Accept user input from console 
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter values in the console 
		System.out.print("Enter value1: ");
		int value1 = input.nextInt();
		
		System.out.print("Enter value2: ");
		int value2 = input.nextInt();
		
		// find the maximum between two values 
		if(value1 > value2) {
			System.out.println("Maximum value: " + value1);
		}else if(value1 < value2) {
			System.out.println("Maximum value: " + value2);
		}else if(value1 == value2) {
			System.out.println("Both are equal: " + value1);
		}else {
			return;
		}
	}
}