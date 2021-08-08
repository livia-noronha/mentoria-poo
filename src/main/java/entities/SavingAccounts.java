package entities;

public class SavingAccounts extends Account {

	public SavingAccounts(Customer customer) {
		super(customer);
	}

	@Override
	public void printStatement() {
		System.out.println("=== Extrato entities.Conta Poupan�a ===");
		super.printCommonInfo();
	}
}
