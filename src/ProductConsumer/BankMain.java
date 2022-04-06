package ProductConsumer;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount(100);
		
		int totalAccount = 4;
		
		Thread[] cust = new Thread[totalAccount];
		for (int i = 0; i < cust.length; i++) {
			if(i%2==0) {
				cust[i] = new Producer(acc);
			}else {
				cust[i] = new Consumer(acc);
			}
		}
		
		for (int i = 0; i < cust.length; i++) {
			cust[i].start();
		}
		
		for (int i = 0; i < cust.length; i++) {
			try {
				cust[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				System.out.println("Cust "+i+" has died");
			}
		}
		
		System.out.println("Saldo Akhir: "+acc.getBalance());
	}

}
