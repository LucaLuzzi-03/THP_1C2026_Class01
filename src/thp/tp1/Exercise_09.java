package thp.tp1;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		// Realizá un programa que permita ingresar dos números que representan las medidas en
		// grados de dos ángulos interiores de cierto triángulo. A partir de los valores de estos dos
		// ángulos el programa debe mostrar el valor en grados del ángulo restante. Recordá que la
		// suma de los ángulos interiores de todo triángulo es de 180º

		// Creating scanner
		Scanner scanner = new Scanner(System.in);

		// Defining initial variables
        final int TRIANGLE_ANGLE_SUM = 180;
        int firstAngle, secondAngle, remainingAngle;

        // Asking for values
        System.out.print("Enter the first angle in degrees: ");
        firstAngle = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the second angle in degrees: ");
        secondAngle = Integer.parseInt(scanner.nextLine());

        // Calculating and showing the expected result
        remainingAngle = TRIANGLE_ANGLE_SUM - (firstAngle + secondAngle);
        System.out.println("The remaining angle of the triangle is: " + remainingAngle + " degrees");
        
        // Closing scanner
        scanner.close();
	}

}
