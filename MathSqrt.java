
// accepting user input to find the square root of a value using the Math.sqrt() method

import java.util.Scanner;

public class MathSqrt{
	public static void main(String[] args) {
		
		// using Scanner method to accept user input 
		Scanner in = new Scanner(System.in);
		
		// prompt user to input values and using hasNextXYZ  
		System.out.print("Enter value: ");
		int v1 = in.nextInt();
		
		// finding the square root, keep in mind square roots are in the type double 
		//double squareRoot = Math.sqrt(v1);
		
		System.out.println("Find the Square root: " + v1 + " \nThe square root is: " + Math.sqrt(v1));
		
		}
}