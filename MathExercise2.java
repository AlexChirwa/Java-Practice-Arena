
// Write a Java program to print the area and perimeter of a rectangle.

// Test Data:
// Width = 5.5 Height = 8.5

// Expected Output
// Area is 5.6 * 8.5 = 47.60
// Perimeter is 2 * (5.6 + 8.5) = 28.20

// formula area - A = a × b
// formula perimeter  - P = 2 × (a + b)

import java.util.Scanner;

public class MathExercise2{
	public static void main(String[] args) {
		
		// Declare the object and initialize it with the predefined standard input object 
		Scanner sc = new Scanner(System.in);
		
		// Prompting the user to input values in the console and use hasNextXYZ to read the value 
		System.out.print("What is the Height: ");
		double height = sc.nextDouble();
		
		System.out.print("What is the Width: ");
		double width = sc.nextDouble();
		
		//Calculate the area and perimeter of the rectangle 
		double area = height * width;
		double perimeter = 2 * (height + width);
		
		System.out.println("The area is " + height + " * "+ width + " = " + area);
		System.out.println("The perimeter " + 2 + " * " + "(" + height + " + " + width + ")" + " = " + perimeter);
		
		
		
		
	}
}