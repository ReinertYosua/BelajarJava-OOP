package ProducerConsumer2;

import java.util.Vector;

public class Consumer implements Runnable {
	private final Vector antrian;
	private final int size;
	
	public Consumer(Vector antrian, int size) {
		super();
		this.antrian = antrian;
		this.size = size;
	}

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("Consumed: "+consume());
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	@SuppressWarnings("unused")
	private int consume() throws InterruptedException {
		while(antrian.isEmpty()) {
			synchronized (antrian) {
				System.out.println("Antrian kosong "+Thread.currentThread().getName()
						+" sedang menunggu "+antrian.size());
				antrian.wait();
			}
		}
		
		synchronized (antrian) {
			antrian.notifyAll();
			
			return (int) antrian.remove(0);
		}
	}
	
}
