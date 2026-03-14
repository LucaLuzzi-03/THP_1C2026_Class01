package thp.tp1;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		// Realizá un programa que permita resolver el siguiente problema: Tres personas aportan
		// diferente capital a una sociedad y desean saber el valor total aportado y qué porcentaje
		// aportó cada una (indicando nombre y porcentaje). Solicitar la carga por teclado del nombre
		// de cada socio, su capital aportado y a partir de esto calcular e informar lo requerido
		// previamente

		// Creating scanner
		Scanner scanner = new Scanner(System.in);

		// Defining initial variables
        final int PERCENTAGE_BASE = 100;
        String partner1Name, partner2Name, partner3Name;

        double partner1Capital, partner2Capital, partner3Capital;
        double partner1Percentage, partner2Percentage, partner3Percentage;
        double totalCapital;

        // Asking for values
        System.out.print("Enter the name of the first partner: ");
        partner1Name = scanner.nextLine();

        System.out.print("Enter the capital contributed by the first partner: ");
        partner1Capital = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the name of the second partner: ");
        partner2Name = scanner.nextLine();

        System.out.print("Enter the capital contributed by the second partner: ");
        partner2Capital =Double.parseDouble(scanner.nextLine());

        System.out.print("Enter the name of the third partner: ");
        partner3Name = scanner.nextLine();

        System.out.print("Enter the capital contributed by the third partner: ");
        partner3Capital = Double.parseDouble(scanner.nextLine());
        System.out.println();
        
        // Calculating and showing expected values
        totalCapital = partner1Capital + partner2Capital + partner3Capital;

        partner1Percentage = (partner1Capital / totalCapital) * PERCENTAGE_BASE;
        partner2Percentage = (partner2Capital / totalCapital) * PERCENTAGE_BASE;
        partner3Percentage = (partner3Capital / totalCapital) * PERCENTAGE_BASE;

        System.out.println("Total capital contributed: " + totalCapital);

        System.out.println(partner1Name + " contributed: " + partner1Percentage + "%");
        System.out.println(partner2Name + " contributed: " + partner2Percentage + "%");
        System.out.println(partner3Name + " contributed: " + partner3Percentage + "%");
        
        // Closing scanner
        scanner.close();
	}

}
