package Aggregation;

public class TampilAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jurusan j1 = new Jurusan("TI", "Teknik Informatika");
		
		Mahasiswa m1 = new Mahasiswa();
		m1.setNim("123");
		m1.setNama("Budi");
		Mahasiswa m2 = new Mahasiswa();
		m2.setNim("234");
		m2.setNama("Gaji");
		Mahasiswa m3 = new Mahasiswa();
		m3.setNim("345");
		m3.setNama("Binus");
		
		j1.addMahasiswa(m1);
		j1.addMahasiswa(m2);
		j1.addMahasiswa(m3);
		j1.tampilData();
		
//		System.out.println("Kode Jurusan: "+j1.getKode());
//		System.out.println("Nama Jurusan: "+j1.getNama());
//		System.out.println("List mahasiswa:");
//		Mahasiswa[] listMhs = j1.getDaftarMhs();
//		for(Mahasiswa m : listMhs) {
//			if(m!=null) {
//				System.out.println(" -"+m.getNim()+" - "+m.getNama());
//			}
//		}
	}

}
