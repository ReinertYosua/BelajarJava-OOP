package ProductConsumer;

public class Consumer extends Thread {
	private BankAccount account;


	public Consumer(BankAccount account) {
		super();
		this.account = account;
	}


	@Override
	public void run() {
		//asumsi $
		for (int i = 0; i < 5; i++) {
			synchronized (account) {
				account.withdraw(10);
			}
			
		}
	}
	
	
}
