package Multithreading1;

public class PrintChar extends Thread{
	
	private char printChar;
	private int total;
	
	public PrintChar(char c, int t) {
		super();
		this.printChar = c;
		this.total = t;
	}

	@Override
	public void run() {
		for (int i = 0; i < total; i++) {
			System.out.print(printChar);
		}
	}
	
	
	
	
}
