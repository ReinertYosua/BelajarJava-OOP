package Multithreading1;

public class PrintNum extends Thread {

	private int lastNum;

	public PrintNum(int n) {
		super();
		this.lastNum = n;
	}

	@Override
	public void run() {
		
		
		Thread t4 = new Thread(new PrintChar('c',100));
			for (int i = 1; i <= lastNum; i++) {
				
				try {
					
					if(i==50) {
						
						t4.start();
						t4.join();
					}
					System.out.print(" "+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				//Thread.yield();
			}
		
	}
	
	
	
}
