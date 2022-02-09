package Inheritance;

public class Persegi extends BangunDatar {
	float sisi;
	
	public void setName(float sisi) {
		this.sisi = sisi;
	}

//	@Override
//	public float luas() {
//		// TODO Auto-generated method stub
//		//return super.luas();
//		float luas = sisi*sisi;
//		System.out.println("Luas Persegi: "+luas);
//		return luas;
//		
//	}

	@Override
	public float keliling() {
		// TODO Auto-generated method stub
		//return super.keliling();
		float keliling = 4 * super.sisiBD;
		System.out.println("Keliling Persegi: "+keliling);
		return keliling;
	}
	
	public void info() {
		super.message();
	}
	
	
	
}
