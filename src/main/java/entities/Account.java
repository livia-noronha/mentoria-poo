package entities;

import lombok.Getter;

@Getter

public abstract class Account implements IAccount {
	
	private static final int STANDARD_AGENCY = 1;
	private static int SEQUENTIAL = 1;


	protected int agency;
	protected int number;
	protected double balance;
	protected Customer customer;

	public Account(Customer customer) {
		this.agency = Account.STANDARD_AGENCY;
		this.number = SEQUENTIAL++;
		this.customer = customer;


	}


	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public void transfer(double amount, IAccount destinationAccount) {
		this.withdraw(amount);
		destinationAccount.deposit(amount);
	}

	@Override
	public void printStatement() {
		printCommonInfo();
	}

	protected void printCommonInfo() {
		System.out.printf("Titular: %s%n", this.customer.getNome());
		System.out.printf("Agencia: %d%n", this.agency);
		System.out.printf("Numero: %d%n", this.number);
		System.out.printf("Saldo: %.2f%n", this.balance);
	}
}
