package kunal;

import java.util.Scanner;
// 8 points
public class HourGlassPattern {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in); // scanner
		System.out.println("Enter an odd number:");

		while (true) {
			int number = input.nextInt();

			if (number % 2 == 0) {
				System.out.printf("Entered digit is an even number.%nTry agin: %n");
			} else { // take care of formatting
				for (int x = 1; x <= number; x++) {
					for (int k = 1; k < x; k++) {
						System.out.print(" ");
						//k++;
					}
					for (int i = x; i <= number; i++) {
						System.out.print("*" + " ");
					}

					System.out.println();
					x++;
				}

				for (int x = number - 1; x >= 1; x--) {

					x--;
					for (int k = 1; k < x; k++) {
						System.out.print("  ");
						k++;
					}
					for (int i = x; i <= number; i++) {
						System.out.print("*" + " ");
					}

					System.out.println();
				}
				break;
			}
		}
		input.close();
	}
}
