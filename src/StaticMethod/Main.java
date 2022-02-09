package StaticMethod;

import java.util.ArrayList;

class Player {
	static int totalPlayer;
	static ArrayList<String> namaPlayer = new ArrayList<String>();
	
	private String name;

	public Player(String name) {
		super();
		this.name = name;
		Player.totalPlayer++;
		Player.namaPlayer.add(name);
	}
	
	void showName() {
		System.out.println("Name= "+name);
	}
	
	static void tampilTotalPlayer() {
		System.out.println(Player.totalPlayer);
	}
	
	static ArrayList<String> showListPlayer(){
		return Player.namaPlayer;
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player("Andi");
		Player player2 = new Player("Vieri");
		Player player3 = new Player("Filbert");
		Player player4 = new Player("Natalia");
		Player player5 = new Player("Putu Devi");
		Player player6 = new Player("Tesalonika");
		
		Player.tampilTotalPlayer();
		System.out.println(Player.showListPlayer());
		
//		player1.showName();
//		player2.showName();
//		player3.showName();

	}

}
