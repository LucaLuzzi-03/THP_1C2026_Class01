package thp.tp1;

import java.util.Scanner;

public class SumCalculator {
	public static void main(String[] args) {
		
		// Creating scanner
		Scanner scanner = new Scanner(System.in);
		
		// Here starts the program
		System.out.println("------------------- Lest´s sum two numbers!!! -------------------");

		// Ask the first number
		System.out.print("Enter the first number: ");
		double firstNumber = scanner.nextDouble();

		// Ask the second number
		System.out.print("Enter the second number: ");
		double secondNumber = scanner.nextDouble();

		// Making the calculation
		double result = firstNumber + secondNumber;

		// Show the result to the user
		System.out.println();
		System.out.println("The result is: " + result);
		System.out.println("Thank you for participating!");

		// Closing scanner to free space and resources
		scanner.close();
	}
}
