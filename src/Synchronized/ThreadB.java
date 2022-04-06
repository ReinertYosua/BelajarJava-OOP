package Synchronized;

public class ThreadB extends Thread {
	DemoPrint p;

	public ThreadB(DemoPrint p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		p.display(4);//5-7
	}
	
	
}
