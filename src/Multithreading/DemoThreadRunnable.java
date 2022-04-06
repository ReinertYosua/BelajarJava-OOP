package Multithreading;

public class DemoThreadRunnable implements Runnable{

	private Thread t;
	private String threadName;
	
	public DemoThreadRunnable(String nameThread) {
		super();
		this.threadName = nameThread;
		System.out.println("Creating: "+threadName);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running: "+threadName);
		try {
			for (int i = 10; i>0 ; i--) {
				System.out.println("Thread: "+threadName+", "+i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			System.out.println("Thread: "+threadName+" interrupted ");
		}
		System.out.println("Thread: "+threadName+" exiting");
	}
	
	public void initialize() {
		System.out.println("Starting: "+threadName);
		if(t==null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}

}
