package Associaton;

public class TampilAssoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//One to Many
		Mahasiswa m1 = new Mahasiswa();
		m1.setNim("123");
		m1.setNama("Agung");
		Mahasiswa m2 = new Mahasiswa();
		m2.setNim("234");
		m2.setNama("Budi");
		Mahasiswa m3 = new Mahasiswa();
		m3.setNim("345");
		m3.setNama("Charlie");
		
		Dosen d1 = new Dosen();
		d1.setKodeDosen("D691");
		
		//hubungkan antara dosen dan mahasiswa
		d1.setNimMhs(m1.getNim(), m1.getNama());
		d1.setNimMhs(m2.getNim(), m2.getNama());
		d1.setNimMhs(m3.getNim(), m3.getNama());
		
		//tampilkan
		System.out.println("Kode Dosen: "+d1.getKodeDosen());
		System.out.println("mengajar mahasiswa");
		for (int i = 0; i < d1.getJumlahMhs(); i++) {
			System.out.println(" -"+d1.getNimMhs(i)+" - "+d1.getNamaMhs(i));
		}
		
		//OnetoOne
		Alamat a1 = new Alamat();
		a1.setJalan("DI Panjaitan");
		a1.setKota("Jakarta");
		
		m1.setJalanAlamat(a1.getJalan());
		m1.setKotaAlamat(a1.getKota());
		
		System.out.println("Alamat Mahsiswa "+m1.getNim());
		System.out.println(m1.getJalanAlamat()+" - "+m1.getKotaAlamat());
		
	}

}
