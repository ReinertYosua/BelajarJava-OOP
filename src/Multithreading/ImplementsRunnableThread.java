package Multithreading;

public class ImplementsRunnableThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread using implement is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsRunnableThread im1 = new ImplementsRunnableThread();
		Thread t1 = new Thread(im1);
		t1.start();

	}

	
}
