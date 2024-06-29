
import java.util.Scanner;

public class CountingUp {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter positive number: ");
		
		int a = in.nextInt();
		
		for(int b = 0; b <= a;b++) {
			System.out.println(b);
			sleep(1000);
		}
		in.close();
	}
	private static void sleep(int milliseconds) {
	    try {
	        Thread.sleep(milliseconds);
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	    }
	}

}
