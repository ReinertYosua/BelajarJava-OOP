package object;

public class mainObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//namaclass namaobj = new namaclass();
		Player player1 = new Player(); //object1
		Player teman1 = new Player(); //object2
		
		//mengisi atribut player 1
		player1.name = "Galang";
		player1.speed = 120;
		player1.healthpoin = 0;
		
		//menjalankan method
		player1.run();
		if(player1.isDead()) {
			System.out.println("I am sorry game is over !");
		}
		System.out.println();
		//mengisi atribut player 2
		teman1.name = "Filbert";
		teman1.speed = 80;
		teman1.healthpoin = 90;
		
		teman1.run();
		if(teman1.isDead()) {
			System.out.println("I am sorry game is over !");
		}
		

	}

}
