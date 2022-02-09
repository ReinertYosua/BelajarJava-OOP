package Associaton;

public class Dosen {
	private String kodeDosen;
	private String[] nimMhs = new String[5];
	private String[] namaMhs = new String[5];
	private int jumlahMhs;
	
	public String getKodeDosen() {
		return kodeDosen;
	}
	public void setKodeDosen(String kodeDosen) {
		this.kodeDosen = kodeDosen;
	}
	public String getNimMhs(int indeks) {
		return nimMhs[indeks];
	}
	public String getNamaMhs(int indeks) {
		return namaMhs[indeks];
	}
	public void setNimMhs(String nimMhs, String namaMhs) {
		if(this.jumlahMhs<this.nimMhs.length) {
			this.nimMhs[jumlahMhs] = nimMhs;
			this.namaMhs[jumlahMhs] = namaMhs;
			jumlahMhs++;
		}
		
	}
	public int getJumlahMhs() {
		return this.jumlahMhs;
	}
	
	
}
