package arun;

import java.util.Scanner;

// formatting
// 7
public class BankTelleCallerProgram {

	public static Scanner scanner = new Scanner(System.in);

	public static int MainMenu() { // method name? why does it starts with upper case letter
		System.out.println("Press 0 to Exit");
		System.out.println("Press 1 for Loans");
		System.out.println("Press 2 for Savings Account");
		System.out.println("Press 3 for Current Account");
		System.out.println("Press 4 for cards");
		int press = scanner.nextInt();
		return press;
	}

	public static void main(String[] args) {
		int press = MainMenu();
		while (press > 0) {
			switch (press) {
			case 1:
				if (press == 1) {
					System.out.println("Press 1 for Personal Loan");
					System.out.println("Press 2 for Housing Loan");
					System.out.println("Press 3 for Car Loan");
					System.out.println("Press 4 for Gold Loan");
					System.out.println("Press 9 to go Back to Previous Menu");
					press = scanner.nextInt();
					if (press == 1) {
						System.out.println("Thank You For Choossing the Personal Loan");
						press = -1;
					} else if (press == 2) {
						System.out.println("Thank You For Choossing the Housing Loan");
						press = -1;
					} else if (press == 3) {
						System.out.println("Thank You For Choossing the Car Loan");
						press = -1;
					} else if (press == 4) {
						System.out.println("Thank You For Choossing the Gold Loan");
						press = -1;
					} else if (press == 9) {
						press = MainMenu();
					}
				}
				break;

			case 2:
				if (press == 2) {
					System.out.println("Please Enter your Savings Account Number");
					String accountNumber = scanner.next();
					if (accountNumber.matches("\\d{8}")) {
						System.out.println("SucessFully Login!...Thank You for Login your Account");
						System.out.println("-----------------------------------");
						System.out.println("Please Choose the Bellow Correct Options");
						System.out.println("-----------------------------------");
						System.out.println("Press 1 to Shou Your Account Balance");
						System.out.println("Press 2 to Speak Customer Care");
						System.out.println("Press 9 to go Back to Previous Menu");
						press = scanner.nextInt();
						if (press == 1) {
							System.out.println("Your Account Balance is 50,000");
							press = -1;
						} else if (press == 2) {
							System.out.println(
									"Please Wait I Will Connecting Our Customer Care...Thank You For Waiting!!");
							press = -1;
						} else if (press == 9) {
							press = MainMenu();
						}
					} else {
						System.out.println("Please Check?... It's Invalid Account Number...Please Try Again..!");
						System.out.println("--------------------------------------------");
						System.out.println("Press 0 Please Try Again ....!!");
						System.out.println("Press 9 to go Back to Previous Menu");
						int press_zero = scanner.nextInt();
						if (press_zero == 0) {
							System.out.println("Please Enter Your 8 Digit Account Number..");
							accountNumber = scanner.next();
							if (accountNumber.matches("\\d{8}")) {
								System.out.println("SucessFully Login!...Thank You for Login your Account");
								System.out.println("----------------------------------------");
								System.out.println("Press 1 to Shou Your Account Balance");
								System.out.println("Press 2 to Speak Customer Care");
								System.out.println("Press 9 to go Back to Previous Menu");
								press = scanner.nextInt();
								if (press == 1) {
									System.out.println("Your Account Balance is 50,000");
									press = -1;
								} else if (press == 2) {
									System.out.println(
											"Please Wait I Will Connecting Our Customer Care...Thank You For Waiting!!");
									press = -1;
								} else if (press == 9) {
									press = MainMenu();
								}
							}
						}
						if (press_zero == 9) {
							press = MainMenu();
						}
					}
				}
				break;

			case 3:
				if (press == 3) {
					System.out.println("Please Enter your Current Account Number");
					String accountNumber = scanner.next();
					if (accountNumber.matches("\\d{8}")) {
						System.out.println("SucessFully Login!...Thank You for Login your Account");
						System.out.println("-----------------------------------");
						System.out.println("Please Choose the Bellow Correct Options");
						System.out.println("-----------------------------------");
						System.out.println("Press 1 to Shou Your Account Balance");
						System.out.println("Press 2 to Speak Customer Care");
						System.out.println("Press 9 to go Back to Previous Menu");
						press = scanner.nextInt();
						if (press == 1) {
							System.out.println("Your Account Balance is 2,50,000");
							press = -1;
						} else if (press == 2) {
							System.out.println(
									"Please Wait I Will Connecting Our Customer Care...Thank You For Waiting!!");
							press = -1;
						} else if (press == 9) {
							press = MainMenu();
						}
					} else {
						System.out.println("Please Check?... It's Invalid Account Number...Please Try Again..!");
						System.out.println("--------------------------------------------");
						System.out.println("Press 0 Please Try Again ....!!");
						System.out.println("Press 9 to go Back to Previous Menu");
						int press_zero = scanner.nextInt();
						if (press_zero == 0) {
							System.out.println("Please Enter Your 8 Digit Account Number..");
							accountNumber = scanner.next();
							if (accountNumber.matches("\\d{8}")) {
								System.out.println("SucessFully Login!...Thank You for Login your Account");
								System.out.println("----------------------------------------");
								System.out.println("Press 1 to Shou Your Account Balance");
								System.out.println("Press 2 to Speak Customer Care");
								System.out.println("Press 9 to go Back to Previous Menu");
								press = scanner.nextInt();
								if (press == 1) {
									System.out.println("Your Account Balance is 3,50,000");
									press = -1;
								} else if (press == 2) {
									System.out.println(
											"Please Wait I Will Connecting Our Customer Care...Thank You For Waiting!!");
									press = -1;
								} else if (press == 9) {
									press = MainMenu();
								}
							}
						}
						if (press_zero == 9) {
							press = MainMenu();
						}
					}
				}
				break;
			case 4:
				if (press == 4) {
					System.out.println("Press 1 for Credit Card");
					System.out.println("Press 2 for Debit Card");
					press = scanner.nextInt();
					if (press == 1) {
						System.out.println("Please Enter Your Credit Card Number");
						String CcardNumber = scanner.next();
						if (CcardNumber.matches("\\d{16}")) {
							System.out.println("SucessFully Login!...Thank You for Login your Account");
							System.out.println("-----------------------------------");
							System.out.println("Please Choose the Bellow Correct Options");
							System.out.println("-----------------------------------");
							System.out.println("Press 1 to Block Your Card");
							System.out.println("Press 2 to Speak Customer Care");
							System.out.println("Press 9 to go Back to Previous Menu");
							press = scanner.nextInt();
							if (press == 1) {
								System.out.println("Your Card Is Blocked Sucessfully...!Thank You...");
								press = -1;
							} else if (press == 2) {
								System.out.println(
										"Please Wait I Will Connecting Our Customer Care...Thank You For Waitting!!");
								press = -1;
							} else if (press == 9) {
								press = MainMenu();
							}
						} else {
							System.out.println("Please Check?... It's Invalid Account Number...Please Try Again..!");
							System.out.println("--------------------------------------------");
							System.out.println("Press 0 Please Try Again ....!!");
							System.out.println("Press 9 to go Back to Previous Menu");
							int press_zero = scanner.nextInt();
							if (press_zero == 0) {
								System.out.println("Please Enter Your 16 Digit Cerdit Card Number..");
								CcardNumber = scanner.next();
								if (CcardNumber.matches("\\d{16}")) {
									System.out.println("SucessFully Login!...Thank You for Login your Account");
									System.out.println("-----------------------------------");
									System.out.println("Press 1 to Block Your Card");
									System.out.println("Press 2 to Speak Customer Care");
									System.out.println("Press 9 to go Back to Previous Menu");
									press = scanner.nextInt();
									if (press == 1) {
										System.out.println("Your Card Is Blocked Sucessfully...!Thank You...");
										press = -1;
									} else if (press == 2) {
										System.out.println(
												"Please Wait I Will Connecting Our Customer Care...Thank You For Waitting!!");
										press = -1;
									} else if (press == 9) {
										press = MainMenu();
									}
								} else {
									press = -1;
								}
							} else if (press_zero == 9) {
								press = MainMenu();
							}
						}
					} else if (press == 2) {
						System.out.println("Please Enter Your Debit Card Number");
						String DcardNumber = scanner.next();
						if (DcardNumber.matches("\\d{16}")) {
							System.out.println("SucessFully Login!...Thank You for Login your Account");
							System.out.println("-----------------------------------");
							System.out.println("Please Choose the Bellow Correct Options");
							System.out.println("-----------------------------------");
							System.out.println("Press 1 to Block Your Card");
							System.out.println("Press 2 to Speak Customer Care");
							System.out.println("Press 9 to go Back to Previous Menu");
							if (press == 1) {
								System.out.println("Your Card Is Blocked Sucessfully...!Thank You...");
								press = -1;
							} else if (press == 2) {
								System.out.println(
										"Please Wait I Will Connecting Our Customer Care...Thank You For Waitting!!");
								press = -1;
							} else if (press == 9) {
								press = MainMenu();
							}
						} else {
							System.out.println("Please Check?... It's Invalid Account Number...Please Try Again..!");
							System.out.println("--------------------------------------------");
							System.out.println("Press 0 Please Try Again ....!!");
							System.out.println("Press 9 to go Back to Previous Menu");
							int press_zero = scanner.nextInt();
							if (press_zero == 0) {
								System.out.println("Please Enter Your 16 Digit Debit Card Number..");
								DcardNumber = scanner.next();
								if (DcardNumber.matches("\\d{16}")) {
									System.out.println("SucessFully Login!...Thank You for Login your Account");
									System.out.println("-----------------------------------");
									System.out.println("Press 1 to Block Your Card");
									System.out.println("Press 2 to Speak Customer Care");
									System.out.println("Press 9 to go Back to Previous Menu");
									press = scanner.nextInt();
									if (press == 1) {
										System.out.println("Your Card Is Blocked Sucessfully...!Thank You...");
										press = -1;
									} else if (press == 2) {
										System.out.println(
												"Please Wait I Will Connecting Our Customer Care...Thank You For Waitting!!");
										press = -1;
									} else if (press == 9) {
										press = MainMenu();
									}
								}

							}
							if (press_zero == 9) {
								press = MainMenu();
							}
						}
					}
				}
				break;
			default:
				break;
			}
		}
	}
}
