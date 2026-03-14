package thp.tp1;

import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		// Realizá un programa que permita ingresar valores del mismo tipo para las variables num1 y
		// num2. Una vez cargadas, mostrar ambas variables por pantalla, intercambiá sus valores(que
		// lo cargado en num1 quede en num2, y viceversa) y volvéa mostrarlas actualizadas. [EC]

		// Creating scanner
		Scanner scanner = new Scanner(System.in);
		
		// Defining initial variables
		int num1, num2, temporalNumValue;
		
		// Asking for values
		System.out.print("Enter a number for the variable called 'num1': ");
		num1 = Integer.parseInt(scanner.nextLine());
		
		System.out.print("Enter a number for the variable called 'num2': ");
		num2 = Integer.parseInt(scanner.nextLine());
		
		// Showing variable values
		System.out.println();
		System.out.println("The value of 'num1' is: " + num1);
		System.out.println("The value of 'num2' is: " + num2);
		
		// Changing its values
		temporalNumValue = num1;
		num1 = num2;
		num2 = temporalNumValue;
		
		// Showing variable values again
		System.out.println();
		System.out.println("The values have been inverted! 😮");
		System.out.println("The value of 'num1' is: " + num1);
		System.out.println("The value of 'num2' is: " + num2);
		
		// Closing scanner
		scanner.close();
	}
}
