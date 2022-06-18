package kiran;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
// 8 points
public class BankCustomerCare {
	public static void main(String[] args) {
		customerCareMenu(); // name is not logical
	}

	private static void customerCareMenu() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(0, "exit"); // Put elements in Map
		map.put(1, "loans/" + "personal loans");
		map.put(2, "housing loans");
		map.put(3, "car loan");
		map.put(4, "gold loan");

		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println("press" + m.getKey() + " " + m.getValue());
		}

		System.out.println("please enter the option");
		Scanner input = new Scanner(System.in);
		int press = input.nextInt();

		switch (press) {
		case 0:
			System.out.println("Exit From Customer Care");
			break;
		case 1:
			loans();
			break;
		case 2:
			savingAccount();
			break;
		case 3:
			currentAccount();
			break;
		case 4:
			cards();
			break;
		}
	}

	private static void savingAccount() {
		System.out.println("please enter your savings account number");
		Scanner number = new Scanner(System.in);
		String a = number.nextLine();
		if (a.matches("\\d{8}")) {

			HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
			// Put elements in Map
			map.put(1, "show account balance");
			map.put(2, "to speak with customer care");
			map.put(9, "go back to customer care menu");

			for (Entry<Integer, String> m : map.entrySet()) {
				System.out.println("press" + m.getKey() + " " + m.getValue());
			}
			// System.out.println("Thank you for account number\n" +"press 1 to show account
			// balance\n"+ "press 2 to speak customer care\n" +"press 9 to go back to
			// previous menu");
			int x = number.nextInt();
			switch (x) {
			case 1:
				System.out.println("show account balance");
				break;
			case 2:
				System.out.println("customer care Number 123445676");
				break;
			case 3:
				customerCareMenu();
				break;
			case 9:
				customerCareMenu();
				break;
			}
		} else {

			HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
			map.put(0, "try again"); // Put elements in Map
			map.put(2, "to go back to customer care menu");

			for (Entry<Integer, String> m : map.entrySet()) {
				System.out.println("press" + m.getKey() + " " + m.getValue());
			}

			// System.out.println("Invalid account number, Press 0 to try again or Press 9
			// to go back to previous menu");
			Scanner numbers = new Scanner(System.in);
			int b = numbers.nextInt();
			if (b == 0) {
				savingAccount();
			} else if (b == 9) {
				customerCareMenu();
			}
		}
	}

	private static void loans() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "personal loan"); // Put elements in Map
		map.put(2, "housing loan");
		map.put(3, "car loan");
		map.put(4, "gold loan");
		map.put(9, "to go back to customer care menu");

		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println("press" + m.getKey() + " " + m.getValue());
		}
		System.out.println("press 1 for personal loan\n" + "press 2 for housing loan\n" + "press 3 for car loan\n"
				+ "press 4 for gold loan\n" + "press 9 to go back to previous menu");
		Scanner savings = new Scanner(System.in);
		int savingsInput = savings.nextInt();

		switch (savingsInput) {
		case 1:
			System.out.println("personal loan");
			break;
		case 2:
			System.out.println("housing loan");
			break;
		case 3:
			System.out.println("car loan");
			break;
		case 4:
			System.out.println("gold loan");
			break;
		case 9:
			customerCareMenu();
			break;
		}
	}

	private static void currentAccount() {
		System.out.println("please enter your current account number");
		Scanner number = new Scanner(System.in);
		String a = number.nextLine();

		if (a.matches("\\d{8}")) {

			HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
			// map.put(0,"exit"); //Put elements in Map
			map.put(1, "to show account balance");
			map.put(2, "to speak with customer care");
			map.put(9, "to go back to customer care menu");

			for (Entry<Integer, String> m : map.entrySet()) {
				System.out.println("press" + m.getKey() + " " + m.getValue());
			}
			// System.out.println("Thank you for account number\n" +"press 1 to show account
			// balance\n"+ "press 2 to speak customer care\n" +"press 9 to go back to
			// previous menu");
			int y = number.nextInt();
			switch (y) {
			case 1:
				System.out.println("show account balance");
				break;
			case 2:
				System.out.println("customer care number 123456789");
				break;
			case 3:
				customerCareMenu();
				break;
			case 9:
				customerCareMenu();
				break;
			}
		} else {
			System.out.println("Invalid account number, Press 0 to try again or Press 9 to go back to previous number");
			Scanner numbers = new Scanner(System.in);
			int b = numbers.nextInt();
			if (b == 0) {
				currentAccount();
			} else if (b == 9) {
				customerCareMenu();
			}
		}
	}

	private static void cards() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "credit card"); // Put elements in Map
		map.put(2, "debit card");

		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println("press" + m.getKey() + " " + m.getValue());
		}

		System.out.println("press 1 for credit card\n" + "press 2 for debit card\n");
		Scanner input = new Scanner(System.in);
		int press = input.nextInt();

		switch (press) {
		case 1:
			creditCard();
			break;
		case 2:
			debitCard();
			break;
		}
	}

	private static void debitCard() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "to block your card"); // Put elements in Map
		map.put(1, "to speak with customer care");
		map.put(2, "to go back to customer care menu");

		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println("press" + m.getKey() + " " + m.getValue());
		}
		System.out.println("please enter your credit card number");
		Scanner number = new Scanner(System.in);
		String a = number.nextLine();

		if (a.matches("\\d{16}")) {
			System.out.println("Thank you for account number\n" + "press 1 to block your card\n"
					+ "press 2 to speak customer care\n" + "press 9 to go back to customer care menu");
			int y = number.nextInt();
			switch (y) {
			case 1:
				System.out.println("card is blokced");
				break;
			case 2:
				System.out.println("customer care number 123456789");
				break;
			case 9:
				customerCareMenu();
				break;
			}
		}
	}

	private static void creditCard() {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "to block your card"); // Put elements in Map
		map.put(1, "to speak with customer care");
		map.put(2, "to go back to customer care menu");

		for (Entry<Integer, String> m : map.entrySet()) {
			System.out.println("press" + m.getKey() + " " + m.getValue());
		}
		System.out.println("please enter your debit card number");
		Scanner number = new Scanner(System.in);
		String a = number.nextLine();

		if (a.matches("\\d{16}")) {
			System.out.println("Thank you for account number\n" + "press 1 to block your card\n"
					+ "press 2 to speak customer care\n" + "press 9 to go back to customer care menu");
			int y = number.nextInt();
			switch (y) {
			case 1:
				System.out.println("card is blocked");
				break;
			case 2:
				System.out.println("customer care number 123456789");
				break;
			case 9:
				customerCareMenu();
				break;
			}
		}
	}
}