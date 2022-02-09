package Composition;

public class TampilComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop("X45", "Asus");
		l1.addKomponen(new CPU("Intel I5"), new VGA("Nvidia", 4));
		l1.displayData();
		
		Laptop l2 = new Laptop("CA1", "Acer");
		l2.addKomponen(new CPU("AMD A1"), new VGA("Ati Radeon", 6));
		l2.displayData();
	}

}
