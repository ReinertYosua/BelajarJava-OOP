package Synchronized;

public class DemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoPrint dm = new DemoPrint();
		ThreadA th1 = new ThreadA(dm);
		ThreadB th2 = new ThreadB(dm);
		
		th1.start();
		th2.start();
		
		DisplayThread dt1 = new DisplayThread("Java", dm);
		DisplayThread dt2 = new DisplayThread("Thread", dm);
		dt1.start();
		dt2.start();
		
		
	}

}
