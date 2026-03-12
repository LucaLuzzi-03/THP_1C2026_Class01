package thp.tp1;

import java.util.Scanner;

public class Exercise_03 {
	public static void main(String[] args) {
		//  Realizá un programa que permita ingresar un número entero. Debe mostrarse el número ingresado:
		// a. Multiplicado por 5.
		// b. Dividido por 2.
		
		// Creating scanner
		Scanner scanner = new Scanner(System.in);

		// Defining initial variables
		final int MULTIPLAY_BY_FIVE = 5;
		final double DIVIDED_BY_TWO = 2;
		int number;

		// Asking a number
		System.out.print("Enter a number: ");
		number = scanner.nextInt();

		// Showing the result to the user
		System.out.println("The number multiply by five is: " + (number * MULTIPLAY_BY_FIVE));
		System.out.println("The number divided by two is: " + (number / DIVIDED_BY_TWO));

		// Closing scanner
		scanner.close();
	}
}
