package thp.tp1;

import java.util.Scanner;

public class Exercise_02 {
	public static void main(String[] args) {
		// Realizá un programa que permita ingresar 3 notaspertenecientesatrestrimestresdistintos
		// para cierto alumno de nivel secundario. Debe calcularse y mostrarse la nota promedio. [EC]
		
		// Creating scanner
		Scanner scanner = new Scanner(System.in);

		// Defining initial variables
		final double QUALIFICATIONS_COUNT = 3;
		int firstQualification, secondQualification, thirdQualification;
		double average;

		// Asking qualifications
		System.out.print("Enter the first qualification: ");
		firstQualification = scanner.nextInt();		
		
		System.out.print("Enter the second qualification: ");
		secondQualification = scanner.nextInt();	
		
		System.out.print("Enter the third qualification: ");
		thirdQualification = scanner.nextInt();	
		
		// Making calculation
		average = (firstQualification + secondQualification + thirdQualification) / QUALIFICATIONS_COUNT;
		
		// Showing the result to the user
		System.out.println("The average is: " + average);

		// Closing scanner
		scanner.close();
	}
}
