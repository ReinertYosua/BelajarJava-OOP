package object;

public class Player {
	
	//Definisi Atribut/Properties
	String name; //default
	int speed;
	int healthpoin;
	
	void run() { //fungsi untuk menampilkan nama player yang sedang run dan speed nya
		System.out.println(name+" is Running....");
		System.out.println("Speed: "+speed);
	}
	
	boolean isDead() { //fungsi untuk memeriksa jika darah kurang /sama dengan 0 is dead
		if(healthpoin<=0)return true;
		return false;
		
	}

}
