package Multithreading;

public class ThreadHelloImplements implements Runnable {
	private final String name;
	
	public ThreadHelloImplements(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println(name+":Hello ");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
