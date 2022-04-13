package ProducerConsumer2;

import java.util.Vector;

public class ProducConsumeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector antrian = new Vector<>();
		int size = 4;
		
		Thread prod = new Thread(new Producer(antrian, size));
		Thread cons = new Thread(new Consumer(antrian, size));
		
		prod.start();
		cons.start();
	}

}
