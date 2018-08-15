package cameronandvirginia;

import java.util.Scanner;

public class PrimeNumbersApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int position;
		String wantsToContinue = "n";

		do {
			System.out.println("Let's locate some primes!");
			System.out.println("This application will find you any prime, in order, from first prime number on."
					+ "Which prime number are you looking for?");
			position = scan.nextInt();
			System.out.println("The number " + position + " prime is " + PrimeNumberMethod.getNthPrime(position) + ".");
			System.out.println("Do you want to find another prime number? (y/n)");
		} while (wantsToContinue.equals("y"));

		System.out.println("Goodbye");
	}

}
