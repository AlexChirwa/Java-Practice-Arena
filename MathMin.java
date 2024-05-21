
// accepting user input to find the minimum number using the Math.min() method

import java.util.Scanner; 

public class MathMin{
	public static void main(String[] args) {
		
		// Scanner method to allow user input from console 
		Scanner in = new Scanner(System.in);
		
		// prompt the user to input values of the type int (whole numbers) and use hasNextXYZ()
		System.out.print("Input value: ");
		int x = in.nextInt();
		
		System.out.print("Input value: ");
		int y = in.nextInt();
		
		// finding the minimum value 
		System.out.println("Minimum value: " + Math.min(x, y));
	}
}