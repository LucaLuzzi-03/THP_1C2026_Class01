package thp.tp1;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		// Realizá un programa que permita ingresar el ancho y el largo de un terreno en metros y el
		// valor del metro cuadrado de tierra. Debe mostrarse el valor total del terreno y la cantidad de
		// metros de alambre para cercarlo completamente a tres alturas distintas.

		// Creating scanner
		Scanner scanner = new Scanner(System.in);

		// Defining initial variables
		final int WIRE_TURNS = 3, RECTANGLE_SIDES = 2;
		int widthMeters, heightMeters, squareMeterValue, earthTotalValue, perimeter, wire;	
		
		// Asking for the values
		System.out.print("Enter the width of the earth: ");
		widthMeters = Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		System.out.print("Enter the height of the earth: ");
		heightMeters = Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		System.out.print("Enter the value of the square meter: ");
		squareMeterValue = Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		// Calculating and showing expected values
		earthTotalValue = (widthMeters * heightMeters) * squareMeterValue;
		System.out.println("The total value of earth is: " + earthTotalValue);
		
		perimeter = RECTANGLE_SIDES * (widthMeters + heightMeters);
		wire = WIRE_TURNS * perimeter;
		System.out.println("Total wire needed is: " + wire);
				
		// Closing scanner
		scanner.close();
	}

}
