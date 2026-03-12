package thp.tp1;

import java.util.Scanner;

public class MyFirstProgram {
	public static void main(String[] args) {
		
		// Defining scanner for reading
		Scanner scanner = new Scanner(System.in);
		
		// Instruction for printing with a blank line to separate output
		System.out.println("Hello world!");
		
		// Defining variables
		String userName = "Luca Luzzi";
		int age = 19;
		
		// Printing variables
		System.out.println(userName);
		System.out.println(age);
		
		// Instruction for printing all together
		System.out.print("This is another text");
		System.out.println();
		
		// Parsing from string to integer
		System.out.print("Please, enter a number: ");
		String numberStr = scanner.nextLine();
		int number = Integer.parseInt(numberStr);
		System.out.println(number + " is now a number!");
		
		// Closing scanner to free space and resources
		scanner.close();
	}
}
