package ProductConsumer;

public class Producer extends Thread {
	private BankAccount account;

	public Producer(BankAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		//asumsi $
		for (int i = 0; i < 5; i++) {
			synchronized (account) {
				account.deposit(10);
			}
		}
	}
	
	
}
