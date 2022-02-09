package StaticVariable;

public class Animal {
	
	
	static String caraBergerak = "Berjalan";
	String caraBerkembangBiak = "Melahirkan";
	private String namaHewan;

	public Animal(String namaHewanBaru) {
		super();
		this.namaHewan = namaHewanBaru;
	}
	
	void show() {
		System.out.println("Nama Hewan: "+namaHewan);
	}
	
}

//Static Variable itu adalah sebuah variable yang shareable dimana, bisa diakses dan digunakan disemua objek
//dari class nya

//Static Variable sering disebut Variable Class

