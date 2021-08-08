package application;

import entities.Customer;
import entities.Account;
import entities.CurrentAccount;
import entities.SavingAccounts;

public class Program {

	public static void main(String[] args) {
		Customer livia = new Customer();
		livia.setNome("Livia");
		
		Account cc = new CurrentAccount(livia);
		Account poupanca = new SavingAccounts(livia);

		cc.deposit(100);
		cc.transfer(100, poupanca);
		
		cc.printStatement();
		poupanca.printStatement();
	}

}
