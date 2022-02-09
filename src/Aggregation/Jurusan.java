package Aggregation;

public class Jurusan {
	private String kode,nama;
	private Mahasiswa daftarMhs[] = new Mahasiswa[10];
	private int jumlahMhs;
	
	public Jurusan(String kode, String nama) {
		super(); //sifat constructor ini memberikan nilai langsung kedalam class
		this.kode = kode;
		this.nama = nama;
	}
	
	public String getKode() {
		return kode;
	}
	public String getNama() {
		return nama;
	}

	public void addMahasiswa(Mahasiswa m) {
		if(jumlahMhs < this.daftarMhs.length) {
			daftarMhs[jumlahMhs] = m;
			jumlahMhs++;
		}
	}
	
	public int getJumlahMhs() {
		return jumlahMhs;
	}
//	public Mahasiswa[] getDaftarMhs() {
//		return this.daftarMhs;
//	}
	
	public void tampilData() {
		System.out.println("Kode Jurusan: "+this.kode);
		System.out.println("Nama Jurusan: "+this.nama);
		for(Mahasiswa m: daftarMhs) {
			if(m!=null) {
				System.out.println(" -"+m.getNim()+" - "+m.getNama());
			}
		}
	}

	
	
	
	
}
