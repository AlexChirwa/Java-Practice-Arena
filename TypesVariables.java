
/* Practice Exercises based on data types and variables in Java */

public class TypesVariables{
	public static void main(String[] args) {
		
	
		/* Question 1: Write a Java program to print 'Hello' on screen and your name on a separate line. 
		 * Expected Output: 
		 * Hello
		 * Alex Joshua Chirwa 
		 */
		
		// Create the variables 
		
		String greetings = "Hello";
		String myName = "Alex Joshua Chirwa";
		
		// Print variables 
		System.out.println(greetings);
		System.out.println(myName);
		
		// This is more simpler way cause String is already a declared data type in the "main" method  
		System.out.println("Hello\nAlex");
		
		
		/* Question 2: Write a Java program to print the sum of two numbers.
		 * 
		 * Test Data:
		 * 74 + 36
		 * 
		 * Expected Output :
		 * 110
		 */
		
		// Create variables 
		int x = 74, y = 36;
		
		// Calculate the sum of two numbers
		int sum = x + y;
		
		// Print variables
		
		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);
		System.out.println("74 + 36 = " + sum);
		 
		
		/* Question 3: Write a Java program to divide two numbers and print them on the screen.
		 * 
		 * Test Data :
		 * 50/3
		 * 
		 * Expected Output :
		 * 16
		 */
		
		
		// Create variables 
		
		int a = 50, b = 3;
		
		// Calculate the Division of two numbers
		
		int divideBy = a/b;
		
		// Print variable
		
		System.out.println("Value of x: 50\nValue of y: 3");
		//System.out.println("Value of x: " + x);
		//System.out.println("Value of y: " + y);
		System.out.println("The division of two numbers is: " + divideBy);
		 
		
		/* Question 4: Write a Java program to print the results of the following operations.
		 * 
		 * Test Data:
		 * a. -5 + 8 * 6
		 * b. (55+9) % 9
		 * c. 20 + -3*5 / 8
		 * d. 5 + 15 / 3 * 2 - 8 % 3
		 * 
		 * Expected Output :
		 * 43
		 * 1
		 * 19
		 * 13
		 */
		 
		
		// Create variables
		
		int myInt1 = -5 + 8 * 6;
		int myInt2 = (55+9) % 9; // % means getting the remainder of what 9 will divide
		int myInt3 = 20 + -3 * 5 / 8;
		int myInt4 = 5 + 15 / 3 * 2 - 8 % 3;
		
		// Print variables 
		
		System.out.println(myInt1);
		System.out.println(myInt2);
		System.out.println(myInt3);
		System.out.println(myInt4);
	
		
		/* Question 5: Write a Java program that takes two numbers as input and displays the product of two numbers.
		 * 
		 * Test Data:
		 * Input first number: 25
		 * Input second number: 5
		 * 
		 * Expected Output :
		 * 25 x 5 = 125
		 */
		
		// Create variables 
		
		int num1 = 25, num2 = 5;
		
		// Calculation 
		String input = "25 + 5 = ";
		int product = num1 * num2;
		
		
		// Print variables 
		
		System.out.println(input + product);
		
		
	}
}