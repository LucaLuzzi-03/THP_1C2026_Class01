package thp.tp1;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		// Realizá un programa que permita que el usuario ingrese su nombre .El programa debe emitir
		// una salida con un mensaje de bienvenida que incluya el nombre ingresado. [EC]

		// Creating scanner
		Scanner scanner = new Scanner(System.in);
		
		// Asking to the user its name
		System.out.print("Ingrese su nombre: ");
		String userName = scanner.nextLine();
		
		// Giving him a welcome
		System.out.println();
		System.out.println("Bienvenido " + userName + "!");
		
		// Closing scanner
		scanner.close();
	}

}
