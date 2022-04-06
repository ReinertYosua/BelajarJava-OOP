package Synchronized;

public class ThreadA extends Thread{
	DemoPrint p;

	public ThreadA(DemoPrint p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		p.display(2);//3-5
	}
	
	
}
