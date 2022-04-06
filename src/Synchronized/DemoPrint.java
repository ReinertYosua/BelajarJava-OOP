package Synchronized;

public class DemoPrint {
	 synchronized void display(int angka) {
		for (int i = 1; i <= 3; i++) {
			System.out.println(i+angka);
		}
	}
	 
	 void displayTeks(String teks) {
		 synchronized (this) {
			 System.out.println("Welcome "+teks);
			 try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Exiting "+teks);
		}
		 
	 }
}

//product&consumer ->implemen s
