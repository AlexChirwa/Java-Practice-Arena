// Date 5.23.2024

// In this java file I will be tackling several questions under conditional statements 


/* Question 1
 * Write a Java program to get a number from the user and print whether it is positive or negative.
 * Test Data
 * Input number: 35
 * Expected Output :
 * Number is positive
*/

// import java.util.*
import java.util.Scanner;

public class ConditionalStatements{
	public static void main(String[] args) {
		
		
		// Accepting User input from the console
		Scanner in = new Scanner(System.in);
		
		// Prompt user to input number with the use of hasNextXYZ()
		System.out.print("Input number: ");
		int num = in.nextInt();
		
		// to know whether the number is negative or positive we use zero as our ground point between - and +. 
		
		//if...else condition statement 
		if(num > 0) {
			System.out.println("Number is positive");
		}else if(num < 0) {
			System.out.println("Number is negative");
		}else {
			return;
		}
						
	}
}
