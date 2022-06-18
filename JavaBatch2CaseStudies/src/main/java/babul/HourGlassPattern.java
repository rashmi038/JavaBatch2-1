package babul;

import java.util.Scanner;
// formatting needed
// 9 points
public class HourGlassPattern {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Enter a Number: ");
			int input = scanner.nextInt();
			if (input % 2 != 0) {
				int i, j, k;

				for (i = 1; i <= input; i++) {
					if (i % 2 != 0) {
						for (j = 1; j < i; j++) { // add spaces
							System.out.print(" ");
						}
						for (k = i; k <= input; k++) { // add *
							System.out.print("*" + " ");
						}
						System.out.println();
					}
				}
				for (i = input - 1; i >= 1; i--) {
					if (i % 2 != 0) {
						for (j = 1; j < i; j++) {
							System.out.print(" ");
						}
						for (k = i; k <= input; k++) {
							System.out.print("*" + " ");
						}
						System.out.println();
					}
				}

				break;
			} else {
				System.out.println("Entered Number is Even\nPlease Enter an odd Number:");
			}
		}
		scanner.close();
	}

}
