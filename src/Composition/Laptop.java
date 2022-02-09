package Composition;

public class Laptop {
	private String kode,merk;
	private CPU cpu;
	private VGA vga;
	public Laptop(String kode, String merk) {
		super();
		this.kode = kode;
		this.merk = merk;
	}
	
	public void addKomponen(CPU cpu1, VGA vga1) {
		this.cpu = cpu1;
		this.vga = vga1;
	}
	
	public void displayData() {
		System.out.println("Laptop: "+this.merk+" - "+this.kode);
		System.out.println("Spesifikasinya :");
		System.out.println(" -"+cpu.getNama());
		System.out.println(" -"+vga.getNama()+"-"+vga.getKapasitas());
	}
}
