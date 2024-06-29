
import java.util.Scanner;

public class CountingDown {
	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		
		int num = out.nextInt();
		
		for(int x = num;x >= 0;x--) {
			System.out.println(x);
			sleep(1000);
		}
		out.close();
	}
	private static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		}catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
