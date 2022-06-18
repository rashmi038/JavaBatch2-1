package vishal;

import java.util.Scanner;
// 8 points
public class BankTeleCaller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputFromCustomer;
		do {
			System.out.println("Press 0 to exit");
			System.out.println("Press 1 for Loan");
			System.out.println("Press 2 for Saving account");
			System.out.println("Press 3 for Current acount");
			System.out.println("Press 4 for Card");

			inputFromCustomer = scanner.nextInt();
			if (inputFromCustomer == 0) {
				break;
			} else if (inputFromCustomer == 1) {
				System.out.println("Press 1 for personal loan");
				System.out.println("Press 2 forhousing loan");
				System.out.println("Press 3 for car loan");
				System.out.println("Press 4 for gold loan");
				System.out.println("Press 9 to go back to previous menue");
				inputFromCustomer = scanner.nextInt();
				if (inputFromCustomer == 9) {
					continue;
				}
			} else if (inputFromCustomer == 2) {

				do {
					System.out.println("Please enter your saving account number");
					String savingAccountNumber = scanner.next();
					String regex = "\\d{8}";
					if (savingAccountNumber.matches(regex) == true) {
						System.out.println("Thank you for account number");
						System.out.println("________________________________");
						System.out.println("Press 1 to show account balence");
						System.out.println("Press 2 to speak customer care");
						System.out.println("Press 9 to go back to the previous menue");
						inputFromCustomer = scanner.nextInt();
						if (inputFromCustomer == 9) {
							break;
						}
					} else {
						System.out.println("Invalid account number");
						System.out.println("Press 0 to try again");
						System.out.println("Press 9 to go back to previous menue");
						inputFromCustomer = scanner.nextInt();
						if (inputFromCustomer == 0) {
							continue;
						} else if (inputFromCustomer == 9) {
							break;
						}
					}

				} while (inputFromCustomer != 5);

			} else if (inputFromCustomer == 3) {
				do {
					System.out.println("Please enter your current account number");
					String currentAccountNumber = scanner.next();
					String regex = "\\d{8}";
					if (currentAccountNumber.matches(regex) == true) {
						System.out.println("Thank you for account number");
						System.out.println("_______________________________");
						System.out.println("Press 1 to show account balence");
						System.out.println("Press 2 to speak customer care");
						System.out.println("Press 9 to go back to the previous menue");
						inputFromCustomer = scanner.nextInt();
						if (inputFromCustomer == 9) {
							break;
						}
					} else {
						System.out.println("Invalid account number");
						System.out.println("Press 0 to try again");
						System.out.println("Press 9 to go back to previous menue");
						inputFromCustomer = scanner.nextInt();
						if (inputFromCustomer == 0) {
							continue;
						} else if (inputFromCustomer == 9) {
							break;
						}

					}

				} while (inputFromCustomer != 5);

			} else if (inputFromCustomer == 4) {
				System.out.println("Press 1 for credit card");
				System.out.println("Press 2 for debit card");
				inputFromCustomer = scanner.nextInt();
				if (inputFromCustomer == 1) {
					do {
						System.out.println("Please enter your credit card number");
						String creditCardNumber = scanner.next();
						String regex = "\\d{16}";
						if (creditCardNumber.matches(regex) == true) {
							System.out.println("Thank you for card number");
							System.out.println("__________________________");
							System.out.println("Press 1 to block your card");
							System.out.println("Press 2 to speak customer care");
							System.out.println("Press 9 to go back to the previous menue");
							inputFromCustomer = scanner.nextInt();
							if (inputFromCustomer == 9) {
								break;
							}
						} else {
							System.out.println("Invalid account number");
							System.out.println("Press 0 to try again");
							System.out.println("Press 9 to go back to previous menue");
							inputFromCustomer = scanner.nextInt();
							if (inputFromCustomer == 0) {
								continue;
							} else if (inputFromCustomer == 9) {
								break;
							}
						}

					} while (inputFromCustomer != 5);

				} else if (inputFromCustomer == 2) {
					do {
						System.out.println("Please enter your debit card number");
						String debitCardNumber = scanner.next();
						String regex = "\\d{16}";
						if (debitCardNumber.matches(regex) == true) {
							System.out.println("Thank you for card number");
							System.out.println("__________________________");
							System.out.println("Press 1 to block your card");
							System.out.println("Press 2 to speak customer care");
							System.out.println("Press 9 to go back to the previous menue");
							inputFromCustomer = scanner.nextInt();
							if (inputFromCustomer == 9) {
								break;
							}
						} else {
							System.out.println("Invalid card number");
							System.out.println("Press 0 to try again");
							System.out.println("Press 9 to go back to previous menue");
							inputFromCustomer = scanner.nextInt();
							if (inputFromCustomer == 0) {
								continue;
							} else if (inputFromCustomer == 9) {
								break;
							}
						}

					} while (inputFromCustomer != 5);

				}

			}

		} while (inputFromCustomer != 0);
		scanner.close();
	}

}
