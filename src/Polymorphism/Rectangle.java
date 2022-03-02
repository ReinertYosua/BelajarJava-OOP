package Polymorphism;

public class Rectangle extends Shape {

	int lebar,panjang;
	
	public Rectangle(int lebar, int panjang) {
		super();
		this.lebar = lebar;
		this.panjang = panjang;
	}

	@Override
	float computeArea() {
		// TODO Auto-generated method stub
		float area = lebar*panjang;
		return area;
	}
	
	float computeArea(int sisi) {
		float luas = sisi*sisi;
		System.out.println(luas);
		return luas;
	}


	
}
