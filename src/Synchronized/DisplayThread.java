package Synchronized;

public class DisplayThread extends Thread {
	private String text;
	DemoPrint dp;
	public DisplayThread(String text, DemoPrint dp) {
		super();
		this.text = text;
		this.dp = dp;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		dp.displayTeks(text);
	}
	
	
	
	
}
