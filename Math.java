
// Write a Java program that takes two numbers as input and displays the product of two numbers.

// Test Data:
// Input first number: 25
// Input second number: 5

// Expected Output:
// 25 x 5 = 125

import java.util.Scanner;

public class Math{
	public static void main(String[] args) {
		
		// Declare the object and initialize it with the predefined standard input object
		Scanner sc = new Scanner(System.in);
		
		/*
		// Enter user input to the console 
		int num1 = sc.nextInt(); // Input first number: 25
		int num2 = sc.nextInt(); // Input second number: 5
		
		// Calculate the product 
		int product = num1 * num2;
		
		// Print to the console 
		System.out.println("Input first number: " + num1);
		System.out.println("Input second number: " + num2);
		System.out.println("25 x 5 = " + product);
		*/
		
		// Prompt the user to input the first number 
		System.out.print("Input first number: ");
		// Read and store the first number 
		int num1 = sc.nextInt();
		
		// Prompt the user to input the second number 
		System.out.print("Input second number: ");
		// Read and store the second number 
		int num2 = sc.nextInt();
		
		// Calculate the product of the two numbers and display the result  
		System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		
	}
}