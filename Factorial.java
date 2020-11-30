// Calculate n factorial - n! = 1*2*3* ... * n.

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Factorial {

	public static void main(String args[]) {

		Scanner s = new Scanner(System.in);

		System.out.println("This program calculates n!");
		System.out.println("To procced, enter a natural number greater than zero!");
		System.out.println("If you want to quit the program press any key but a number!");
		System.out.println();
		System.out.print("Type n: ");

		readNum(s);

		System.out.println("You have quit the program.");
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
	}

	private static void readNum(Scanner s) {
		if (s.hasNextInt()) {
			int n = s.nextInt();
				if (n <= 0) {
					System.out.println();
					System.out.println("n has to be greater than zero!");
					System.out.print("Re-type n: ");
					readNum(s);
				}else factorial(n, s);
		}	
	}

	private static void factorial(int n, Scanner s) {
		long nfact = 1;
		for (int i = 1; i <= n; i++) {
			nfact = nfact * i;
		}
		System.out.println();
		System.out.println("The result:");
		System.out.println(n + "! = " + nfact);
		
		System.out.println();
		System.out.println("Do you want to calculate another?");
		System.out.println("Re-type n: ");
		readNum(s);
	}
}
