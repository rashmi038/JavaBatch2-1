package rashmi;

import java.util.Scanner;

public class Calculators implements Operations{
	public static void main(String args[]) {
		double a, b, c = 0;
		int operation;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value:");
		a = getInt(scanner);
		System.out.println("enter b Value:");
		b = getInt(scanner);
		System.out.println("Choices are here:");

		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Percentage");
		System.out.println("6. Modulous");
		System.out.println("Enter Your Choice");
		operation = (int) getInt(scanner);

		scanner.close();

		switch (operation) {
		case 1:
			c = Operations.add(a, b);
			break;
		case 2:
			c = Operations.sub(a, b);
			break;
		case 3:
			c = Operations.mul(a, b);
			break;
		case 4:
			c = Operations.div(a, b);
			break;
		case 5:
			c = Operations.percentage(a, b);
			break;
		case 6:
			c = Operations.mod(a, b);
			break;
		}
		System.out.println("RESULT:" + c);
	}

	static double getInt(Scanner scanner) {

		return scanner.nextDouble();
	}
}
