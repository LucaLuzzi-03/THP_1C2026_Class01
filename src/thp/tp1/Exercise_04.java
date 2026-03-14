package thp.tp1;

import java.util.Scanner;

public class Exercise_04 {
	public static void main(String[] args) {
		// Realizá un programa que permita ingresar el **valor monetario de una hora de trabajo** y la
		// **cantidad de horas trabajadas por día** por un trabajador. Debes mostrar el valor del **salario
		// semanal**, sabiendo que trabaja todos los **días hábiles** y la **mitad de las horas del día hábil los
		// sábados**. (Todas las horas valen lo mismo.)
		
		// Creating scanner
		Scanner scanner = new Scanner(System.in);

		// Defining initial variables
		final int BUSINESS_DAYS = 5;
		int workHourMonetaryValue;
		int workHoursPerDay;
		int workHoursPerSaturday;
		int workHoursPerWeek;
		int weeklySalary;
		
		// Asking for the values
		System.out.print("Enter how much you earn for an hour of work: ");
		workHourMonetaryValue = Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		System.out.print("Enter how much hours you work per day: ");
		workHoursPerDay = Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		// Calculating and showing the weekly salary
		workHoursPerSaturday = (workHoursPerDay / 2);
		workHoursPerWeek = (workHoursPerDay * BUSINESS_DAYS) + workHoursPerSaturday;
		weeklySalary = workHourMonetaryValue * workHoursPerWeek;
		System.out.println("Your weekly salary is: " + weeklySalary);
		
		// Closing scanner
		scanner.close();
	}
}
