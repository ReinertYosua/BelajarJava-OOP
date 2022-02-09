package Sorting;

public class Mahasiswa implements Comparable {
	private String nim, nama;
	private int umur;
	public Mahasiswa(String nim, String nama, int umur) {
		super();
		this.nim = nim;
		this.nama = nama;
		this.umur = umur;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getUmur() {
		return umur;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	

	@Override
	public String toString() {
		return "Mahasiswa [nim=" + nim + ", nama=" + nama + ", umur=" + umur + "]";
	}
	
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Mahasiswa m2 = (Mahasiswa) o ;
		//sorting umur / integer
		//return this.umur - m2.umur;
		return this.nim.compareTo(m2.nim);
	}
	
	
}
