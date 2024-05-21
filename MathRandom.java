
// accepting user input to run a certain range of values using the Math.random() method

import java.util.Scanner;

public class MathRandom{
	public static void main(String[] args) {
		
		// Using Scanner method to accept user input 
		Scanner in = new Scanner(System.in);
		
		// Prompt the user to enter range starting from 0 (using in type)
		// use hasNextXYZ to read user input
		System.out.print("Enter range limit: ");
		int range = in.nextInt();
		
		/* for us to add range limit we need to use this form:
		 * 
		 * type variableName = (type)(Math.random()*range);
		 * 
		 */
		
		int random = (int)(Math.random()*range);
		System.out.println("Range limit: " + range + " \nrandom number: " + random);
	}
}