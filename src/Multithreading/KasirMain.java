package Multithreading;

public class KasirMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String namaThreadUtama = Thread.currentThread().getName();
		System.out.println("Kasir utama: "+namaThreadUtama);
		
		Thread kasirnew = new Thread(new Kasir());
		kasirnew.start();
		
		for (int pembeli = 1; pembeli < 10; pembeli++) {
			System.out.println(namaThreadUtama+" melayani pembeli nomor "+pembeli);
		}
		
		
	}

}
