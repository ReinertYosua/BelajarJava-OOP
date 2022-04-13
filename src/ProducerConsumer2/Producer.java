package ProducerConsumer2;

import java.util.Vector;

public class Producer extends Thread{
	private final Vector antrian;
	private final int size;
	
	public Producer(Vector a, int s) {
		super();
		this.antrian = a;
		this.size = s;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			try {
				System.out.println("Produced :"+i);
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public void produce(int i) throws InterruptedException {
		
		//menunggu antrian jika antrian full size dari producer
			while(antrian.size() == size) {
				synchronized (antrian) {
					System.out.println("Antrian full "+Thread.currentThread().getName()
							+" sedang tunggu "+antrian.size());
					
					antrian.wait();
				}
			}
			
			//producer memproduksi berkas/element dan notify(infokan) consumer untuk diconsumer
			synchronized (antrian) {
				antrian.add(i);//produce
				antrian.notifyAll();//notify to all consumer
			}
	}
	
	
}
