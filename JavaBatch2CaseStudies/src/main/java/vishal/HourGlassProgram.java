package vishal;

import java.util.Scanner;
// 9 points
public class HourGlassProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputFromUser;
		do {
			System.out.println("Enter the hour to print");
			inputFromUser = scanner.nextInt();
			if (inputFromUser % 2 == 0) {
				System.out.println("invalid input try with odd number");
				System.out.println("Press 9 to try again");
				System.out.println("Press 0 to close");
				inputFromUser = scanner.nextInt();
				if (inputFromUser == 9) {
					continue;
				} else if (inputFromUser == 0) {
					break;
				}
			} else {
				for (int i = 1; i <= inputFromUser; i++) {
					if (i % 2 != 0) {
						for (int j = 1; j <= i; j++) {
							System.out.print(" ");
						}
						for (int k = i; k <= inputFromUser; k++) {
							System.out.print("* ");
						}
						System.out.println();
					}
				}
				for (int i = inputFromUser - 1; i >= 1; i--) {
					if (i % 2 != 0) {
						for (int k = 1; k <= i; k++) {
							System.out.print(" ");
						}
						for (int j = i; j <= inputFromUser; j++) {
							System.out.print("* ");
						}
						System.out.println();
					}

				}

			}

		} while (inputFromUser != 0);
		scanner.close();
	}
}