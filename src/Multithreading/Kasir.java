package Multithreading;

public class Kasir implements Runnable{

	@Override
	public void run() {
		String namaThreadBaru = Thread.currentThread().getName();
		System.out.println("Kasir kedua: "+ namaThreadBaru);
		
		//kasir melayani pembeli
		for (int pembeli = 11; pembeli <= 20; pembeli++) {
			System.out.println(namaThreadBaru+" melayani pembeli nomor "+pembeli);
			
		}
		
	}

}
