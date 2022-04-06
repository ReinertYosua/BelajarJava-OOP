package Multithreading;

public class ExtendsThread extends Thread {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThread t1 = new ExtendsThread();//new Thread
		t1.start();

	}

}
