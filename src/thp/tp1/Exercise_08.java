package thp.tp1;

import java.util.Scanner;

public class Exercise_08 {
	public static void main(String[] args) {
		// Realizá un programa que permita ingresar dos números naturales. Debes mostrar los
		// resultados para las 4 operaciones matemáticas básicas con los números ingresados. [EC]
		
		// Creating scanner
		Scanner scanner = new Scanner(System.in);

		// Ask the first number
		System.out.print("Enter the first number: ");
		int firstNumber = Integer.parseInt(scanner.nextLine());

		// Ask the second number
		System.out.print("Enter the second number: ");
		int secondNumber = Integer.parseInt(scanner.nextLine());

		// Making and showing the calculations
		int sumResult = firstNumber + secondNumber;
		int subtractResult = firstNumber - secondNumber;
		int multiplicationResult = firstNumber * secondNumber;
		int divisionResult = firstNumber / secondNumber;

		// Show the result to the user
		System.out.println();
		System.out.println("The result of the sum is: " + sumResult);
		System.out.println("The result of the substraction is: " + subtractResult);
		System.out.println("The result of the multiplication is: " + multiplicationResult);
		System.out.println("The result of the division is: " + divisionResult);

		// Closing scanner to free space and resources
		scanner.close();
	}
}
