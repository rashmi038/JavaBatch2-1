package kunal;

import java.util.Scanner;
// 7 points
public class BankHelplineCaller {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Press 0 to exit.");
			System.out.println("Press 1 to Loan.");
			System.out.println("Press 2 to Savings Account.");
			System.out.println("Press 3 to Current Account.");
			System.out.println("Press 4 to Cards.");
			int mainOption = sc.nextInt();

			if (mainOption == 0) { // Exit
				System.out.println("Thank You.");
				break;
			} else if (mainOption == 1) { // Loan options
				while (true) {
					System.out.println("press 1 for Personal loan");
					System.out.println("press 2 for Housing loan");
					System.out.println("press 3 for Car loan");
					System.out.println("press 4 for Gold loan");
					System.out.println("press 9 to go back to previous menu");
					int loanOption = sc.nextInt();

					if (loanOption == 1) {
						System.out.println("You have selected for Personal Loan.");
					} else if (loanOption == 2) {
						System.out.println("You have selected for Housing Loan.");
					} else if (loanOption == 3) {
						System.out.println("You have selected for Car Loan.");
					} else if (loanOption == 4) {
						System.out.println("You have selected for Gold Loan.");
					} else if (loanOption == 9) {
						break;
					} else {
						System.out.println("Invalid Choice");
					}
				}

			} else if (mainOption == 2) { // Savings Account Options
				System.out.print("Please enter 8 digit Savings Account number:");

				int isValidSavingsAccountNumber = 0;
				// Validation for Savings Account NUmber
				do {
					long savingsAccountNumber = sc.nextLong();
					int length = String.valueOf(savingsAccountNumber).length();
					int flag;
					if (length != 8) {
						System.out.println("The savings account number you entered is invalid.");
						System.out.println("Press 0 to try again or Press 9 to go back.");
						while (true) {
							int retryOption = sc.nextInt();

							if (retryOption == 0) {
								System.out.println("Enter account number again");
								flag = 0;
								break;
							} else if (retryOption == 9) {
								flag = 1;
								break;
							} else {
								System.out.printf("Invalid Option.%nPress 0 to try again or Press 9 to go back.%n");
							}
						}
						if (flag == 1) {
							break;
						}

					} else {
						isValidSavingsAccountNumber = 1;
					}
				} while (isValidSavingsAccountNumber == 0);

				if (isValidSavingsAccountNumber == 1) {
					System.out.println("Thank you for savings account number");
					while (true) {
						System.out.println("Press 1 to show account balance.");
						System.out.println("Press 2 to speak with customer care.");
						System.out.println("Press 9 to go back");
						int savingsAccountOptions = sc.nextInt();

						if (savingsAccountOptions == 1) {
							System.out.println("Showing savings account balance.");
						} else if (savingsAccountOptions == 2) {
							System.out.println("You have selected to speak with customer care.");
						} else if (savingsAccountOptions == 9) {
							break;
						} else {
							System.out.println("Invalid Choice");
						}
					}
				}

			} else if (mainOption == 3) { // Current Account Options
				System.out.print("Please enter 8 digit Current Account number:");
				// Validation for Current Account number
				int isValidCurrentAccountNumber = 0;
				do {
					long currentAccountNumber = sc.nextLong();
					int length = String.valueOf(currentAccountNumber).length();
					int flag;
					if (length != 8) {
						System.out.println("The current account number you entered is invalid.");
						System.out.println("Press 0 to try again or Press 9 to go back.");
						while (true) {
							int retryOption = sc.nextInt();

							if (retryOption == 0) {
								System.out.println("Enter account number again");
								flag = 0;
								break;
							} else if (retryOption == 9) {
								flag = 1;
								break;
							} else {
								System.out.printf("Invalid Option.%nPress 0 to try again or Press 9 to go back.%n");
							}
						}
						if (flag == 1) {
							break;
						}

					} else {
						isValidCurrentAccountNumber = 1;
					}
				} while (isValidCurrentAccountNumber == 0);

				if (isValidCurrentAccountNumber == 1) {
					System.out.println("Thank you for current account number");
					while (true) {
						System.out.println("Press 1 to show account balance.");
						System.out.println("Press 2 to speak with customer care.");
						System.out.println("Press 9 to go back");
						int currentAccountOptions = sc.nextInt();

						if (currentAccountOptions == 1) {
							System.out.println("Showing current account balance.");
						} else if (currentAccountOptions == 2) {
							System.out.println("You have selected to speak with customer care.");
						} else if (currentAccountOptions == 9) {
							break;
						} else {
							System.out.println("Invalid Choice");
						}
					}
				}

			} else if (mainOption == 4) { // Cards Options
				while (true) {
					System.out.println("Press 1 for Credit Cards Facilities.");
					System.out.println("Press 2 for Debit Cards Facilities.");
					System.out.println("Press 9 to go back to previous menu.");
					int cardOptions = sc.nextInt();

					if (cardOptions == 1) { // Credit Cards
						System.out.println("Please enter your 16 digit Credit Card number.");
						int isValidCreditCardNumber = 0;
						// Validation for Credit Card number
						do {
							long creditCardNumber = sc.nextLong();
							int length = String.valueOf(creditCardNumber).length();
							int flag;
							if (length != 16) {
								System.out.println("The credit card number you entered is invalid.");
								System.out.println("Press 0 to try again or Press 9 to go back.");
								while (true) {
									int retryOption = sc.nextInt();

									if (retryOption == 0) {

										System.out.println("Enter card number again");
										flag = 0;
										break;
									} else if (retryOption == 9) {
										flag = 1;
										break;
									} else {
										System.out.printf(
												"Invalid Option.%nPress 0 to try again or Press 9 to go back.%n");
									}
								}
								if (flag == 1) {
									break;
								}

							} else {
								isValidCreditCardNumber = 1;
							}
						} while (isValidCreditCardNumber == 0);

						if (isValidCreditCardNumber == 1) {
							System.out.println("Thank you for the credit card number.");
							while (true) {
								System.out.println("press 1 to block your credit card");
								System.out.println("press 2 to speak with customer care");
								System.out.println("press 9 to go back to previous menu");
								int creditCardOptions = sc.nextInt();

								if (creditCardOptions == 1) {
									System.out.println("You have selected to block the card.");
								} else if (creditCardOptions == 2) {
									System.out.println("You have selected to speak with customer care.");
								} else if (creditCardOptions == 9) {
									break;
								} else {
									System.out.println("Invalid Choice");
								}
							}
						}

					} else if (cardOptions == 2) { // Debit Cards
						System.out.println("Please enter your 16 digit Debit Card number.");
						int isValidDebitCardNumber = 0;
						// Validation for Debit Card number
						do {
							long debitCardNumber = sc.nextLong();
							int length = String.valueOf(debitCardNumber).length();
							int flag;
							if (length != 16) {
								System.out.println("The debit card number you entered is invalid.");
								System.out.println("Press 0 to try again or Press 9 to go back.");
								while (true) {
									int retryOption = sc.nextInt();

									if (retryOption == 0) {
										System.out.println("Enter card number again");
										flag = 0;
										break;
									} else if (retryOption == 9) {
										flag = 1;
										break;
									} else {
										System.out.printf(
												"Invalid option.%nPress 0 to try again or Press 9 to go back.%n");
									}
								}
								if (flag == 1) {
									break;
								}

							} else {
								isValidDebitCardNumber = 1;
							}
						} while (isValidDebitCardNumber == 0);

						if (isValidDebitCardNumber == 1) {
							System.out.println("Thank you for the debit card number.");

							while (true) {
								System.out.println("press 1 to block your debit card");
								System.out.println("press 2 to speak with customer care");
								System.out.println("press 9 to go back to previous menu");
								int debitCardOptions = sc.nextInt();

								if (debitCardOptions == 1) {
									System.out.println("You have selected to block the card.");
								} else if (debitCardOptions == 2) {
									System.out.println("You have selected to speak with customer care.");
								} else if (debitCardOptions == 9) {
									break;
								} else {
									System.out.println("Invalid Choice");
								}
							}
						}
					} else if (cardOptions == 9) {
						break;
					} else {
						System.out.println("Invalid Choice.");
					}
				}

			} else {
				System.out.printf("%nInvalid.Please select a valid option.%n%n");
			} // Invalid Option
		}
		sc.close();
	}
}
