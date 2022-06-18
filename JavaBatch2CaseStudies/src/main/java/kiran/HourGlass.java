package kiran;

import java.util.Scanner;

// 8 points
public class HourGlass {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows to print:");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt(); 

		if (row % 2 != 0) {
			for (int i = 1; i <= row; i++) {
				if (i % 2 == 0) {
					continue;
				}
				for (int k = 2; k <= i - ((i / 2)); k++) {
					System.out.print(" ");
				}

				for (int j = 1; j <= row - i + 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			for (int i = row - 1; i >= 1; i--) {
				if (i % 2 == 0) {
					continue;
				}

				for (int k = 2; k <= i - ((i / 2)); k++) {
					System.out.print(" ");
				}
				for (int j = i; j <= row; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		} else {
			System.out.println("only odd number is allowed");
		}
	}
}
