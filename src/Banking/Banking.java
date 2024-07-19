package Banking;

import java.util.Scanner;

public class Banking {
	public String fromAcc;
	public String toAcc;
	public double amount;
	public String branch;
	public double accBalance = 100000;

	static Scanner scan = new Scanner(System.in);

	public void fundTransfer() {
		System.out.println("Transfer Amount : " + amount);

	}

	public void checkBalance() {
		System.out.println("Initial Balance :" + accBalance);
		if (accBalance >= amount) {
			accBalance = accBalance - amount;
			System.out.println("Balance amount :" + accBalance);
		} else {
			System.out.println("Insufficient Balance");
		}
	}

	public static void main(String[] args) {
		Banking transfer = new Banking();
		System.out.print("Enter the fromAcc num: ");
		transfer.fromAcc = scan.nextLine();
		System.out.print("Enter the toAcc num:");
		transfer.toAcc = scan.nextLine();
		System.out.print("Enter the Branch:");
		transfer.branch = scan.nextLine();
		System.out.print("Enter the amount :");
		transfer.amount = scan.nextDouble();
		transfer.fundTransfer();
		transfer.checkBalance();

	}
}
