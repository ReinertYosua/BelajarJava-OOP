package GenericInheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Koleksi<Musisi> ks= new Koleksi<Musisi>();
		Musisi ms = new Musisi();
		
		ks.setData(ms);
		ks.nyanyiBersama();
		
		//wildcard digunakan untuk mengakses/membaca elemen 
		//dengan tipe data yang belum diketahui
		//sering dipakai pada data collection(Arraylist,List, Collection)
		//? -> menunjukkan tipe data nya ap
		//? extends type -> menunjukkan family dari turunan Type
	}

}
