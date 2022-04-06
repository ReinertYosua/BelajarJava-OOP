package Multithreading;

public class DemoThreadRunnableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThreadRunnable R1 = new DemoThreadRunnable("Thread-1");
		DemoThreadRunnable R2 = new DemoThreadRunnable("Thread-2");
		DemoThreadRunnable R3 = new DemoThreadRunnable("Thread-3");
		R1.initialize();
		R2.initialize();
		R3.initialize();

	}

}
