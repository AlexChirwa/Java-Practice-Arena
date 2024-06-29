/*
Date: 6.29.2024
Author: Chirwa Alex Joshua
*/
import java.util.Scanner;

public class CountingUp {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter positive number: ");
		
		int a = in.nextInt();
		
		for(int b = 0; b <= a;b++) {
			System.out.println(b);
			sleep(1000);// this ensures the counting of numbers one at a time in the console
		}
		in.close(); // Close Scanner
	}
	/*
        This method pauses the execution of the program for the specified number of milliseconds. 
        The Thread.sleep method is used to introduce the delay.
        */
	private static void sleep(int milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	}

}
