package assignment.exceptionhandling.bankapp;

import java.util.InputMismatchException;
import java.util.Scanner;

import assignment.exceptionhandling.bankapp.account.Account;
import assignment.exceptionhandling.bankapp.bank.Bank;
import assignment.exceptionhandling.bankapp.exception.CustomException;

public class BankApp {

	private static BankApp bankApp;
	private Account account;
	private Bank bank;
	private Scanner scanner = new Scanner(System.in);

	public static BankApp getInstance() {
		if (bankApp == null) {
			bankApp = new BankApp();
		}
		return bankApp;
	}

	public void create() {
		String name = "";
		String address = "";
		double amount = 0.0;

		try {
			System.out.print(" Enter user name: ");
			name = scanner.nextLine();

			if (!name.matches("^[a-zA-Z]*$")) {
				throw new CustomException("InputMisMatchException has found");
			}

			System.out.print(" Enter user address: ");
			address = scanner.nextLine();

			System.out.print(" Enter initial deposite amount: ");
			amount = scanner.nextDouble();

			if (amount < 0) {
				throw new CustomException("InvalidMoneyException has found");
			}

		} catch (CustomException e) {
			System.out.println(e.getMessage());
			create();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());

		}

		account = new Account();
		account.setName(name);
		account.setAddress(address);
		account.setAccountNumber(102005678);
		account.setAmount(amount);
		
		bank=new Bank();
		bank.setAccount(account);
		init(account);

	}

	private void init(Account account) {
		try {
			System.out.println("\n 1 -> Deposite\n 2 -> Withdraw\n 3 -> Balance Enquary\n 0 -> Exit");
			System.out.print("\n Enter your option: ");
			byte option = scanner.nextByte();

			if (option == 1) {
				deposite(account);
			} else if (option == 2) {
				withdraw(account);
			} else if (option == 3) {
				balanceEnquary(account);
			} else if (option == 0) {
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			init(account);
		}

	}

	private void balanceEnquary(Account account) {
		try {
			System.out.println("\nAmount is: " + account.getAmount());
			System.out.println("\n 1 -> continue\n 0 -> exit");
			byte option = scanner.nextByte();

			if (option == 1) {
				init(account);
			} else if (option == 2) {
				System.exit(0);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			init(account);
		}

	}

	private void withdraw(Account account) {
		double amount = 0.0;
		try {
			System.out.print("\nEnter your amount:");
			amount = scanner.nextDouble();

			if (amount < 0) {
				throw new CustomException("InvalidMoneyException has found");
			}
			if (account.getAmount() < amount) {
				throw new CustomException("InsufficientBalanceException has found");
			}
			account.setAmount(account.getAmount() - amount);

			System.out.println("\n 1 -> continue\n 0 -> exit");
			byte option = scanner.nextByte();

			if (option == 1) {
				init(account);
			} else if (option == 2) {
				System.exit(0);
			}

		} catch (CustomException e) {
			System.out.println(e.getMessage());
			deposite(account);
		}
		init(account);

	}

	private void deposite(Account account) {
		double amount = 0.0;
		try {
			System.out.print("\nEnter your amount:");
			amount = scanner.nextDouble();
			if (amount < 0) {
				throw new CustomException("InvalidMoneyException has found");
			}

			account.setAmount(amount + account.getAmount());

			System.out.println("\n 1 -> continue\n 0 -> exit");
			byte option = scanner.nextByte();

			if (option == 1) {
				init(account);
			} else if (option == 2) {
				System.exit(0);
			}
		} catch (CustomException e) {
			System.out.println(e.getMessage());
			deposite(account);
		}
		init(account);
	}

	public static void main(String[] args) {
		BankApp.getInstance().create();
	}

}
