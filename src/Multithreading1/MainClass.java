package Multithreading1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PrintChar printA = new PrintChar('a', 100);
		//PrintChar printB = new PrintChar('b', 100);
		PrintNum printAngka = new PrintNum(100);
		
		//create thread
		//Thread t1 = new Thread(printA);
		//Thread t2 = new Thread(printB);
		Thread t3 = new Thread(printAngka);
		
		//start thread
		//t1.start();
		//t2.start();
		t3.start();
	}

}
