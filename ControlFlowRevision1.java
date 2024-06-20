/* Date: 18.6.2024
 * author: Alex Joshua Chirwa
 * Revision of Control Flow in Java 
 * (if..else, switch, while loops, do-while loops, for-loops and for-each loops)
 */

package exercises;
import java.util.Scanner;

public class Revision {
	public static void main(String[] args) {
		
		// Question 1: if-else Statement
		/*
		 * Write a Java program that prompts the user to enter their age.
		 * if the age is greater than or equal to 18, print "You are an adult",
		 * otherwise print "You are a minor".
		 */
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your age:");
		
		int age = in.nextInt();
		System.out.println("Enter your age: " + age);
		
		if(age > 18) {
			System.out.println("You are an adult");
		}else {
			System.out.println("You are a minor");
		}
		return;
		
	}

}
