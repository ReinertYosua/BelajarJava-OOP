package Inheritance;

class BangunDatar {
	String name = "Bangun Datar";
	float sisiBD = 10;
	
	final float luas() {
		System.out.println("Hitung Luas");
		return 0;
	}
	
	float keliling() {
		System.out.println("Hitung Keliling");
		return 0;
	}
	
	public void message() {
		System.out.println("Ini pesan dari ParentClass");
		
	}
	//final method -> cannot overriding
}
