package babul;

import java.util.Scanner;
// 7
public class BankTeleCaller {
	
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("press 0 to Exit");
			System.out.println("press 1 for Loans");
			System.out.println("press 2 for Savings account");
			System.out.println("press 3 for Current account");
			System.out.println("press 4 for Cards");
			int bankTelecallerOption = scanner.nextInt();
			
			if (bankTelecallerOption==0) {
				System.out.println("Exit\nThank You");
				break;
			
			} else if (bankTelecallerOption==1) {												//Loan Section
				System.out.println("You entered for Loans");
				while (true) {
					System.out.println("press 1 for personal loan");
					System.out.println("press 2 for housing loan");
					System.out.println("press 3 for car loan");
					System.out.println("press 4 for gold loan");
					System.out.println("press 9 to go back to previous menu");
					int loanOption =scanner.nextInt();
				
					if (loanOption==1) {
						System.out.println("You Entered for Personal loan");
					} else if(loanOption==2) {
						System.out.println("You Entered for Housing loan");
					} else if(loanOption==3) {
						System.out.println("You Entered for Car loan");
					} else if(loanOption==4) {
						System.out.println("You Entered for Gold loan");
					} else if(loanOption==9) {
						break;
					} else { 
						System.out.println("Your Choice is wrong");
					}
				}
			} else if (bankTelecallerOption==2) {                                				//Saving Account section
				System.out.println("You entered for Savings account");
				while(true) {
					System.out.println("Please enter Saving Account Number:");
					long savingAccountNumber = scanner.nextLong();
					int savingAccountLength = String.valueOf(savingAccountNumber).length();
					if (savingAccountLength > 8 || savingAccountLength < 8){ // logic done in a wrong way?
						System.out.println("it's invalid account number\nAccount number Should be 8 digit");
						System.out.println("Press 0 to try again \nPresss 9 to go back to previous menu");
						int choice=scanner.nextInt();
						if (choice == 0) {
						
						} else if (choice == 9) {
							break;
						} else {
							System.out.println("Your choice is wrong");
						}
					}
					else {
						System.out.println("Thank you for account number");
						while (true) {
							System.out.println("press 1 for account balance");
							System.out.println("press 2 to speak customer care");
							System.out.println("press 9 to go back to previous menu");
							int savingAccountOption =scanner.nextInt();
				
							if (savingAccountOption==1) {
								System.out.println("You Saving Account Balance is: 94758387.00 ");
							} else if (savingAccountOption==2) {
								System.out.println("Hi, Welcome to abc Bank, I am your digital assistant.\nSelect your query from the list:\n"
										+"SavingAccount\tCurrentAccount\tLoan\tATM Card\tetc..");
							} else if (savingAccountOption==9) {
								break;
							} else { 
			    			System.out.println("Your Choice is wrong");
							}
						}
					}
					
				}	
				
				
				
			} else if (bankTelecallerOption==3) {                         						   //Current Account section
				System.out.println("You Entered for Current Account");
				while(true) {
					System.out.println("Please enter your Current Account Number:");
					long currentAccountNumber = scanner.nextLong();
					int currentAccountLength = String.valueOf(currentAccountNumber).length();
					if (currentAccountLength > 8 || currentAccountLength < 8){
						System.out.println("it's invalid account number\nAccount number Should be 8 digit");
						System.out.println("Press 0 to try again \nPresss 9 to go back to previous menu");
						int choice=scanner.nextInt();
						if (choice == 0) {
						
						} else if (choice == 9) {
							break;
						} else {
							System.out.println("Your choice is wrong");
						}
					} else {
						System.out.println("Thank you for Current Account Number");
						while (true) {
							System.out.println("press 1 for show account balance");
							System.out.println("press 2 to speak customer care");
							System.out.println("press 9 to go back to previous menu");
							int currentAccountOption =scanner.nextInt();
				
							if (currentAccountOption==1) {
								System.out.println("Your Current Account Balance is: 178480.00");
							} else if (currentAccountOption==2) {
								System.out.println("Hi, Welcome to abc Bank, I am your digital assistant.\nSelect your query from the list:\n"
										+"SavingAccount\tCurrentAccount\tLoan\tATM Card\tetc..");
							} else if (currentAccountOption==9) {
								break;
							} else { 
			    			System.out.println("Your Choice is wrong");
							}
						}
					}
				}
				
			} else if (bankTelecallerOption==4) {													//Card section
			   	while(true) {
			   		System.out.println("You entered for Cards");
			   		System.out.println("Press 1 for credit card");
			   		System.out.println("Press 2 for Debit card");
			   		int cardOption = scanner.nextInt();
			   		if (cardOption==1) {
			   			System.out.println("You entered for Credit Card");
			   			while(true) {
			   				System.out.println("Please enter your Credit Card Number:");
			   				long creditCardNumber = scanner.nextLong();
			   				long creditCardLength = String.valueOf(creditCardNumber).length();
			   				if (creditCardLength > 16 || creditCardLength < 16){
			   					System.out.println("it's invalid card number\nCard number Should be 16 digit");
			   					System.out.println("Press 0 to try again \nPresss 9 to go back to previous menu");
			   					int choice=scanner.nextInt();
			   					if (choice==0) {
							
			   					} else if (choice==9) {
			   						break;
			   					} else {
			   						System.out.println("Your choice is wrong");
			   					}
			   				} else {
			   						System.out.println("Thank you for Account Number");
			   						while (true) {
			   							System.out.println("press 1 for Block Your Card");
			   							System.out.println("press 2 to speak customer care");
			   							System.out.println("press 9 to go back to previous menu");
			   							int creditCardOption =scanner.nextInt();
				
			   							if (creditCardOption==1) {
			   								System.out.println("Your Card has been Blocked ");
			   							} else if (creditCardOption==2) {
			   								System.out.println("Hi, Welcome to abc Bank, I am your digital assistant.\nSelect your query from the list:\n"
			   										+"Card Overview \t Transaction History \t \t Statement \t Credit Card Payment \t etc..");
			   							} else if (creditCardOption==9) {
			   								break;
			   							} else { 
			   								System.out.println("Your Choice is wrong");
			   							}
			   						}
			   				}
			   			} 
					
			   		} else if(cardOption==2) {
			   				System.out.println("You Entered for Debit Card");
			   				while(true) {
			   					System.out.println("Please enter your Debit Card Number:");
			   					long debitCardNumber = scanner.nextLong();
			   					long debitCardLength = String.valueOf(debitCardNumber).length();
			   					if (debitCardLength > 16 || debitCardLength < 16){
			   						System.out.println("it's invalid card number\nCard number Should be 16 digit");
			   						System.out.println("Press 0 to try again \nPresss 9 to go back to previous menu");
			   						int choice=scanner.nextInt();
			   						if (choice==0) {
							
			   						} else if (choice==9) {
			   							break;
									} else {
										System.out.println("Your choice is wrong");
									}
			   					} else {
			   						System.out.println("Thank you for Account Number");
			   						while (true) {
			   							System.out.println("press 1 for Block Your Card");
			   							System.out.println("press 2 to speak customer care");
			   							System.out.println("press 9 to go back to previous menu");
			   							int debitCardOption =scanner.nextInt();
				
			   							if (debitCardOption==1) {
			   								System.out.println("Your Card has been Blocked ");
			   							} else if (debitCardOption==2) {
			   								System.out.println("Hi, Welcome to abc Bank, I am your digital assistant.\nSelect your query from the list:\n"
			   										+"Card Overview \t Transaction History \t \t Statement \t Debit Card Offers \t etc..");
			   							} else if (debitCardOption==9) {
			   								break;
			   							} else { 
			   								System.out.println("Your Choice is wrong");
			   							}
			   						}	
			   					}
			   				} 
					
			   		} else if (cardOption==0){
					
			   		}else if(cardOption==9) {
			   			break;
			   		} else {
			   			System.out.println("Invalid Card Options\nPlease choose correct option");
			   			System.out.println("Press 0 to try again \nPresss 9 to go back to previous menu");
			   		}
		
			   	}
				
			} else {
				System.out.println("Invalid Input");
			}
			
			
		}
		scanner.close();
	
	}	//main method close

} //class close
