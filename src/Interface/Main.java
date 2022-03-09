package Interface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone iPhoneX = new Iphone();//deklarasi objek hp
		Phone SamsungGal9 = new Samsung();
		Phone iphone9 = new Iphone();
		
		
		UserPhone andi = new UserPhone(iphone9);
		
		Scanner inp = new Scanner(System.in);
		String pil;
		while(true) {
			System.out.println("1. Nyalakan HP");
			System.out.println("2. Matikan HP");
			System.out.println("3. Besarkan Volume");
			System.out.println("4. Turunkan Volume");
			System.out.println("0. Exit");
			pil = inp.nextLine();
			if(pil.equalsIgnoreCase("1")) {
				andi.nyalakanHP();
			}else if(pil.equalsIgnoreCase("2")) {
				andi.matikanHP();
			}else if(pil.equalsIgnoreCase("3")) {
				andi.perkerasSuara();
			}else if(pil.equalsIgnoreCase("4")) {
				andi.perkecilSuara();
			}else if(pil.equalsIgnoreCase("0")) {
				System.exit(0);
			}
		}
	}

}
