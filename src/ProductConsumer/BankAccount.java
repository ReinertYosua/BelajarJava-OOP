package ProductConsumer;

public class BankAccount {
	private double balance;
//producer & consumer
	public BankAccount(double bal) {
		super();
		this.balance = bal;
	}
	
	public void deposit(double amount) {
		double temp = balance;
		temp = temp+amount;
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("After deposit balance: "+temp);
		balance = temp;
	}
	
	public void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("Saldo gk cukup");
			return;
		}
		double temp = balance;
		temp = temp-amount;
		try {
			Thread.sleep(200);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("After withdraw balance: "+temp);
		balance = temp;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
