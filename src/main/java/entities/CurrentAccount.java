package entities;

public class CurrentAccount extends Account {

	public CurrentAccount(Customer customer) {
		super(customer);
	}

	@Override
	public void printStatement() {
		System.out.println("=== Extrato entities.Conta Corrente ===");
		super.printCommonInfo();
	}
	
}
