package Polymorphism;

public class MainComputeArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		Rectangle r = new Rectangle(2, 3);
		Triangle t = new Triangle(2, 3);
		
		s.computeArea();
		System.out.println(r.computeArea());
		System.out.println(t.computeArea());
		r.computeArea(2);
	}

}
