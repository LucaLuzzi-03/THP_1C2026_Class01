package thp.tp1;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {
		// Realizá un programa que permita ingresar el **monto total de las ventas** realizadas por un
		// vendedor durante el mes, de quien se sabe que gana un **sueldo fijo de 44000 pesos** más el **16
		// por ciento** del monto total vendido. Con tales datos debes calcular y mostrar el importe a
		// cobrar por el vendedor.

		// Creating scanner
		Scanner scanner = new Scanner(System.in);	
		// Defining initial variables
		final int BASE_SALARY = 44_000;
		final double TOTAL_SOLD_COMMISSION_PERCENTAGE = 0.16;
		double totalSoldCommissionMoney;
		double totalSoldMoney;
		double workerSalary;
		// Asking for values
		System.out.print("Enter the amount of money you made from sold products this month: ");
		totalSoldMoney = Integer.parseInt(scanner.nextLine());
		System.out.println();
		
		// Calculating and showing worker salary
		totalSoldCommissionMoney = totalSoldMoney * TOTAL_SOLD_COMMISSION_PERCENTAGE;		workerSalary = BASE_SALARY + totalSoldCommissionMoney;
		System.out.println("Your salary this month is: " + workerSalary);
		
		// Closing scanner
		scanner.close();
	}
}
