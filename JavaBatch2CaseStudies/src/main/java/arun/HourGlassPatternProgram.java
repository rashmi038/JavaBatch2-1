package arun;

import java.util.Scanner;
// 9 points
public class HourGlassPatternProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Number: ");
		int number = scanner.nextInt();
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (int j = 1; j <= number * 2 - 1; j++) {
				if (i <= j && j + j <= number * 2) 
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 2; i <= number; i++) {
			if (i % 2 == 0) {
				continue;
			}
			for (int j = 1; j <= number * 2 - 1; j++) {
				if (i + j >= number + 1 && j - 1 <= number - 1)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
