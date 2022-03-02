package CastingObject;

class Binatang{
	
	public void makan() {
		System.out.println("Binatang Makan");
	}
}

class Anjing extends Binatang {
	@Override
	public void makan() {
		System.out.println("Anjing makan tulang");
	}
	
	public void suaraAnjing() {
		System.out.println("Guk..guk");
	}
}

public class MainClass {

	public static void main(String[] args) {
		Binatang binatang1 = new Binatang();
		Anjing anjing1 = new Anjing();
		
		binatang1.makan();
		anjing1.makan();
		anjing1.suaraAnjing();
		
		//Upcasting
		//manual
//		System.out.println("Upcasting Manual...");
//		Binatang binatang2 = anjing1;
//		binatang2.makan();
		System.out.println("Upcasting Otomatis...");
		Binatang binatang2 = new Anjing();
		binatang2.makan();
		
		System.out.println("Downcasting Manual");
		Anjing anjing2 = (Anjing)binatang2;
		anjing2.makan();
		anjing2.suaraAnjing();
		
		System.out.println("Error ClassCastException");
//		Binatang binatang3 = new Binatang();
//		Anjing anjing3 = (Anjing)binatang3;
//		anjing3.makan();
//		anjing3.suaraAnjing();
		//semua binatang adalah anjing == error
		//anjing adalah binatang, tp tidak semua binatang adalah anjing
		
		Anjing anjing3 = new Anjing();
		Binatang binatang3 = anjing3;
		binatang3.makan();

		String nama = "Reinert";
		System.out.println(nama instanceof String);
	}

}
