package Inheritance;

public class Tampil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BangunDatar bd = new BangunDatar();
			
			Persegi pg = new Persegi();
			Lingkaran lk= new Lingkaran();
			Segitiga sg = new Segitiga();
			
			pg.sisi = 50;
			pg.luas();
			pg.keliling();
			pg.info();
			
			lk.luas();
			lk.keliling();
			
			sg.alas=34;
			sg.tinggi=20;
			sg.luas();
			sg.keliling();
			
			//super -> akses kelas parent
			//this -> akses kelas sendiri
	}	

}
