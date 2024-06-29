/*
Date: 6.29.2024
Author: Chirwa Alex Joshua
*/
import java.util.Scanner;

public class CountingDown {
	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		
		int num = out.nextInt();
		
		for(int x = num;x >= 0;x--) {
			System.out.println(x);
			sleep(1000);// this ensures the counting of numbers one at a time in the console
		}
		out.close(); // Close Scanner
	}
	/*
        This method pauses the execution of the program for the specified number of milliseconds. 
        The Thread.sleep method is used to introduce the delay.
        */
	private static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
