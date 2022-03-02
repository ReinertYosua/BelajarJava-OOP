package Polymorphism;

public class Triangle extends Shape {

	int alas, tinggi;

	public Triangle(int alas, int tinggi) {
		super();
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	@Override
	float computeArea() {
		float area = (alas*tinggi)/2;
		return area;
	}
	
	
}
